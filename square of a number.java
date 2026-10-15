import java.util.Scanner;

class SquareCalculator {
    int findSquare(int num) {
        return num * num;
    }
}

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SquareCalculator obj = new SquareCalculator();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Square of " + num + " = " + obj.findSquare(num));
        sc.close();
    }
