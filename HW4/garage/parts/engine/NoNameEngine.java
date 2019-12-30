package garage.parts.engine;

import garage.parts.engine.api.FuelType;
import garage.parts.engine.api.IEngine;

public class NoNameEngine implements IEngine {
    private final String id;
    private final int capacity;
    private FuelType fuelType;
    boolean running = true;

    public NoNameEngine(int capacity, FuelType fuelType, String id) {
        this.id = id;
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean start() {
        if(!running) {
            running=true;
            System.out.println("Машина заведена");
        }
        else {
            System.out.println("Не могу завести уже заведенный мотор");
        }
        return running;
    }

    @Override
    public boolean stop() {
        if (running){
            System.out.println("Машина заглушена");
        }
        else {
            System.out.println("Не могу остановить уже остановленный мотор");
        }
        return running;

    }

    @Override
    public double running() {
        System.out.println("Ем бензин не в себя");
        return 0;
    }

}
