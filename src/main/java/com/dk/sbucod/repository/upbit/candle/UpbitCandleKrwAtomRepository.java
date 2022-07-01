package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwAtom;
import com.dk.sbucod.entity.UpbitCandle.candle.UpbitCandleKrwEth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitCandleKrwAtomRepository extends JpaRepository<UpbitCandleKrwAtom, Long>, UpbitCandleCommonJpaInterface {
}
