package computer2_0.builderV2;

import computer2_0.parts.cpu.api.CPUStandard;
import computer2_0.parts.hdd.api.HDDStandard;
import computer2_0.parts.ram.api.RAMStandard;

public class Director {

    public void constructComputer_V1(Builder builder){
        builder.setCPU(CPUStandard.XEON);
        builder.setHDD(HDDStandard.SATA);
        builder.setRAM(RAMStandard.DDR1);
    }

    public void constructComputer_V2(Builder builder){
        builder.setCPU(CPUStandard.ZEN);
        builder.setHDD(HDDStandard.SAS);
        builder.setRAM(RAMStandard.DDR2);
    }
}
