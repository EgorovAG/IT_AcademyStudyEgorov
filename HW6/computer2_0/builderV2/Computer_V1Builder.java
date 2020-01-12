package computer2_0.builderV2;

import computer2_0.parts.cpu.api.CPUStandard;
import computer2_0.parts.hdd.api.HDDStandard;
import computer2_0.parts.ram.api.RAMStandard;

public class Computer_V1Builder implements Builder {

    private CPUStandard cpuStandard;
    private RAMStandard ramStandard;
    private HDDStandard hddStandard;

    @Override
    public void setCPU(CPUStandard cpuStandard) {
        this.cpuStandard = cpuStandard;
    }

    @Override
    public void setHDD(HDDStandard hddStandard) {
        this.hddStandard = hddStandard;
    }

    @Override
    public void setRAM(RAMStandard ramStandard) {
        this.ramStandard = ramStandard;
    }

    public Computer_V1 getResult(){
        return new Computer_V1(cpuStandard, ramStandard, hddStandard);
    }
}
