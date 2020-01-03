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
            System.out.println("category fits and can use this car ");
            if (key.getKey().equals(numberOfKey)) {
                System.out.println("the door lock is open");
                o = true;
            } else {
                System.out.println("the key doesn't fit ");
            }
        }
         else {
            System.out.println("category doesn't fits and doesn't can use this car");
        }
    }

    @Override
    public void start() {
        if (o)
        System.out.println("started the car");
        s=true;

    }

    @Override
    public void drivesCar() {

        if (s) {
            System.out.println("driver drives a car");
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

