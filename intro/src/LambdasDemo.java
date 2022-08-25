public class LambdasDemo {
    public static void show() {
        System.out.println("LambdasDemo");
        greet(new ConsolePrinter(), "Bob");
        greet((String message) -> { System.out.println(message) ;}, "Alice");
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        }, "Charlie");
        // PrintStream a = () -> System.out::println;
    }

    public static void main(String[] args) {
        show();
    }

    public static void greet(Printer printer, String name) {
        printer.print("Hello " + name + "!");
    }

    
}

interface MathOperation {
    int operation(int a, int b);
}