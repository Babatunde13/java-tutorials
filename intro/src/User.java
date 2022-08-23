public class User {
    private String name;
    private byte age;
    private int height;
    private long id;
    private float gpa;
    private char A;
    private boolean isMale;

    public User(String string, byte parseByte, int parseInt, long parseLong, float parseFloat, char charAt,
            boolean parseBoolean) {
        this.name = string;
        this.age = parseByte;
        this.height = parseInt;
        this.id = parseLong;
        this.gpa = parseFloat;
        this.A = charAt;
        this.isMale = parseBoolean;
    }

    public void printUser () {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.height);
        System.out.println(this.id);
        System.out.println(this.gpa);
        System.out.println(this.A);
        System.out.println(this.isMale);

        if (this.name.endsWith(" ")) {
            System.out.println("Name ends with a space");
        } else {
            System.out.println("Name does not end with a space");
        }
        System.out.println("Hello, " + this.name + " you are " + this.age + " years old." + " You are " + this.height + "cm tall.");
    }

    public static void main (String[] args) {
        User user = new User(args[0], Byte.parseByte(args[1]), Integer.parseInt(args[2]), Long.parseLong(args[3]), Float.parseFloat(args[4]), args[5].charAt(0), Boolean.parseBoolean(args[6]));
        user.printUser();
    }
}