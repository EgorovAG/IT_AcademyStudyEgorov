package garage.carLicense;

import garage.carLicense.api.License;
import garage.carLicense.api.ICarLicense;

public class CarLicense implements ICarLicense {

    private final License carLicense;

    public CarLicense(License carLicense) {
        this.carLicense = carLicense;
    }

    @Override
    public License getCarLicense() {
        return carLicense;
    }
}


