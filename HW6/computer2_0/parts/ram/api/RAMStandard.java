package computer2_0.parts.ram.api;

import computer2_0.parts.api.IStandards;

public enum RAMStandard implements IStandards {
    DDR1,
    DDR2;

    @Override
    public IStandards[] getStandard() {
        return RAMStandard.values();
    }
}
