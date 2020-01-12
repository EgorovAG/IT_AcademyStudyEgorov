package computer2_0.builderV2;

public class ComputerMain {
    public static void main(String[] args) {
        Director director = new Director();

        Computer_V1Builder computer_v1Builder = new Computer_V1Builder();
        director.constructComputer_V1(computer_v1Builder);

        Computer_V1 computer_v1;
        computer_v1 = computer_v1Builder.getResult();
        System.out.println(computer_v1);


        Computer_V2Builder computer_v2Builder = new Computer_V2Builder();
        director.constructComputer_V2(computer_v2Builder);

        Computer_V2 computer_v2 = computer_v2Builder.getResult();
        System.out.println(computer_v2);


    }
}
