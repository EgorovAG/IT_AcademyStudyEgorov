package garage;

import garage.Driver.Driver;
import garage.carLicense.api.ICarLicense;
import garage.carLicense.api.License;
import garage.cars.Lexus;
import garage.cars.Mercedes;
import garage.carLicense.CarLicense;
import garage.parts.engine.api.IEngine;
import garage.parts.key.Key;
import garage.parts.lock.Lock;
import garage.parts.key.api.IKey;
import garage.parts.lock.api.ILock;
import garage.parts.engine.Engine;
import garage.parts.engine.api.FuelType;
import garage.parts.wheel.Wheel;
import garage.parts.wheel.api.NameWheel;
import garage.parts.wheel.api.Season;

public class GarageMain {
    public static void main(String[] args) {
        ILock lock = new Lock("asd");
        IKey key = new Key("asd");
        IKey key2 = new Key("asdы");
        IEngine engine = new Engine(3000, FuelType.PETROL, "QWE_123_578");
        ICarLicense carLicense = new CarLicense(License.B);

        Driver driver = new Driver(License.B, "asd");

        Mercedes mercedes1 = new Mercedes("CLS", engine, lock,
                new Wheel("R21", NameWheel.CONTINENTAL, Season.WINTER), carLicense);

        Lexus lexus = new Lexus("RX350",
                new Engine(3500,FuelType.PETROL, "ASD_123_45"), lock,
                new Wheel("R19", NameWheel.PIRELLI, Season.ALLSEASON), carLicense);


//        System.out.println("Открываю замок " + lock.open(key));
//        System.out.println("Открываю замок " + lock.open(key2));
//        System.out.println("Открываю машину " + mercedes1.open(key));
//        System.out.println("Открываю машину " + mercedes1.open(key2));

//        "проверяем категорию водителя и авто; ключи водителя и замок; и открываем авто"
        driver.open(carLicense, key);
        mercedes1.open(key);
//        "водитель заводит машину, если предыдущий метод true"
        driver.start();
        engine.start();
//       "взял пассажиров"
        driver.takePassenger(3);
//       "водитель едет на машине, если метод start() true"
        driver.drivesCar();
        engine.running();


    }
}
