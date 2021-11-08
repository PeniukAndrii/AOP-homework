package intent.training.models;

import intent.training.services.Checker;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Paraglider implements Checker {
    private final boolean engine = true;
    private int helium = getRandomNumber(15,0)+1;
    private final int maxLevelOfHelium = 15;

    @Override
    public String getStatus() {
        if(helium!=maxLevelOfHelium){
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
        System.out.println("prepareToTakeOff()- Done, please start loadFuel() in FuelLoader");
    }

    @Override
    public void loadFuel(int helium) {
        this.helium = helium;
    }

    @Override
    public boolean engineExist() {
        return engine;
    }
}
