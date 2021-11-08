package intent.training.services;

import org.springframework.stereotype.Component;

@Component
public class Instructor {
    public boolean instruction(Checker checker){
        return checker.engineExist();
    }
}
