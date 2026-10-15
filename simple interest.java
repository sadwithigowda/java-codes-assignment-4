import java.util.Scanner;

class InterestCalculator {
    double principal;
    double rate;
    double time;

    InterestCalculator(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    double calculate() {
        return (principal * rate * time) / 100;
    }
}

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double t = sc.nextDouble();

        InterestCalculator obj = new InterestCalculator(p, r, t);
        System.out.println("Simple Interest = " + obj.calculate());
        sc.close();
    }
}
