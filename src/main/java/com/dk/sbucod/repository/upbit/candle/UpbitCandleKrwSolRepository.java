package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwSol;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwStx;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwSolRepository extends JpaRepository<UpbitCandleKrwSol, Long>, UpbitCandleCommonJpaInterface {
}
