package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwPla;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwSrm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwSrmRepository extends JpaRepository<UpbitCandleKrwSrm, Long>, UpbitCandleCommonJpaInterface {
}
