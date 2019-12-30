package garage.driver;

import garage.driver.api.Category;
import garage.driver.api.IDriver;

public class Driver implements IDriver {
    private int experience;
    private Category category;

    public Driver(int experience, Category category) {
        this.experience = experience;
        this.category = category;
    }

    @Override
    public void open() {
        System.out.println("Водитель открыл машину");
    }

    @Override
    public void startCar() {
        System.out.println("Водитель завел машину");
    }

    @Override
    public void close() {
        System.out.println("Водитель закрыл машину");
    }

    @Override
    public void drive() {
        System.out.println("Водитель едет на машине");
    }

    @Override
    public void takePassenger() {
        System.out.println("Посадил пассажира");
    }
}
