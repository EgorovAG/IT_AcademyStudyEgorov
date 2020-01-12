package computer2_0.builderV1;

import computer2_0.parts.cpu.api.CPUStandard;
import computer2_0.parts.hdd.api.HDDStandard;
import computer2_0.parts.ram.api.RAMStandard;

public class Computer_V1 extends ComputerBuilder {

    @Override
    void buildCPU() {
        computer.setCPU(CPUStandard.XEON);
    }

    @Override
    void buildRAM() {
        computer.setRAM(RAMStandard.DDR1);
    }

    @Override
    void buildHDD() {
        computer.setHDD(HDDStandard.SAS);
    }

}
