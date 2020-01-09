package computer2_0.parts.cpu;

import computer2_0.parts.api.IParts;
import computer2_0.parts.api.IStandards;

public class AMD implements IParts {
    private IStandards CPUStandard;

    public AMD(IStandards CPUStandard) {
        this.CPUStandard = CPUStandard;
    }

    @Override
    public IStandards getParts() {
        return CPUStandard;
    }

    @Override
    public boolean test(IStandards[] standards) {
        boolean i = false;
        for (IStandards st : standards) {
            if (CPUStandard == st) {
                i = true;
            }
        }
            if (i) {
                System.out.println("CPU is true");
            }
            else {
                System.out.println("CPU is false");
            }
        return i;
    }
}


