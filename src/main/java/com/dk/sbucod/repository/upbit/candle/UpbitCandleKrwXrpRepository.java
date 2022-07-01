package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwXrp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwXrpRepository extends JpaRepository<UpbitCandleKrwXrp, Long>, UpbitCandleCommonJpaInterface {
}
