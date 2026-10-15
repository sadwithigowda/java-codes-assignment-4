import java.util.Scanner;

class NumberCheck {
    void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number");
        } else {
            System.out.println(num + " is an Odd number");
        }
    }
}

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberCheck obj = new NumberCheck();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        obj.checkEvenOdd(num);
        sc.close();
    }
}
