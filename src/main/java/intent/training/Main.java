package intent.training;

import intent.training.models.*;
import intent.training.services.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("intent.training");

        Revizor revizor = (Revizor) context.getBean("revizor");
        Mechanic mechanic = (Mechanic) context.getBean("mechanic");
        FuelLoader fuelLoader = (FuelLoader) context.getBean("fuelLoader");
        Instructor instructor = (Instructor) context.getBean("instructor");

        Airplane airplane = (Airplane) context.getBean("airplane");
        Helicopter helicopter = (Helicopter) context.getBean("helicopter");
        MotorHangGlider motorHangGlider = (MotorHangGlider) context.getBean("motorHangGlider");
        Glider glider = (Glider) context.getBean("glider");
        Paraglider paraglider = (Paraglider) context.getBean("paraglider");
        HotAirBalloon hotAirBalloon = (HotAirBalloon) context.getBean("hotAirBalloon");

        System.out.println("---------Engine Devices---------");
        revizor.revision(airplane);
        mechanic.check(airplane);
        fuelLoader.loadFuel(airplane, airplane.getGas(), airplane.getMaxLevelOfFuel());
        System.out.println("----------------------------");
        revizor.revision(helicopter);
        mechanic.check(helicopter);
        fuelLoader.loadFuel(helicopter, helicopter.getGas(), helicopter.getMaxLevelOfFuel());
        System.out.println("----------------------------");
        revizor.revision(motorHangGlider);
        mechanic.check(motorHangGlider);
        fuelLoader.loadFuel(motorHangGlider, motorHangGlider.getGas(), motorHangGlider.getMaxLevelOfFuel());
        System.out.println("----------------------------");
        revizor.revision(glider);
        instructor.instruction(glider);
        System.out.println("----------------------------");
        revizor.revision(paraglider);
        mechanic.check(paraglider);
        fuelLoader.loadFuel(paraglider, paraglider.getHelium(), paraglider.getMaxLevelOfHelium());
        System.out.println("----------------------------");
        revizor.revision(hotAirBalloon);
        mechanic.check(hotAirBalloon);
        fuelLoader.loadFuelInBalloon(hotAirBalloon, hotAirBalloon.getGas(), hotAirBalloon.getMaxLevelOfGas(), hotAirBalloon.getWater(), hotAirBalloon.getMaxLevelOfWater());
        System.out.println("----------------------------");

    }
}
