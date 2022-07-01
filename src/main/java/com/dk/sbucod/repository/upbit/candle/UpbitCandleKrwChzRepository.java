package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwChz;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwMana;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwChzRepository extends JpaRepository<UpbitCandleKrwChz, Long>, UpbitCandleCommonJpaInterface {
}
