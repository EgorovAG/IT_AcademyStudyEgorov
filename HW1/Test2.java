public class Test2 {
    public static void main(String[] args) {
        example5_1(); //5.1 5 + 2 / 8
        example5_2(); //5.2 (5 + 2) / 8
        example5_3(); //5.3 (5 + 2++) / 8
        example5_4(); //5.4 (5 + 2++) / --8
        example5_5(); //5.5 (5 * 2 >> 2++) / --8
        example5_6(); //5.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        example5_7(); //5.7 (5 + 7 > 20 ? 68 => 68 : 22 * 2 >> 2++) / --8
        example5_8(); //5.8 6 - 2 > 3 && 12 * 12 <= 119
        example5_9(); //5.9 5.9 true && false
    }

    static void example5_1() {
        System.out.print(" 5 + 2 / 8 = ");
        System.out.println(5 + 2 / 8); //=5   т.к. сразу деление, а затем при делении int дробная часть отбрасывается
}

    static void example5_2() {
        System.out.print("(5 + 2) / 8 = ");
        System.out.println((5 + 2) / 8); //=0   т.к. сразу сумма в скобках, а затем деление,
                                         // затем при делении int дробная часть отбрасывается
    }

    static void example5_3() {
        int a=2;
        System.out.print("(5 + 2++) / 8 = ");
        System.out.println((5 + a++) / 8); //=0   сразу 2++(2), затем сумма в скобках, затем деление
    }

    static void example5_4() {
        int a = 2;
        int b = 8;
        System.out.print("(5 + 2++) / --8 = ");
        System.out.println((5 + a++) / --b); //=1   сразу 2++(2) и --8(7),
        // затем сумма в скобках, затем деление
    }

    static void example5_5() {
        int a = 2;
        int b = 8;
        System.out.print("(5 * 2 >> 2++) / --8 = ");
        System.out.println((5 * 2 >> a++) / --b); //=0   сразу 2++(2) и --8(7), затем 5*2, затем 10>>2 и деление
    }

    static void example5_6() {
        int a = 2;
        int b = 8;
        System.out.print("(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = ");
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b); //=1  сразу5+7 false значит 22*2=44 и >> 2(результат11)
                                                                     // затем деление на 7 с отбрасывание дробной части
    }

    static void example5_7() {
        int a = 2;
        int b = 8;
        System.out.print("(5 + 7 > 20 ? 68 => 68 : 22 * 2 >> 2++) / --8 = ");
        System.out.println();
        //    System.out.println((5 + 7 > 20 ? 68 => 68 : 22 * 2 >> a++) / --b); // Ошибка из-за "68 => 68"
    }

    static void example5_8() {
        System.out.print("6 - 2 > 3 && 12 * 12 <= 119 = ");
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119);  // =false  сравниваем (6-3>3) и получаем true,
                                                          // а правая false(144<=119)
                                                          // т.к. логическое AND и одно false
    }

    static void example5_9() {
        System.out.print("true && false = "); // =false    т.к. логическое AND и одно false
        System.out.println(true && false);
    }

    }

