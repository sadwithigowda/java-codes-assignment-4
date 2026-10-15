import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + calc.add(a, b));
        sc.close();
    }
}
