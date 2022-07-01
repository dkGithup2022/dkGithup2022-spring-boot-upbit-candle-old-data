package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwBtg;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwFlow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwBtgRepository extends JpaRepository<UpbitCandleKrwBtg, Long>, UpbitCandleCommonJpaInterface {
}
