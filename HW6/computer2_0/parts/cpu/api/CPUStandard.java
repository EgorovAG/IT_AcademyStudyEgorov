package computer2_0.parts.cpu.api;

import computer2_0.parts.api.IStandards;

public enum CPUStandard implements IStandards {
    ZEN,
    XEON;

    @Override
    public IStandards[] getStandard() {
        return CPUStandard.values();
    }
}


