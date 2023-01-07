import BUS.Bus;
import Beepers.Beeper;
import Beepers.Horn;
import Beepers.MagicSound;
import CarWheels.CarWheel;
import CarWheels.CarWheel_R_20;
import Cars.Kalina;
import Cars.Priora;
import Cars.lambo;
import Other.QuantitySeats;
import Other.Seats_48;
import engines.*;

public class Main {
    public static void printSeparator () {
        System.out.println("+=+=+=+=+=+=++=+=+=+=+=+=+");
    }
    public static void main(String[] args) {
// создаем машину
        Beeper horn = new Horn();
        EngineV12 engineV12 = new EngineV12();
        CarWheel CarWheel_R_20 = new CarWheel_R_20();

        lambo lambo = new lambo(horn, engineV12, CarWheel_R_20);

        Beeper magicSound = new MagicSound();
        Engine engineV6 = new EngineV6();
        Priora priora = new Priora(magicSound, engineV6, CarWheel_R_20);


        Engine Engine_2_0 = new Engine_2_0();
        Kalina Kalina = new Kalina(magicSound, Engine_2_0, CarWheel_R_20);

        Engine EngineV12ForBus = new EngineV12ForBus();
        QuantitySeats Seats_48 = new Seats_48();
        Bus Bus = new Bus (EngineV12ForBus, Seats_48);

        System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.engine.getSpeed());
        System.out.println(lambo.CarWheel.getCost());
        System.out.println(lambo.getCost());
        printSeparator ();
        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpeed());
        System.out.println(priora.CarWheel.getCost());
        System.out.println(priora.downShifting());
        printSeparator ();
        System.out.println(Kalina.beeper.makeSound());
        System.out.println(Kalina.engine.getSpeed());
        System.out.println(Kalina.CarWheel.getCost());
        printSeparator ();
        System.out.println(Bus.engine.getSpeed());
        System.out.println(Bus.QuantitySeats.Quantity());

      //  ArrayList<Car> transporter = new ArrayList();
      //  transporter.add(lambo);
      //  transporter.add(priora);
      //  transporter.forEach((Car car) -> {
      //     System.out.println(car.beeper.makeSound());
      //     System.out.println(car.engine.getSpeed());
      //  });
    }
}