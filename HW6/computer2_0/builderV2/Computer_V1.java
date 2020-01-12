package computer2_0.builderV2;

import computer2_0.parts.cpu.api.CPUStandard;
import computer2_0.parts.hdd.api.HDDStandard;
import computer2_0.parts.ram.api.RAMStandard;

public class Computer_V1 {

    private final CPUStandard cpuStandard;
    private final RAMStandard ramStandard;
    private final HDDStandard hddStandard;


    public Computer_V1(CPUStandard cpuStandard, RAMStandard ramStandard, HDDStandard hddStandard) {
        this.cpuStandard = cpuStandard;
        this.ramStandard = ramStandard;
        this.hddStandard = hddStandard;
    }

    public CPUStandard getCPUStandard() {
        return cpuStandard;
    }

    public RAMStandard getRAMStandard() {
        return ramStandard;
    }

    public HDDStandard getHDDStandard() {
        return hddStandard;
    }

    @Override
    public String toString() {
        return "Computer_V1{" +
                "CPU=" + cpuStandard +
                ", RAM=" + ramStandard +
                ", HDD=" + hddStandard +
                '}';
    }
}