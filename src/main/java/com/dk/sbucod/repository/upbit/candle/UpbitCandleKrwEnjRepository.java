package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwEnj;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwSand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwEnjRepository extends JpaRepository<UpbitCandleKrwEnj, Long>, UpbitCandleCommonJpaInterface {
}
