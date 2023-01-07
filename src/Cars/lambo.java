package Cars;

import Beepers.Beeper;
import CarWheels.CarWheel;
import engines.Engine;

public class lambo extends Car {
    public lambo(Beeper beeper, Engine engine, CarWheel CarWheel) {
        super(beeper, engine, CarWheel);
    }

    public String getCost() {
        return "999999999999";
    }
}
