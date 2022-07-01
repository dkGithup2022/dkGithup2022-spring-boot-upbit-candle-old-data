package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwAda;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwSol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwAdaRepository extends JpaRepository<UpbitCandleKrwAda, Long>, UpbitCandleCommonJpaInterface {
}
