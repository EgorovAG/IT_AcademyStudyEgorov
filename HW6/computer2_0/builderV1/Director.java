package computer2_0.builderV1;


public class Director {
    ComputerBuilder builder;

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    Computer buildComputer(){
        builder.createComputer();
        builder.buildCPU();
        builder.buildHDD();
        builder.buildRAM();

        Computer computer = builder.getComputer();
        return computer;
    }
}
