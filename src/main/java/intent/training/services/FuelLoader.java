package intent.training.services;


import org.springframework.stereotype.Component;

@Component
public class FuelLoader {
    public void loadFuel(Checker checker,int levelNow, int maxLevel){
        checker.loadFuel(maxLevel-levelNow);
    }
    public void loadFuelInBalloon(Checker checker, int levelOfWaterNow, int levelOfWaterMax,int levelOfGas, int levelOfGasMax){
        checker.loadFuelInBalloon(levelOfWaterMax-levelOfWaterNow,levelOfGasMax-levelOfGas);
    }
}
