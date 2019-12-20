//2) Разработать наиболее эффективные алгоритмы и написать код для решения следующих задач:
//         найти наибольшую цифру натурального числа;
//         проверить, является ли заданное натуральное число палиндромом;
//         определить является ли заданное натуральное число простым;
//         найти все простые делители заданного натурального числа;

import java.util.Scanner;

public class N2__1_2_3_4NatNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter natural number:");
        long nat1 = n.nextLong();
        if (nat1<0) {
            System.out.println("You entered didn't natural number");
            System.out.print("Enter natural number=");
            nat1 = n.nextInt();
        }

        System.out.println("Enter number method=");
        System.out.println("1-Method natMax");
        System.out.println("найти наибольшую цифру натурального числа");
        System.out.println("2-Method Palindrom");
        System.out.println("проверить, является ли заданное натуральное число палиндромом");
        System.out.println("3-Method Prostoe");
        System.out.println("определить является ли заданное натуральное число простым");
        System.out.println("4-Method prostoiDelitel");
        System.out.println("найти все простые делители заданного натурального числа");
        int x=n.nextInt();
        switch (x){
            case(1):
                AllMethods.natMax(nat1);
                break;
                case(2):
                    AllMethods.palindrom(nat1);
                    break;
                    case(3):
                        AllMethods.prostoe(nat1);
                        break;
                        case(4):
                            AllMethods.prostoiDelitel(nat1);
                            break;
                            default:
                                System.out.println("You entered an invalid number");
        }
    }
}

        class AllMethods {
    static void natMax(long nat) {
            int max = 0;
            while (nat > 0) {
                if (nat % 10 > max) {
                    max = (int) (nat % 10);
                }
                nat /= 10;
            }
            System.out.println("Max=" + max);
        }
        static void palindrom(long nat) {
            String s = Long.toString(nat);
            StringBuffer sb = new StringBuffer(s);
            StringBuffer s1 = sb.reverse();
            if (s.equals(s1))
                System.out.println("Number is palindrom");
            else
                System.out.println("Number isn't palindrom ");
        }

        static void prostoe(long nat) {
            boolean s = true;
            for (int i = 2; i < nat; i++) {
                if (nat % i == 0) {
                    s = false;
                    break;
                }
            }
            if (s)
                System.out.println("Number is simple");
            else
                System.out.println("Number isn't simple ");
        }

        static void prostoiDelitel(long nat) {
            System.out.println("простые делители заданного числа:");

            for (long i = 2; i <= nat; i++) {
                if (nat % i == 0) {
                    boolean s = true;
                    for (long j = 2; j < i; j++) {
                        if (i % j == 0){
                            s = false;
                            break;
                        }
                    }
                    if(s) System.out.print(i+" ");
                }
            }
        }
    }




