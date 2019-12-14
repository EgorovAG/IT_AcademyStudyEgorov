public class N1_3ProdOfNumbers {
    public static void main(String[] args) {
        int m = 1;
        System.out.println("Entered argument:");
        for (String str:args) {
            System.out.print(str);
        }

        System.out.println("\nMultiply all digits of the argument ");

        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            while (n % 10 != 0) {
                int k = n % 10;
                m *= k;
                n = n / 10;
                System.out.println("digit=" + k);

            }
        }
        System.out.println("Multiplication=" + m);
    }
}

