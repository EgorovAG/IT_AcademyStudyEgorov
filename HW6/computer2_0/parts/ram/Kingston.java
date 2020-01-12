package computer2_0.parts.ram;

import computer2_0.parts.api.IParts;
import computer2_0.parts.api.IStandards;

public class Kingston implements IParts {

    private boolean i = false;
    private IStandards ramStandard;

    public Kingston(IStandards ramStandard) {
        this.ramStandard = ramStandard;
    }

    @Override
    public IStandards getParts() {
        return ramStandard;
    }

    @Override
    public boolean test(IStandards[] standards) {
        for (IStandards st: standards) {
            if (ramStandard == st) {
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
