package computer.parts.ram;

import computer.parts.api.IParts;
import computer.parts.api.IStandards;

public class Kingston implements IParts {
    private IStandards RAMStandard;

    public Kingston(IStandards RAMStandard) {
        this.RAMStandard = RAMStandard;
    }

    @Override
    public IStandards getParts() {
        return RAMStandard ;
    }


}
