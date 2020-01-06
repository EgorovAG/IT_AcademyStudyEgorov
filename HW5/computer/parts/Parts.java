package computer.parts;


import computer.parts.cpu.api.AMDStand;
import computer.parts.hdd.api.BaracudaStand;
import computer.parts.ram.api.KingstonStand;

public class Parts {
    private AMDStand amdStand;
    private BaracudaStand baracuda;
    private KingstonStand kingston;

    public Parts(AMDStand amdStand, BaracudaStand baracuda, KingstonStand kingston) {
        this.amdStand = amdStand;
        this.baracuda = baracuda;
        this.kingston = kingston;
    }

}
