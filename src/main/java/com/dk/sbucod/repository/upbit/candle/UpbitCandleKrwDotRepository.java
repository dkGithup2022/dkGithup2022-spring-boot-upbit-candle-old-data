package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwDot;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwSol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwDotRepository extends JpaRepository<UpbitCandleKrwDot, Long>, UpbitCandleCommonJpaInterface {
}
