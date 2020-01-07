package computer;

import computer.parts.api.IParts;
import computer.parts.api.IStandards;
import computer.parts.cpu.AMD;
import computer.parts.cpu.api.CPUStandard;
import computer.parts.hdd.Baracuda;
import computer.parts.hdd.api.HDDStandard;
import computer.parts.ram.Kingston;
import computer.parts.ram.api.RAMStandard;

public class ComputerMain {
    public static void main(String[] args) {

        IParts[] parts = new IParts[3];
        IStandards[] standards = new IStandards[3];

        standards[0] = CPUStandard.XEON;
        standards[1] = HDDStandard.SAS;
        standards[2] = RAMStandard.DDR1;

        parts[0]= new AMD(CPUStandard.XEON);
        parts[1] = new Baracuda(HDDStandard.SAS);
        parts[2] = new Kingston(RAMStandard.DDR1);

        Computer computer = new Computer(parts, standards);
        computer.start();

    }
}
