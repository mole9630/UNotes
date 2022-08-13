/**
 * 假设某班30名学生，学号分别为1706041-1706070，全部选修了Java课程。
 * （1）学生信息（包括学生学号，成绩），实现学生类的封装；
 * （2）通过随机数（范围60-100）产生所有同学的成绩；
 * （3）请编写代码存储学生信息（包括学生学号，成绩）；
 * （4）按照成绩从小到大的顺序输出所有学生信息。
 * */
package Temp_0503;

public class Student {
    private String sno;
    private int degree;

    public Student() {
    }

    public Student(String sno, int degree) {
        this.sno = sno;
        this.degree = degree;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getDegree() != student.getDegree()) return false;
        return getSno() != null ? getSno().equals(student.getSno()) : student.getSno() == null;
    }

    @Override
    public int hashCode() {
        int result = getSno() != null ? getSno().hashCode() : 0;
        result = 31 * result + getDegree();
        return result;
    }
}
