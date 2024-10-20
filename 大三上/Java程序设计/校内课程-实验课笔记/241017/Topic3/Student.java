public class Student extends People {
    String sno;

    public Student(String name, int age, String sno) {
        super(name, age);
        this.sno = sno;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sno: " + sno);
    }
}
