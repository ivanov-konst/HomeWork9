package BUS;

import Other.QuantitySeats;
import engines.Engine;

public class Bus {

    public Engine engine;
    public QuantitySeats QuantitySeats;
    public Bus (Engine engine, QuantitySeats QuantitySeats) {
        this.engine = engine;
        this.QuantitySeats = QuantitySeats;

    }
}
