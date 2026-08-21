class Student {

    String name;
    int age;

    Student() {
        name = "Madhu";
        age = 20;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}