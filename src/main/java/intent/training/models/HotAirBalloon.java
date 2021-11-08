package intent.training.models;

import intent.training.services.Checker;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class HotAirBalloon implements Checker {
    private final boolean engine = true;
    private int gas = getRandomNumber(10,0)+1;
    private int water = getRandomNumber(10,0)+1;
    private final int maxLevelOfGas = 10;
    private final int maxLevelOfWater = 10;

    @Override
    public String getStatus() {
        if(gas!=maxLevelOfGas&& water!=maxLevelOfWater){
            System.out.println(getClass().getSimpleName() + " is not ready... starting prepareToTakeOff()");
            return "not ready";
        }
        else {
            System.out.println(getClass().getSimpleName() + " is ready for take off, GL");
            return "Ready";
        }
    }

    @Override
    public void prepareToTakeOff() {
        System.out.println("Checking all staff...");
        System.out.println("prepareToTakeOff()- Done, please start loadFuelInBalloon() in FuelLoader");
    }

    @Override
    public void loadFuelInBalloon(int water, int gas) {
        this.gas = gas;
        this.water = water;
    }

    @Override
    public boolean engineExist() {
        return engine;
    }

}
