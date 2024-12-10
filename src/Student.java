public class Student {
    String name;
    Student ( String name) {
        this.name = name;
    }

    void greatings () {
        System.out.println("hello " + this.name);
    }
}
