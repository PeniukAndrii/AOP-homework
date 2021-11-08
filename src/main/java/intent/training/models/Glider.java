package intent.training.models;

import intent.training.services.Checker;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Glider implements Checker {
    private final boolean engine = false;

    @Override
    public String getStatus() {
        System.out.println(getClass().getSimpleName() + " is not ready... starting prepareToTakeOff()");
        return "not ready";
    }

    @Override
    public void prepareToTakeOff() {
        System.out.println("Checking some staff...");
    }

    @Override
    public boolean engineExist() {
        return engine;
    }
}
