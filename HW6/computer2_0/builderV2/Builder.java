package computer2_0.builderV2;

import computer2_0.parts.cpu.api.CPUStandard;
import computer2_0.parts.hdd.api.HDDStandard;
import computer2_0.parts.ram.api.RAMStandard;

public interface Builder {
    
    void setCPU(CPUStandard cpuStandard);
    void setHDD(HDDStandard hddStandard);
    void setRAM(RAMStandard ramStandard);

}
