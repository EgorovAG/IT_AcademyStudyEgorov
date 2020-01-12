package computer2_0.builderV1;

import computer2_0.parts.cpu.api.CPUStandard;
import computer2_0.parts.hdd.api.HDDStandard;
import computer2_0.parts.ram.api.RAMStandard;

public class Computer_V2 extends ComputerBuilder {

    @Override
    void buildCPU() {
        computer.setCPU(CPUStandard.ZEN);
    }

    @Override
    void buildRAM() {
        computer.setRAM(RAMStandard.DDR2);

    }

    @Override
    void buildHDD() {
        computer.setHDD(HDDStandard.SATA);

    }
}
