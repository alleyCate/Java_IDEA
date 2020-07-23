package Day10.e_staticBlock;

public class Demo1 {
    public static void main(String[] args) {
        new Dog();
        new Dog("八公");
    }
}

class Dog {
    private String name;

    //构造代码块 成员变量之后，构造方法之前
    {
        System.out.println("做狗嘛最重要的是开心");
    }

    public Dog() {
        System.out.println("无参数构造方法");
    }

    public Dog(String name) {
        this.name = name;
        System.out.println("有参数构造方法");
    }
}
