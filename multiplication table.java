import java.util.Scanner;

class MultiplicationTable {
    void display(int num) {
        System.out.println("Multiplication table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultiplicationTable obj = new MultiplicationTable();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        obj.display(num);
        sc.close();
    }
}
