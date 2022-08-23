import java.text.NumberFormat;
import java.util.Scanner;

public class Interest {
    public double principal;
    public double rate;
    public byte years;

    public Interest () {
        System.out.println("Simple Interest calculator!");
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal in #: ");
        this.principal = scanner.nextDouble();

        System.out.print("Enter the rate in fraction: ");
        this.rate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        this.years = scanner.nextByte();

        scanner.close();
    }

    public double calculateSI() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormat = NumberFormat.getPercentInstance();

        double interest = this.principal * this.rate * this.years;

        System.out.println(
            "The simple interest with a principal of " + currencyFormat.format(this.principal) +
            " at a rate of " + percentFormat.format(this.rate) + " for " + this.years + " years is " +
            currencyFormat.format(interest)
        );

        return interest;
    }

    public static void main(String[] args) {
        Interest interest = new Interest();
        interest.getUserInput();
        interest.calculateSI();
    }
}
