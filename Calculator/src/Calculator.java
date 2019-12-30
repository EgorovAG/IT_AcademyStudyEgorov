
public class Calculator {
    public static void main(String[] args) {
        Calc calc = new Calc(10,5);
        System.out.println(calc.subtract());
        System.out.print("save memory ");
        System.out.println(calc.memory()); //Вызвал функцию сохранить в memory
        System.out.println(calc.mult());
        System.out.println(calc.division());
        System.out.println(calc.sum());
        System.out.print("restore memory ");
        System.out.println(calc.restore()); //Функция вставить memory

    }
}
