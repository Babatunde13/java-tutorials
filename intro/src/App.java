import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        byte age = Byte.parseByte(args[1]);
        int height = Integer.parseInt(args[2]);
        String name = args[0];
        long id = 3_123_456_789L;
        float gpa = 3.14F;
        char A = 'a';
        boolean isMale = true;
        
        User user = new User(name, age, height, id, gpa, A, isMale);
        user.printUser();
        System.out.println();
        System.out.println("Hello, World!");
        
        System.out.println();
        Date date = new Date();
        App.dateHandler(date);

        System.out.println();
        App.playWithArray();

        final float PI = 3.14F; // constant variable
        System.out.println(PI);

        System.out.println();
        playWithMaths();

        System.out.println();
        readInput();
    }

    public static void dateHandler(Date date) {
        System.out.println(date);
        System.out.println(date.getTime());
        // System.out.println(date.getYear());
        // System.out.println(date.getMonth());
    }

    public static void playWithArray () {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        // int numbersCount = numbers.length;
        System.out.println(Arrays.toString(numbers));

        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        System.out.println(Arrays.deepToString(matrix));

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(Arrays.deepToString(matrix2));
        System.out.println();

        for (int[] row : matrix2) {
            System.out.println(Arrays.toString(row));
        }

        App.arithmetic();
    }

    public static void arithmetic() {
        double divisor = (double)10 / (double)3;
        System.out.println(divisor);

        System.out.println(10/3);
    }

    public static void playWithMaths() {
        int result = Math.round(1.9F);
        int result2 = (int)Math.ceil(1.9F);
        int result3 = (int)Math.floor(1.9F);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        float fraction = 0.9F;
        int currency = 1000;
        System.out.println(NumberFormat.getCurrencyInstance().format(currency));
        System.out.println(NumberFormat.getPercentInstance().format(fraction));
    }

    public static void readInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = System.console().readLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = scanner.next().trim();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();


        String fullname = firstName + " " + lastName;

        System.out.println("Hello, " + fullname + "," + " you are " + age + " years old.");

        scanner.close();
    }
}
