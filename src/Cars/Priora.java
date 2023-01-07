package Cars;

import Beepers.Beeper;
import CarWheels.CarWheel;
import engines.Engine;

public class Priora extends Car{
    public Priora(Beeper beeper, Engine engine, CarWheel CarWheel) {
        super(beeper, engine, CarWheel);
    }
    public String downShifting() {
        return "Занижена";
    }
}
