package Day09.anonymousObject;

public class Demo1 {
    public static void main(String[] args) {
        SingleDog singleDog = new SingleDog();

        singleDog.name = "我不是";
        singleDog.test();

        //匿名对象直接调用类内的成员方法
        new SingleDog().test();
        new SingleDog().name = "真没准";

        System.out.println(new SingleDog().name);

        //这里可以传入一个Singledog对象
        testObject(singleDog);
        //传入一个匿名对象作为方法的参数
        testObject(new SingleDog());
    }

    /**
     * 测试方法
     * @param singleDog 需要一个SingleDog单身狗对象
     */
    public static void testObject(SingleDog singleDog) {
        System.out.println(singleDog);
    }
}

class SingleDog {
    String name;

    public SingleDog() {}

    public SingleDog(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("SingleDog类成员方法");
    }
}