package computer.parts.cpu.api;

import computer.parts.api.IStandards;

public enum CPUStandard implements IStandards {
    ZEN,
    XEON;

    @Override
    public IStandards[] getStandard() {
        return CPUStandard.values();
    }
}


