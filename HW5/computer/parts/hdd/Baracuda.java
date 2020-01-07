package computer.parts.hdd;

import computer.parts.api.IParts;
import computer.parts.api.IStandards;

public class Baracuda implements IParts {
    private IStandards HDDStandard;

    public Baracuda(IStandards HDDStandard) {
        this.HDDStandard = HDDStandard;
    }

    @Override
    public IStandards getParts() {
        return HDDStandard ;
    }

}
