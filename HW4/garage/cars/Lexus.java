package garage.cars;

import garage.carLicense.api.ICarLicense;
import garage.carLicense.api.License;
import garage.cars.api.ACars;
import garage.parts.engine.api.IEngine;
import garage.parts.key.api.IKey;
import garage.parts.lock.api.ILock;
import garage.parts.wheel.api.IWheel;

public class Lexus extends ACars {

    private String model;
    private IEngine engine;
    private final ILock lock;
    private IWheel wheel;
    private ICarLicense carLicense;

    public Lexus(String model, IEngine engine, ILock lock, IWheel wheel, ICarLicense carLicense){
        this.model = model;
        this.engine = engine;
        this.lock = lock;
        this.wheel = wheel;
        this.carLicense = carLicense;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return "Lexus";
    }

    @Override
    public boolean open(IKey key) {
        return lock.open(key);
    }
}


