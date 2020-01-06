package computer.parts.cpu;

import computer.parts.cpu.api.AMDStand;
import computer.parts.cpu.api.IAMD;
import computer.standart.cpu.api.CPUStandard;

public class AMD implements IAMD {
    private AMDStand amdStand;
    private CPUStandard cpuStandard;

    @Override
    public boolean test() {
        return String.valueOf(amdStand).equals(String.valueOf(cpuStandard));
    }
}
