package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwEth;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwSand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwSandRepository extends JpaRepository<UpbitCandleKrwSand, Long>, UpbitCandleCommonJpaInterface {
}
