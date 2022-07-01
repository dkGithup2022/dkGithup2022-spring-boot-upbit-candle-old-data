package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwAxs;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwSol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwAxsRepository extends JpaRepository<UpbitCandleKrwAxs, Long>, UpbitCandleCommonJpaInterface {
}
