package com.dk.sbucod.repository.upbit.candle;

import com.dk.sbucod.entity.AbstractCandle;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UpbitCandleCommonJpaInterface {
    void save(AbstractCandle candle);
    AbstractCandle findByTimestamp(long timestamp);
}
