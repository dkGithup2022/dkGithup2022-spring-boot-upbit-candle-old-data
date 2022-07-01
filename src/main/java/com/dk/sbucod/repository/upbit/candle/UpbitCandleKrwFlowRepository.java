package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwFlow;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwSol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwFlowRepository extends JpaRepository<UpbitCandleKrwFlow, Long>, UpbitCandleCommonJpaInterface {
}
