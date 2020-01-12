package computer2_0.parts.hdd.api;

import computer2_0.parts.api.IStandards;

public enum HDDStandard implements IStandards {
    SATA,
    SAS;

    @Override
    public IStandards[] getStandard() {
        return HDDStandard.values();
    }
}
