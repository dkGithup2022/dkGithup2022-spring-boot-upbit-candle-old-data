package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwBtc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwBtcRepository extends JpaRepository<UpbitCandleKrwBtc, Long>, UpbitCandleCommonJpaInterface {
}
