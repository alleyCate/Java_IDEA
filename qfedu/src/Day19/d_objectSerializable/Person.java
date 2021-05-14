package Day19.d_objectSerializable;

import java.io.Serializable;

/*
 * 如果一个类需要进行序列化操作，必须遵从Serializable接口
 */

public class Person implements Serializable {
    private int id;
    private String name;
    private int age;
    // 瞬态修饰成员变量，不能被序列化
    // private transient int age;

    public Person() {}

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

