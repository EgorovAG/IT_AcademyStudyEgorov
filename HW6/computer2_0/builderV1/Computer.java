package computer2_0.builderV1;

import computer2_0.parts.cpu.api.CPUStandard;
import computer2_0.parts.hdd.api.HDDStandard;
import computer2_0.parts.ram.api.RAMStandard;

public class Computer {

    private CPUStandard cpuStandard;
    private RAMStandard ramStandard;
    private HDDStandard hddStandard;

    public void setCPU(CPUStandard cpuStandard) {
        this.cpuStandard = cpuStandard;
    }

    public void setRAM(RAMStandard ramStandard) {
        this.ramStandard = ramStandard;
    }

    public void setHDD(HDDStandard hddStandard) {
        this.hddStandard = hddStandard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU=" + cpuStandard +
                ", RAM=" + ramStandard +
                ", HDD=" + hddStandard +
                '}';
    }
}
