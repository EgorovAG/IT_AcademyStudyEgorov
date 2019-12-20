// найти количество различных цифр у заданного натурального числа.

import java.util.Scanner;

// Делаю через массив

public class N2__6 {
    public static void main(String[] args) {

        int numbers = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int a = sc.nextInt();
        if (a > 0) {
            int z = 0;
            int k = a;
            //int count = 0;

            int[] array;
            while (k % 10 != 0) {
                k /= 10;
                z++;
            }

            array = new int[z];
            while (a % 10 != 0) {
                for (int i = 0; i < z; i++) {
                    array[i] = a % 10;
                    a /= 10;
                }
                for (int i = 0; i < array.length; i++) {
                   int count = 0;
                    for (int j = 0; j < i; j++) {
                        if (array[j] == array[i]) {
                            count++;
                        }
                    }
                    if (count == 0) {
                        numbers++;
                    }
                }
                System.out.println(numbers);            }
        }
        else
            System.out.println("Вы ввели не натуральное число, попробуйте еще раз");
    }
}






