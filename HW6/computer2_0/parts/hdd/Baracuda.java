package computer2_0.parts.hdd;

import computer2_0.parts.api.IParts;
import computer2_0.parts.api.IStandards;

public class Baracuda implements IParts {
    private boolean i = false;
    private IStandards hddStandard;

    public Baracuda(IStandards hddStandard) {
        this.hddStandard = hddStandard;
    }

    @Override
    public IStandards getParts() {
        return hddStandard;
    }

    @Override
    public boolean test(IStandards[] standards) {
        for (IStandards st: standards) {
            if (hddStandard == st) {
                i=true;
            }
        }
        if (i) {
            System.out.println("CPU is true");
        }
        else {
            System.out.println("CPU is false");
        }
        return false;
    }
}
