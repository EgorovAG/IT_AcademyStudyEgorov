package computer2_0;

import computer2_0.parts.api.IParts;
import computer2_0.parts.api.IStandards;
import computer2_0.parts.cpu.AMD;
import computer2_0.parts.hdd.Baracuda;
import computer2_0.parts.ram.Kingston;

public class Computer {
    private IParts[] parts;
    private IStandards[] standards;

    Computer(IParts[] parts, IStandards[] standards) {
        this.parts = parts;
        this.standards = standards;
    }

    public void start(){
        for (IParts part:parts) {

            if(part.getClass() == AMD.class){
                if(parts[0].test(standards)){
                }
            }
            else

            if(part.getClass() == Baracuda.class){
                if(parts[1].test(standards)){
                }
            }
            else

            if(part.getClass() == Kingston.class){
                if(parts[2].test(standards)){
                }
            }
        }


    }
}
