// найти НОД и НОК двух натуральных чисел a и b.

import java.util.Scanner;

public class N2__5NokNod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = 0;
        int f = 0;

        if (a > 0 && b > 0) {
            for (int i = 1; i < a; i++) {
                if (a % i == 0)
                    k = i;
            }

            for (int i = 1; i < b; i++) {
                if (b % i == 0)
                    f = i;
            }

            if (k > f) {
                System.out.println("НОД= " + k);
                System.out.println("НОК= " + (a * b / k));
            } else {
                System.out.println("НОД= " + f);
                System.out.println("НОК= " + (a * b / f));
            }
        }
        else {
            System.out.println("Вы ввели не натуральное число");
        }
    }
}
