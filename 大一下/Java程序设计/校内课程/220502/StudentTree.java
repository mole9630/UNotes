package com;

public class StudentTree implements Comparable<StudentTree> {
    private String name;
    private int age;

    //实现接口中的抽象方法
    @Override
    public int compareTo(StudentTree o) {
        //按年龄排序(数值型)
//        return this.age-o.age; //从小到大排序 负数排在o对象之前 正数排在o对象之后 结果为0说明两个对象相等
//        return o.age-this.age; //从大到小排序 负数排在o对象之前 正数排在o对象之后 结果为0说明两个对象相等
        //按姓名排序(字符串型)
//        return this.name.compareTo(o.name); //从小到大排序
//        return o.name.compareTo(this.name); //从大到小排序
        //先按年龄排序再按姓名排序
        if(this.age==o.age){
            return this.name.compareTo(o.name);
        }else{
            return this.age-o.age;
        }
    }

    public StudentTree() {
    }

    public StudentTree(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "StudentTree{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        StudentTree studentTree = (StudentTree) o;
        if (name == null) {
            if (studentTree.name != null) return false;
        }else if (!name.equals(studentTree.name)){return false;}
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (getName() == null ? 0 : getName().hashCode());
        return result;
    }
}
