import java.util.Scanner;

class FactorialCalculator {
    long findFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactorialCalculator obj = new FactorialCalculator();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " = " + obj.findFactorial(num));
        sc.close();
    }
}
