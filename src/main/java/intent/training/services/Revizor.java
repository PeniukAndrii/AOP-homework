package intent.training.services;

import org.springframework.stereotype.Component;

@Component
public class Revizor {
    public String revision(Checker checker){
        if(checker.getStatus().equals("not ready")){
            checker.prepareToTakeOff();
            return "not ready";
        }
        else return "ready";
    }
}
