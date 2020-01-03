package garage.Driver.api;

import garage.carLicense.CarLicense;
import garage.carLicense.api.ICarLicense;
import garage.parts.key.api.IKey;

public interface IDriver {
    void close(IKey key);
    void open(ICarLicense carLicense, IKey key);
    void start();
    void drivesCar();
    void takePassenger(int passengers);


}
