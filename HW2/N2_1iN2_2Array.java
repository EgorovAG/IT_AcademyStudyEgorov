import java.util.Scanner;

public class N2_1iN2_2Array {
    public static void main(String[] args) {
        int i;

        System.out.print("Enter the length of the array=");
        Scanner s = new Scanner(System.in);
           int n = s.nextInt();
        if (n<0) {
            while (n < 0) {
                System.out.println("Enter positive number= ");
                n = s.nextInt();
            }
        }
        int [] array = new int[n];

        for (i = 0; i <n; i++) {
            System.out.print("Enter " + i + " array element=");
            array[i] = s.nextInt();
        }

        System.out.println("\"while\"");
        System.out.print("The array you entered: ");
        i=0;
        while (i < n) {
            System.out.print(array[i]+" ");
            i++;
        }

        System.out.println();
        System.out.println("\"do while\"");
        System.out.print("The array you entered: ");
        i=0;
        do {
            System.out.print(array[i]+" ");
            i++;
        }
        while(i<n);

        System.out.println();
        System.out.println("\"for\"");
        System.out.print("The array you entered: ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("\"foreach\"");
        System.out.print("The array you entered: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Every second element of the array: ");
        for ( i = 1; i < n ; i+=2) {
            System.out.print(array[i] + " ");
        }
    }
}





