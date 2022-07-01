package com.dk.sbucod.entity.UpbitCandle;


import com.dk.sbucod.entity.AbstractCandle;
import com.dk.sbucod.entity.UpbitCandle.candle.*;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CandleFactory {
    private final static ModelMapper modelMapper = new ModelMapper();

    public static AbstractCandle of(AbstractCandle candle) {
        String market = candle.getMarket();
        switch (market) {
            case "KRW-BTC":
                return modelMapper.map(candle, UpbitCandleKrwBtc.class);
            case "KRW-ADA":
                return modelMapper.map(candle, UpbitCandleKrwAda.class);
            case "KRW-ATOM":
                return modelMapper.map(candle, UpbitCandleKrwAtom.class);
            case "KRW-AVAX":
                return modelMapper.map(candle, UpbitCandleKrwAvax.class);
            case "KRW-AXS":
                return modelMapper.map(candle, UpbitCandleKrwAvax.class);
            case "KRW-BAT":
                return modelMapper.map(candle, UpbitCandleKrwBat.class);
            case "KRW-BCH":
                return modelMapper.map(candle, UpbitCandleKrwBch.class);
            case "KRW-BTG":
                return modelMapper.map(candle, UpbitCandleKrwBtg.class);
            case "KRW-CHZ":
                return modelMapper.map(candle, UpbitCandleKrwChz.class);
            case "KRW-DOGE":
                return modelMapper.map(candle, UpbitCandleKrwDoge.class);
            case "KRW-DOT":
                return modelMapper.map(candle, UpbitCandleKrwDot.class);
            case "KRW-ENJ":
                return modelMapper.map(candle,UpbitCandleKrwEnj.class);
            case "KRW-ETC":
                return modelMapper.map(candle, UpbitCandleKrwEtc.class);
            case "KRW-ETH":
                return modelMapper.map(candle, UpbitCandleKrwEth.class);
            case "KRW-FLOW":
                return modelMapper.map(candle, UpbitCandleKrwFlow.class);
            case "KRW-MANA":
                return modelMapper.map(candle, UpbitCandleKrwMana.class);
            case "KRW-MATIC":
                return modelMapper.map(candle, UpbitCandleKrwMatic.class);
            case "KRW-PLA":
                return modelMapper.map(candle, UpbitCandleKrwPla.class);
            case "KRW-SAND":
                return modelMapper.map(candle,UpbitCandleKrwSand.class);
            case "KRW-SOL":
                return modelMapper.map(candle, UpbitCandleKrwSol.class);
            case "KRW-SRM":
                return modelMapper.map(candle, UpbitCandleKrwSrm.class);
            case "KRW-STX":
                return modelMapper.map(candle,UpbitCandleKrwStx.class);
            case "KRW-XRP":
                return modelMapper.map(candle,UpbitCandleKrwXrp.class);

            default:
                throw new IllegalArgumentException("wrong market string :"+ candle);
        }
    }
}
