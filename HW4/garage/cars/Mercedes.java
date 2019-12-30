package garage.cars;

import garage.cars.api.ACars;
import garage.parts.engine.api.IEngine;
import garage.parts.wheel.api.IWheel;

public class Mercedes extends ACars{
    private String model;
    private IEngine engine;
    private IWheel wheel;

    public Mercedes(String model, IEngine engine, IWheel wheel){
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;

    }



    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }
}
