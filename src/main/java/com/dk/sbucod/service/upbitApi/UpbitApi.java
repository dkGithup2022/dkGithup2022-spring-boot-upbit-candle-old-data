package com.dk.sbucod.service.upbitApi;

import com.dk.sbucod.EmptyCandleException;
import com.dk.sbucod.entity.AbstractCandle;
import com.dk.sbucod.entity.UpbitCandle.CandleFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UpbitApi {
    private final ObjectMapper objectMapper;

    public AbstractCandle callCandleByDate(String market, String date) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String baseUrl = "https://api.upbit.com/v1/candles/days";
        String marketParam = "?market="+ market;
        String to = "&to="+ date + " 00:00:00";
        String suffix = "&count=1";
        String url = baseUrl+marketParam+to+suffix;
        log.info("\n*********************************************\nurl : {}", url  );
        ResponseEntity<String> response =restTemplate.getForEntity(url,String.class);
        List<AbstractCandle> candles = Arrays.asList(objectMapper.readValue(response.getBody(),AbstractCandle[].class));
        if(candles.size()==0){
            log.error("empty return ");
            throw new EmptyCandleException();
        }
        log.info("candle : {}" , candles.get(0));
        return CandleFactory.of(candles.get(0));
    }
}
