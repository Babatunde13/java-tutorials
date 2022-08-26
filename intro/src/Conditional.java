import com.Babatunde.Student;

public class Conditional {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println(num1 == num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 != num2);

        Student student1 = new Student();
        System.out.println(student1);

        if (num1 == num2) {
            System.out.println("num1 is equal to num2");
        } else {
            System.out.println("num1 is not equal to num2");
        }

        int income = Integer.parseInt(System.console().readLine("Enter your income: "));
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
        String className = income > 100_000 ? "First"  : income > 50_000 ? "Business" : "Economy";

        System.out.println(className);

        switch (className) {
            case "First":
                System.out.println("You are in First Class");
                break;
            case "Economy":
                System.out.println("You are in Economy Class");
                break;
            default:
                System.out.println("You are in Business Class");
                break;
        }
    }
}
