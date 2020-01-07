package computer;


import computer.parts.api.IParts;
import computer.parts.api.IStandards;

import java.util.Arrays;

public class Computer {
    private IParts[] parts;
    private IStandards[] standards;


    Computer(IParts[] parts, IStandards[] standards) {
        this.parts = parts;
        this.standards = standards;
    }


    public void start(){
        if(standards[0] == parts[0].getParts()){
            System.out.println("CPU is true");
        }
        else
            System.out.println("CPU is false");

        if (standards[1]== parts[1].getParts()){
            System.out.println("HDD is true");
        }
        else
            System.out.println("HDD is false");

        if (standards[2]==parts[2].getParts()){
            System.out.println("RAM is true");
        }
        else
            System.out.println("RAM is false");
    }
}
