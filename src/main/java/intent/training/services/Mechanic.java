package intent.training.services;

import org.springframework.stereotype.Component;

@Component
public class Mechanic {
    public boolean check(Checker checker){
        return checker.engineExist();
    }
}
