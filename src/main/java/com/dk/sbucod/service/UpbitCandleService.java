package com.dk.sbucod.service;


import com.dk.sbucod.entity.AbstractCandle;
import com.dk.sbucod.entity.UpbitCandle.candle.*;
import com.dk.sbucod.repository.upbit.candle.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpbitCandleService {
    private final CandleRepositoryPicker candleRepositoryPicker;
    public void save(AbstractCandle candle){
        UpbitCandleCommonJpaInterface repo = candleRepositoryPicker.pickRepository(candle);
        repo.save(candle);
    }
}

@Component
@RequiredArgsConstructor
class CandleRepositoryPicker {
    private final UpbitCandleKrwBtcRepository upbitCandleKrwBtcRepository;
    private final UpbitCandleKrwAdaRepository upbitCandleKrwAdaRepository;
    private final UpbitCandleKrwAtomRepository upbitCandleKrwAtomRepository;
    private final UpbitCandleKrwAvaxRepository upbitCandleKrwAvaxRepository;
    private final UpbitCandleKrwAxsRepository upbitCandleKrwAxsRepository;
    private final UpbitCandleKrwBatRepository upbitCandleKrwBatRepository;
    private final UpbitCandleKrwBchRepository upbitCandleKrwBchRepository;
    private final UpbitCandleKrwBtgRepository upbitCandleKrwBtgRepository;
    private final UpbitCandleKrwChzRepository upbitCandleKrwChzRepository;
    private final UpbitCandleKrwDogeRepository upbitCandleKrwDogeRepository;
    private final UpbitCandleKrwDotRepository upbitCandleKrwDotRepository;
    private final UpbitCandleKrwEnjRepository upbitCandleKrwEnjRepository;
    private final UpbitCandleKrwEtcRepository upbitCandleKrwEtcRepository;
    private final UpbitCandleKrwEthRepository upbitCandleKrwEthRepository;
    private final UpbitCandleKrwFlowRepository upbitCandleKrwFlowRepository;
    private final UpbitCandleKrwManaRepository upbitCandleKrwManaRepository;
    private final UpbitCandleKrwMaticRepository upbitCandleKrwMaticRepository;
    private final UpbitCandleKrwPlaRepository upbitCandleKrwPlaRepository;
    private final UpbitCandleKrwSandRepository upbitCandleKrwSandRepository;
    private final UpbitCandleKrwSolRepository upbitCandleKrwSolRepository;
    private final UpbitCandleKrwSrmRepository upbitCandleKrwSrmRepository;
    private final UpbitCandleKrwStxRepository upbitCandleKrwStxRepository;
    private final UpbitCandleKrwXrpRepository upbitCandleKrwXrpRepository;

    public UpbitCandleCommonJpaInterface pickRepository(AbstractCandle candle){

        switch(candle.getMarket()){
            case "KRW-BTC":
                return upbitCandleKrwBtcRepository;
            case "KRW-ADA":
                return upbitCandleKrwAdaRepository;
            case "KRW-ATOM":
                return upbitCandleKrwAtomRepository;
            case "KRW-AVAX":
                return upbitCandleKrwAvaxRepository;
            case "KRW-AXS":
                return upbitCandleKrwAxsRepository;
            case "KRW-BAT":
                return upbitCandleKrwBatRepository;
            case "KRW-BCH":
                return upbitCandleKrwBchRepository;
            case "KRW-BTG":
                return upbitCandleKrwBtgRepository;
            case "KRW-CHZ":
                return upbitCandleKrwChzRepository;
            case "KRW-DOGE":
                return upbitCandleKrwDogeRepository;
            case "KRW-DOT":
                return upbitCandleKrwDotRepository;
            case "KRW-ENJ":
                return upbitCandleKrwEnjRepository;
            case "KRW-ETC":
                return upbitCandleKrwEtcRepository;
            case "KRW-ETH":
                return upbitCandleKrwEthRepository;
            case "KRW-FLOW":
                return upbitCandleKrwFlowRepository;
            case "KRW-MANA":
                return upbitCandleKrwManaRepository;
            case "KRW-MATIC":
                return upbitCandleKrwMaticRepository;
            case "KRW-PLA":
                return upbitCandleKrwPlaRepository;
            case "KRW-SAND":
                return upbitCandleKrwSandRepository;
            case "KRW-SOL":
                return upbitCandleKrwSolRepository;
            case "KRW-SRM":
                return upbitCandleKrwSrmRepository;
            case "KRW-STX":
                return upbitCandleKrwStxRepository;
            case "KRW-XRP":
                return upbitCandleKrwXrpRepository;
            default:
                throw new IllegalStateException("illigal market" + candle.getMarket() );
        }
    }




}
