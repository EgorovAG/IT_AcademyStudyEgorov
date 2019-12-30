package garage.parts.wheel;

import garage.parts.wheel.api.IWheel;
import garage.parts.wheel.api.NameWheel;
import garage.parts.wheel.api.Radius;
import garage.parts.wheel.api.Season;

public class Wheel implements IWheel {

    private NameWheel nameWheel;
    private Radius radius;
    private Season season;

    public Wheel(NameWheel nameWheel, Radius radius, Season season) {
        this.nameWheel = nameWheel;
        this.radius = radius;
        this.season = season;
    }

    @Override
    public NameWheel getNameWheel() {
        return nameWheel;
    }

    @Override
    public Radius getRadius() {
        return radius;
    }

    @Override
    public Season getSeason() {
        return season;
    }

    @Override
    public void installWheels() {

    }
}
