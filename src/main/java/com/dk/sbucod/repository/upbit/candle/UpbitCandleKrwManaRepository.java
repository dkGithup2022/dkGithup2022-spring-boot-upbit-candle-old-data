package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwMana;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwXrp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwManaRepository extends JpaRepository<UpbitCandleKrwMana, Long>, UpbitCandleCommonJpaInterface {
}
