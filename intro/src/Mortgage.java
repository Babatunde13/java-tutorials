import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Mortgage calculator!
 * https://www.wikihow.com/Calculate-Mortgage-Payments
 */
public class Mortgage {
    public double principal;
    public double rate;
    public byte years;

    public Mortgage () {
        System.out.println("Mortgage calculator!\n");
    }

    /**
     * Get user input from the console
     */
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal in #: ");
        this.principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        this.rate = scanner.nextDouble();

        System.out.print("Enter the period in years: ");
        this.years = scanner.nextByte();

        scanner.close();
    }

    public double calculateMortgage() {
        final byte MONTHS_IN_A_YEAR = 12;
        final byte PERCENT = 100;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormat = NumberFormat.getPercentInstance(Locale.getAvailableLocales()[0]);

        int numberOfPayments = this.years * MONTHS_IN_A_YEAR;
        double monthlyRate = this.rate / MONTHS_IN_A_YEAR / PERCENT;

        double numerator = monthlyRate * Math.pow((1 + monthlyRate), numberOfPayments);
        double denominator = Math.pow((1 + monthlyRate), numberOfPayments) - 1;
        
        double mortgage = (this.principal * numerator) / denominator;

        System.out.println(
            "The mortgage with a principal of " +
            currencyFormat.format(this.principal) +
            " at an annual interest rate of " +
            percentFormat.format(this.rate) + " for " +
            this.years + " years is " +
            currencyFormat.format(mortgage)
        );

        return mortgage;
    }

    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();
        mortgage.getUserInput();
        mortgage.calculateMortgage();
    }
}
