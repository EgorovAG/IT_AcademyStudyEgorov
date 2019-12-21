// найти количество различных цифр у заданного натурального числа.

import java.util.Scanner;

public class N2__6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural number: ");
        int num = sc.nextInt();
        if (num <0 ) {
            System.out.println("You have entered a non-natural number, try again");
            num = sc.nextInt();
        }
            int count=0;
            int count2=0;

            while(num>0) {
                int d=num%10;

                int num2=num;
                count=0;

                while (num2>0) {
                    int d2 = num2 % 10;
                    if (d == d2) {
                        count++;
                    }
                    num2/=10;
                }
                if(count<2) {
                    count2++;
                }
                num/=10;
            }
            System.out.println("The number of different digits is equal="+count2);
    }
}






