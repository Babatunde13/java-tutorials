public class StudentCaller {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.print();
        student1.changeName("Babatunde", "Koiki");
        student1.changeGrade(90);
        student1.changeAge(21);
        student1.print();

        Student student2 = new Student("John", "Doe", 70, 20);
        student2.print();
        student2.changeName("Joe", "James");
        student2.changeGrade(80);
        student2.changeAge(30);
        student2.print();

        Student student3 = new Student("Jane", "Doe", 90);
        student3.print();
        student3.changeName("Janet", "Doe");
        student3.changeGrade(100);
        student3.changeAge(40);
        student3.print();

        Student student4 = new Student("Jane Doe");
        student4.print();
        student4.changeName("Janet", "Doe");
        student4.changeGrade(100);
        student4.changeAge(40);
        student4.print();
    }
}
