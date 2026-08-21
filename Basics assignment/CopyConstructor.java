public class CopyConstructor {
    private String name;
    private int age;

    public CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public CopyConstructor(CopyConstructor other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot copy from a null object");

        }
        this.name = other.name;
        this.age = other.age;

    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        CopyConstructor c1 = new CopyConstructor("A", 20);
        CopyConstructor c2 = new CopyConstructor(c1);
        System.out.println("Og: ");
        c1.display();
        System.out.println("copy og: ");
        c2.display();
    }
}



