package computer2_0.builderV1;

public class ComputerMain {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new Computer_V1());
        Computer computer1 = director.buildComputer();

        director.setBuilder(new Computer_V2());
        Computer computer2 = director.buildComputer();

        System.out.println("1 " + computer1);
        System.out.println("2 " + computer2);
    }
}
