public class N1_2Factorial {
    public static void main(String[] args) {
        int fact = 1;
        int k=Integer.parseInt (args[0]);
        for (int i = 1; i<=k; i++) {
            fact *=i;
        }
        System.out.println("Factorial of the Number="+ k + " is "+ fact);
    }
}

