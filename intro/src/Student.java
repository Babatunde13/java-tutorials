public class Student {
    String firstName;
    String lastName;
    int grade;
    int age;

    Student () {
        this("John", "Doe", 70, 20);
    }

    Student (String firstName, String lastName, int grade) {
        this(firstName, lastName, grade, 20);
    }

    Student (String firstName, String lastName) {
        this(firstName, lastName, 70, 20);
    }

    Student (String firstName, String lastName, int grade, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.age = age;
    }

    public Student(String fullname) {
        this(fullname.split(" ")[0], fullname.split(" ")[1]);
    }

    void changeName (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void changeGrade (int grade) {
        this.grade = grade;
    }

    void changeAge (int age) {
        this.age = age;
    }

    void print () {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Grade: " + this.grade);
        System.out.println("Age: " + this.age);
    }
}
