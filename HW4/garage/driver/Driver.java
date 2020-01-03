package garage.Driver;

import garage.Driver.api.IDriver;

import garage.carLicense.api.ICarLicense;
import garage.carLicense.api.License;
import garage.parts.key.api.IKey;


public class Driver implements IDriver {
    private final String numberOfKey;
    private License license;
    private boolean o,s;
    private int passenger;

    public Driver(License license, String numberOfKey ) {
        this.numberOfKey = numberOfKey;
        this.license = license;
    }

    @Override
    public void close(IKey key) {
        if(key.getKey().equals(numberOfKey)){
            System.out.println("Car is close");
        }
        else {
            System.out.println("the key doesn't fit");
        }
    }

    @Override
    public void open(ICarLicense carLicense, IKey key) {
        if(carLicense.getCarLicense().equals(license)) {
            System.out.println("категория соответствует и можно использовать машину ");
            if (key.getKey().equals(numberOfKey)) {
                System.out.println("дверной замок открыт");
                o = true;
            } else {
                System.out.println("ключ не соответствует ");
            }
        }
         else {
            System.out.println("категоирия не соответствует и автомобиль не может использоваться");
        }
    }

    @Override
    public void start() {
        if (o)
        System.out.println("автомобиль заведен");
        s=true;

    }

    @Override
    public void drivesCar() {

        if (s) {
            System.out.println("водитель управляет движущимся автомобилем");
        }
    }

    @Override
    public void takePassenger(int passengers) {
        if (passengers<4) {
            System.out.println("взяли " + passengers + " пассажиров");
        }
        else
            System.out.println("больше 3-х пассажиров не беру");
        }
    }

