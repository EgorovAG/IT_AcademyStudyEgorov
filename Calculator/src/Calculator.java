public class Calculator {
    public static void main(String[] args) {
        Calc1 calc = new Calc1();
        System.out.println(calc.var(10)); //ввели 10
        System.out.println(calc.sum(5)); //  10+5=15
        System.out.println(calc.memory());   //нажали память и сохранили результат 15
        System.out.println(calc.subtract(1)); //15-1 =14
        System.out.println(calc.division(2)); // 14/2=7
        System.out.println(calc.sum(calc.restore())); //добавили к 7 из памяти 15 =22
        System.out.println(calc.mult(1)); //22*1=22

    }
}
