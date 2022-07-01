package com.dk.sbucod.entity.UpbitCandle;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpbitCandleKey implements Serializable {
    private Long timestamp;
    private String market;
}
