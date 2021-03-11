package Day16.a_object;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int age;
    private char gender;

    public Student() {}

    public Student(int id, String name, int age, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    /*
     * 重写equals方法
     *      1.判断两个对象是不是同一个对象。如果调用方法的类对象和传入参数类对象地址一致，那就是同一个对象，返回true。
     *
     *      2.equals方法参数是Object类型，也就是说任何类型的数据都可以作为参数。两个数据类型不一致，是否需要进行比较操作。
     *      判断数据类型是否一致，使用关键字 instanceOf，同数据类型继续运行，非同类型结束判断，返回false。
     *
     *      3.判断对象中保存的数据
     *          Student中我们比较id, name, age, gender就可以了
     */

    @Override
    public boolean equals(Object obj) {
        // 1.判断是不是同地址对象
        if (this == obj) {
            return true;
        }

        // 2.类型是否一致
        if (!(obj instanceof Student)) {
            return false;
        }

        // 数据类型强制转换
        Student stu = (Student) obj;
        return this.id == stu.id
                // this.name.equals(stu.name) 该equals方法是String类equals方法。=======
                && this.name.equals(stu.name)
                && this.age == stu.age
                && this.gender == stu.gender;

    }

    @Override
    public int hashCode() {
        // 通过Object工具类内的hash方法，传入所有参与equals比较的成员变量得到对应的hashCode值
        return Objects.hash(id, name, age, gender);
    }
}
