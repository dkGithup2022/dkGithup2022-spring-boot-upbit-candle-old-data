package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwBtc;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwEth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwEthRepository extends JpaRepository<UpbitCandleKrwEth, Long>, UpbitCandleCommonJpaInterface {
}
