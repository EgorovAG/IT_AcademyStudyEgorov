package computer.standart;

import computer.standart.api.IStandard;
import computer.standart.cpu.api.CPUStandard;
import computer.standart.cpu.api.ICPUStandard;
import computer.standart.hdd.api.HDDStandard;
import computer.standart.hdd.api.IHDDStandard;
import computer.standart.ram.api.IRAMStandard;
import computer.standart.ram.api.RAMStandard;

public class Standard  {
    private CPUStandard cpuStandard;
    private HDDStandard hddStandard;
    private RAMStandard ramStandard;

    public Standard(CPUStandard cpuStandard, HDDStandard hddStandard, RAMStandard ramStandard) {
        this.cpuStandard = cpuStandard;
        this.hddStandard = hddStandard;
        this.ramStandard = ramStandard;
    }


}
