package computer2_0.parts.hdd;

import computer2_0.parts.api.IParts;
import computer2_0.parts.api.IStandards;

public class Baracuda implements IParts {
    private boolean i = false;
    private IStandards HDDStandard;

    public Baracuda(IStandards HDDStandard) {
        this.HDDStandard = HDDStandard;
    }

    @Override
    public IStandards getParts() {
        return HDDStandard ;
    }

    @Override
    public boolean test(IStandards[] standards) {
        for (IStandards st: standards) {
            if (HDDStandard == st) {
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
