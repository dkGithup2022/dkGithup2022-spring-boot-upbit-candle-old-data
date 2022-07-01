package com.dk.sbucod.task;


import com.dk.sbucod.EmptyCandleException;
import com.dk.sbucod.constants.UpbitCoinCode;
import com.dk.sbucod.entity.AbstractCandle;
import com.dk.sbucod.service.UpbitCandleService;
import com.dk.sbucod.service.upbitApi.UpbitApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class InitialTask implements ApplicationRunner {
    private final UpbitApi upbitApi;
    private final UpbitCandleService upbitCandleService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("hello world");

        for(UpbitCoinCode code : UpbitCoinCode.values()) {
            saveCandles(code);
        }


    }

    private void saveCandles(UpbitCoinCode code) throws InterruptedException, JsonProcessingException, EmptyCandleException {
        String c = code.toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long nowTimestmp = System.currentTimeMillis();
        System.out.println(sdf.format(nowTimestmp));

        for (int i = 0; i < 1500; i++) {
            nowTimestmp -= 1000 * 60 * 60 * 24;
            System.out.println("iter " + i + "| long : " + nowTimestmp + " | " + sdf.format(nowTimestmp));
            Thread.sleep(1000);
            try {
                AbstractCandle candle = upbitApi.callCandleByDate(c, sdf.format(nowTimestmp));
                String str = candle.toString();
                System.out.println(str);
                upbitCandleService.save(candle);
            }catch (EmptyCandleException e){
                log.error("error error on {} , date : {}" , code,nowTimestmp);
                break;
            }

        }
    }
}
