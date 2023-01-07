package Cars;

import Beepers.Beeper;
import CarWheels.CarWheel;
import engines.Engine;

public abstract class Car {

    public CarWheel CarWheel;
    public Beeper beeper;
    public Engine engine;

    public Car(Beeper beeper, Engine engine, CarWheel CarWheel) {
       this.beeper = beeper;
       this.engine = engine;
       this.CarWheel = CarWheel;

  }



}
