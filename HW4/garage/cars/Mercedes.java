package garage.cars;

import garage.carLicense.api.ICarLicense;
import garage.cars.api.ACars;
import garage.parts.key.api.IKey;
import garage.parts.lock.api.ILock;
import garage.parts.engine.api.IEngine;
import garage.parts.wheel.api.IWheel;

public class Mercedes extends ACars{
    private String model;
    private IEngine engine;
    private final ILock lock;
    private IWheel wheel;
    private ICarLicense license;

    public Mercedes(String model, IEngine engine, ILock lock, IWheel wheel, ICarLicense carLicense){
        this.model = model;
        this.engine = engine;
        this.lock = lock;
        this.wheel = wheel;
        this.license = carLicense;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }

    @Override
    public boolean open(IKey key) {
        return lock.open(key);
    }
}
