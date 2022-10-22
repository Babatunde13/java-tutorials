public class VarArgs {
    public static void main(String[] args) {
        displayUsers("John");
        displayUsers("John", "Doe");
        displayUsers("John", "Doe", "Jane");

        // using arrays
        displayUsersWithArray(new String[]{"John", "Doe", "Jane"});

        // using varargs
        displayUsersWithVarArg("John");
        displayUsersWithVarArg("John", "Doe");
        displayUsersWithVarArg("John", "Doe", "Jane");
        displayUsersWithVarArg("John", "Doe", "Jane", "Joe");
        displayUsersWithVarArg("John", "Doe", "Jane", "Joe", "Jill", "Jack");
    }

    public static void displayUsersWithArray(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
    
    public static void displayUsersWithVarArg(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void displayUsers(String name) {
        System.out.println(name);
    }

    public static void displayUsers(String name1, String name2) {
        System.out.println(name1);
        System.out.println(name2);
    }

    public static void displayUsers(String name1, String name2, String name3) {
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
