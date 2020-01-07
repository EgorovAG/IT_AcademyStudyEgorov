package computer.parts.hdd.api;

import computer.parts.api.IStandards;

public enum HDDStandard implements IStandards {
    SATA,
    SAS;

    @Override
    public IStandards[] getStandard() {
        return HDDStandard.values();
    }
}
