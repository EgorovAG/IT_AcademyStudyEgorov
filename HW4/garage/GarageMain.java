package garage;

import garage.cars.Mercedes;
import garage.driver.Driver;
import garage.driver.api.Category;
import garage.parts.engine.MercedesEngine;
import garage.parts.engine.NoNameEngine;
import garage.parts.engine.api.FuelType;
import garage.parts.wheel.Wheel;
import garage.parts.wheel.api.NameWheel;
import garage.parts.wheel.api.Radius;
import garage.parts.wheel.api.Season;

public class GarageMain {
    public static void main(String[] args) {


        Mercedes mercedes1 = new Mercedes("CLS", new MercedesEngine(2000, FuelType.DIESEL,
                "QWE_255_335"), new Wheel(NameWheel.CONTINENTAL, Radius.R19, Season.WINTER));
        Mercedes mercedes2 = new Mercedes("CLS", new NoNameEngine(1500, FuelType.PETROL,
                "QWE_135"), new Wheel(NameWheel.DUNLOP, Radius.R17,Season.ALLSEASON));
        Driver driver = new Driver(5, Category.B);



        }
    }

