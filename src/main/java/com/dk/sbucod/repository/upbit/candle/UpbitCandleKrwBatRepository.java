package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwBat;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwSol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwBatRepository extends JpaRepository<UpbitCandleKrwBat, Long>, UpbitCandleCommonJpaInterface {
}
