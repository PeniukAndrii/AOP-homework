package intent.training.models;

import intent.training.services.Checker;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Airship implements Checker {
    private boolean engine = true;

    @Override
    public String getStatus() {
        return null;
    }

    @Override
    public void prepareToTakeOff() {

    }

}
