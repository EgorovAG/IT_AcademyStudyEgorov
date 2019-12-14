public class Test1 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c = -42;
        int d = -15;
       /* Побитовое OR (|)
        42 00101010   -42 11010110
        15 00001111   -15 11110001
        47 00101111   -9  11110111
        */
        System.out.println("Побитовое OR (|)");
        System.out.println("42|15");
        System.out.println("Binary=" + Integer.toBinaryString(a|b));
        System.out.println("Decimal="+(a|b));
        System.out.println("-42|-15");
        System.out.println("Binary=" + Integer.toBinaryString(c|d));
        System.out.println("Decimal="+(c|d));
        System.out.println();

        /* Побитовый AND (&)
        42 00101010   -42 11010110
        15 00001111   -15 11110001
        10 00001010   -48 11010000
        */
        System.out.println("Побитовый AND (&)");
        System.out.println("42&15");
        System.out.println("Binary=" + Integer.toBinaryString(a&b));
        System.out.println("Decimal="+(a&b));
        System.out.println("-42&-15");
        System.out.println("Binary=" + Integer.toBinaryString(c&d));
        System.out.println("Decimal="+(c&d));
        System.out.println();

        /* Побитовый AND (&)
        42 00101010   -42 11010110
        15 00001111   -15 11110001
        37 00100101    39 00100111
        */
        System.out.println("Побитовый исключающий OR или XOR (^)");
        System.out.println("42^15");
        System.out.println("Binary=" + Integer.toBinaryString(a^b));
        System.out.println("Decimal="+(a^b));
        System.out.println("-42^-15");
        System.out.println("Binary=" + Integer.toBinaryString(c^d));
        System.out.println("Decimal="+(c^d));
        System.out.println();

        /* Побитовый унитарный оператор NOT (~)
        42 00101010   -42 11010110
       -43 11010101    41 00101001

        15 00001111   -15 11110001
       -16 11110000    14 00001110
        */
        System.out.println("Побитовый унитарный оператор NOT (~)");
        System.out.println("42 оператор NOT (~):");
        System.out.println("Binary=" + Integer.toBinaryString(~a));
        System.out.println("Decimal="+(~a));
        System.out.println("15 оператор NOT (~):");
        System.out.println("Binary=" + Integer.toBinaryString(~b));
        System.out.println("Decimal="+(~b));
        System.out.println("-42 оператор NOT (~):");
        System.out.println("Binary=" + Integer.toBinaryString(~c));
        System.out.println("Decimal="+(~c));
        System.out.println("-15 оператор NOT (~):");
        System.out.println("Binary=" + Integer.toBinaryString(~d));
        System.out.println("Decimal="+(~d));
        System.out.println();

        /* Сдвиг вправо >>
        42 00101010   -42 11010110
        10 00001010   -11 11110101

        15 00001111   -15 11110001
         3 00000011    -4 11111100
         */
        System.out.println("Сдвиг вправо >> на 2 позиции :");
        System.out.println("42>>2");
        System.out.println("Binary=" + Integer.toBinaryString(a>>2));
        System.out.println("Decimal="+(a>>2));
        System.out.println("15>>2");
        System.out.println("Binary=" + Integer.toBinaryString(b>>2));
        System.out.println("Decimal="+(b>>2));
        System.out.println("-42>>2");
        System.out.println("Binary=" + Integer.toBinaryString(c>>2));
        System.out.println("Decimal="+(c>>2));
        System.out.println("-15>>2");
        System.out.println("Binary=" + Integer.toBinaryString(d>>2));
        System.out.println("Decimal="+(d>>2));
        System.out.println();

        /* Сдвиг влево <<
        42 00101010   -42 11010110
       168 10101000  -168 01011000

        15 00001111   -15 11110001
        60 00110000   -60 11000100
         */
        System.out.println("Сдвиг ввлево << на 2 позиции :");
        System.out.println("42<<2");
        System.out.println("Binary=" + Integer.toBinaryString(a<<2));
        System.out.println("Decimal="+(a<<2));
        System.out.println("15<<2");
        System.out.println("Binary=" + Integer.toBinaryString(b<<2));
        System.out.println("Decimal="+(b<<2));
        System.out.println("-42<<2");
        System.out.println("Binary=" + Integer.toBinaryString(c<<2));
        System.out.println("Decimal="+(c<<2));
        System.out.println("-15<<2");
        System.out.println("Binary=" + Integer.toBinaryString(d<<2));
        System.out.println("Decimal="+(d<<2));
        System.out.println();

        /* Сдвиг впарво без учета знака >>> на 3 позиции
        42 00101010   -42 11010110
         5 00000101    536870906 111111111111111111111 11111010

        15 00001111   -15 11110001
         1 00000001    536870910 111111111111111111111 11111110
         */
        System.out.println("Сдвиг вправо без учета знака >>> на 3 позиции :");
        System.out.println("42>>>3");
        System.out.println("Binary=" + Integer.toBinaryString(a>>>3));
        System.out.println("Decimal="+(a>>>3));
        System.out.println("15>>>3");
        System.out.println("Binary=" + Integer.toBinaryString(b>>>3));
        System.out.println("Decimal="+(b>>>3));
        System.out.println("-42>>>3");
        System.out.println("Binary=" + Integer.toBinaryString(c>>>3));
        System.out.println("Decimal="+(c>>>3));
        System.out.println("-15>>>3");
        System.out.println("Binary=" + Integer.toBinaryString(d>>>3));
        System.out.println("Decimal="+(d>>>3));
        System.out.println();

        /*
        Побитовые составные операторы с присваиванием

        System.out.println(a >>= 4);
        System.out.println(b |= c);
        System.out.println(d <<=3);
        */

    }

}
