import java.util.Scanner;

class Compare {
    int findLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compare obj = new Compare();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Largest number = " + obj.findLargest(a, b));
        sc.close();
    }
}
