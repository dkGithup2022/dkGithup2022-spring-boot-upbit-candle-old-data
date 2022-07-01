package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwBch;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwMatic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwMaticRepository extends JpaRepository<UpbitCandleKrwMatic, Long>, UpbitCandleCommonJpaInterface {
}
