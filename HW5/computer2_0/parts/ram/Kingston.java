package computer2_0.parts.ram;

import computer2_0.parts.api.IParts;
import computer2_0.parts.api.IStandards;

public class Kingston implements IParts {

    private boolean i = false;
    private IStandards RAMStandard;

    public Kingston(IStandards RAMStandard) {
        this.RAMStandard = RAMStandard;
    }

    @Override
    public IStandards getParts() {
        return RAMStandard ;
    }

    @Override
    public boolean test(IStandards[] standards) {
        for (IStandards st: standards) {
            if (RAMStandard == st) {
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
