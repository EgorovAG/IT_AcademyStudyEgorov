package computer2_0;

import computer2_0.parts.api.IParts;
import computer2_0.parts.api.IStandards;
import computer2_0.parts.cpu.AMD;
import computer2_0.parts.cpu.api.CPUStandard;
import computer2_0.parts.hdd.Baracuda;
import computer2_0.parts.hdd.api.HDDStandard;
import computer2_0.parts.ram.Kingston;
import computer2_0.parts.ram.api.RAMStandard;

public class ComputerMain {
    public static void main(String[] args) {

        IParts[] parts = new IParts[3];
        IStandards[] standards = new IStandards[3];

        standards[2] = CPUStandard.XEON;
        standards[0] = HDDStandard.SAS;
        standards[1] = RAMStandard.DDR1;

        parts[0]= new AMD(CPUStandard.ZEN);
        parts[1] = new Baracuda(HDDStandard.SAS);
        parts[2] = new Kingston(RAMStandard.DDR1);

        Computer computer = new Computer(parts, standards);
        computer.start();


    }
}
