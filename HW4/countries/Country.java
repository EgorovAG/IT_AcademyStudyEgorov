package countries;

import countries.api.ICountry;

public enum Country implements ICountry {
    GERMANY(357385, 83_019_200),
    FRANCE(640679, 65_060_692),
    ITALY(301340, 60_588_366),
    SPAIN(505990, 46_714_585),
    ENGLAND(133396, 53_012_085),
    PORTUGAL(92225, 10_600_000),
    AUSTRIA(83879, 8_923_507),
    SWITZERLAND(41285, 8_558_785),
    BELGIUM(30528, 11_480_397),
    HOLLAND(541543, 17_393_790);

    private int areaCountry;
    private int population;

    Country(int areaCountry, int population) {
        this.areaCountry = areaCountry;
        this.population = population;
    }

    @Override
    public int getAreaCountry() {
        return areaCountry;
    }

    @Override
    public int getPopulation() { return population; }

    public static int compare() {
        if (Country.GERMANY.compareTo(Country.FRANCE) < 0)
            return -1;
        else if (Country.GERMANY.compareTo(Country.FRANCE) == 0)
            return 0;
        else
            return 1;
    }
}












