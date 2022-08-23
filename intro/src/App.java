import java.util.Arrays;
import java.util.Date;

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
        dateHandler(date);

        System.out.println();
        playWithArray();
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
        System.out.println(Arrays.toString(numbers));
    }
}
