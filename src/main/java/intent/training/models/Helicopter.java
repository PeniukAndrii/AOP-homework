package intent.training.models;

import intent.training.services.Checker;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Helicopter implements Checker {
    private final boolean engine = true;
    private int gas = getRandomNumber(5,0)+1;
    private final int maxLevelOfFuel = 5;

    @Override
    public String getStatus() {
        if(gas!=maxLevelOfFuel){
            System.out.println(getClass().getSimpleName() + " is not ready... start running prepareToTakeOff()");
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
        System.out.println("prepareToTakeOff()- Done, please start loadFuel() in FuelLoader");
    }

    @Override
    public void loadFuel(int gas) {
        this.gas = gas;
    }

    @Override
    public boolean engineExist() {
        return engine;
    }

}
