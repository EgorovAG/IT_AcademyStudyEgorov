package garage.parts.wheel;

import garage.parts.wheel.api.IChangebleNameWheel;
import garage.parts.wheel.api.IChangebleSeason;
import garage.parts.wheel.api.NameWheel;
import garage.parts.wheel.api.Season;

public class Wheel implements IChangebleNameWheel, IChangebleSeason {
    String radius;
    NameWheel nameWheel;
    Season season;

    public Wheel(String radius, NameWheel nameWheel, Season season) {
        this.radius = radius;
        this.nameWheel = nameWheel;
        this.season = season;
    }

    @Override
    public void setNameWheel(NameWheel nameWheel) {

    }

    @Override
    public void setSeason(Season season) {

    }

    @Override
    public String getRadius() {
        return null;
    }

    @Override
    public Season getSeason() {
        return null;
    }

    @Override
    public NameWheel getNameWheel() {
        return null;
    }


}
