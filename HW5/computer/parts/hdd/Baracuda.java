package computer.parts.hdd;

import computer.parts.hdd.api.IBaracuda;
import computer.standart.hdd.api.HDDStandard;

public class Baracuda implements IBaracuda {
    private Baracuda baracuda;
    private HDDStandard hddStandard;

    @Override
    public boolean test() {
        return String.valueOf(baracuda).equals(String.valueOf(hddStandard));
    }
}
