package computer.parts.cpu;

import computer.parts.api.IParts;
import computer.parts.api.IStandards;

public class AMD implements IParts {
    private IStandards CPUStandard;

    public AMD(IStandards CPUStandard) {
        this.CPUStandard = CPUStandard;
    }

    @Override
    public IStandards getParts() {
        return CPUStandard ;
    }
}
