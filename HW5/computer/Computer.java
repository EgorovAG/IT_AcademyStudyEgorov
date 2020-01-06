package computer;

import computer.parts.Parts;
import computer.parts.cpu.AMD;
import computer.parts.hdd.Baracuda;
import computer.parts.ram.Kingston;
import computer.standart.Standard;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

public class Computer {
    private Parts parts;
    private Standard standard;


    public Computer(Parts parts, Standard standard) {
        this.parts = parts;
        this.standard = standard;
    }


    public void start(){
        AMD amd = new AMD();
        System.out.println("CPU is "+ amd.test());
        Baracuda baracuda = new Baracuda();
        System.out.println("HDD is " + baracuda.test());
        Kingston kingston = new Kingston();
        System.out.println("RAM is "+ kingston.test());

    }


}
