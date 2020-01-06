package computer;

import computer.parts.Parts;
import computer.parts.cpu.api.AMDStand;
import computer.parts.hdd.api.BaracudaStand;
import computer.parts.ram.api.KingstonStand;
import computer.standart.Standard;
import computer.standart.cpu.api.CPUStandard;
import computer.standart.hdd.api.HDDStandard;
import computer.standart.ram.api.RAMStandard;

public class ComputerMain {
    public static void main(String[] args) {

        Computer computer = new Computer(new Parts(AMDStand.ZEN, BaracudaStand.SATA, KingstonStand.DDR1),
                new Standard(CPUStandard.XEON, HDDStandard.SAS, RAMStandard.DDR1));
        computer.start();

    }
}
