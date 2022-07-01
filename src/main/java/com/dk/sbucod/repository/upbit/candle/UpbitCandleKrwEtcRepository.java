package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwDot;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwEtc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwEtcRepository extends JpaRepository<UpbitCandleKrwEtc, Long>, UpbitCandleCommonJpaInterface {
}
