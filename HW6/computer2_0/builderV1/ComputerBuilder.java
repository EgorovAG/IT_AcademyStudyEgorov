package computer2_0.builderV1;

public abstract class ComputerBuilder {
    Computer computer;

    void createComputer(){
        computer = new Computer();
    }
    abstract void buildCPU();
    abstract void  buildRAM();
    abstract void buildHDD();

    Computer getComputer(){
        return computer;
    }

}
