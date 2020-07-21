package Day10.c_staticField;

/*
 * 为什么需要使用static修饰成员变量
 */
public class Demo1 {
    public static void main(String[] args) {
        Person person1 = new Person("懒羊", 16);
        Person person2 = new Person("懒泽", 66);
    }
}

class Person {
    private String name;
    private int age;
    //定义初始化过程
    private String country = "中华人民共和国";

    public Person() { }

    public Person(String name, int age) {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
