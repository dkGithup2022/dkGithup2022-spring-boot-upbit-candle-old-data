package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwEth;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwPla;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwPlaRepository extends JpaRepository<UpbitCandleKrwPla, Long>, UpbitCandleCommonJpaInterface {
}
