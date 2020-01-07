package computer.parts.ram.api;

import computer.parts.api.IStandards;

public enum RAMStandard implements IStandards {
    DDR1,
    DDR2;

    @Override
    public IStandards[] getStandard() {
        return RAMStandard.values();
    }
}
