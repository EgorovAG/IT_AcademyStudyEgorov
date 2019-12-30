package garage.parts.engine;

import garage.parts.engine.api.FuelType;
import garage.parts.engine.api.IChangebleFuelType;

public class MercedesEngine implements IChangebleFuelType {
    private final String id;
    private final int capacity;
    private FuelType fuelType;
    private boolean running = false;
    private int volFuel=5;

    public MercedesEngine(int capacity, FuelType fuelType, String id){

        this.capacity = capacity;
        this.fuelType = fuelType;
        this.id = id;

    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public boolean start(){
        if(!running){
            running=true;
            System.out.println("Машина заведена");
        } else {
            System.out.println("Не могу завести уже заведенный мотор");
        }
        return running;
    }
    public boolean stop(){
        if(running){
            System.out.println("Машина заглушена");

        } else {
            System.out.println("Не могу остановить уже остановленный мотор");
        }
        return running;
    }
    public int running(){
        if(running){
            int mileage = 0;
            for (int i = 0; i <volFuel ; i++) {
                mileage++;
            }
            System.out.println("Закончился бензин и машина заглохла и проехала всего %/");;
        }

    }
}
