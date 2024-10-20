public class Student {
    private String name;
    private int age;
    private int math;
    private int java;

    public Student(String name, int age, int math, int java) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.java = java;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int total () {
        return math + java;
    }

    public double avg() {
        return (math + java) / 2;
    }

    public void printStudent() {
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("总分: " + total());
        System.out.println("平均分: " + avg());
    }


}
