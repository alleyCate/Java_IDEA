package Day10.b_final;

public class Demo1 {
    public static void main(String[] args) {
        //Cannot assign a value to final variable 'num'
        //final修饰的局部变量不能被重新赋值，必须是没有保存数据或者是没有使用的情况向下才可以被赋值
        //final修饰的局部变量一旦被复制，之后无法更改
        final int num;
        num = 20;
    }
}

final class A {
    //Variable 'name' might not have been initialized
    //变量“name”尚未初始化。final修饰的成员变量在定义是必须初始化！
    public final String name = "懒羊";

    //final修饰的方法不能被子类重写，为最终模式。
    public final void testA() {

    }
}

//Cannot inherit from final 'Day10.b_final.A'
//final修饰的类不能被继承
/*class B extends A {
    //重写A类中的testA方法
    //'testA()' cannot override 'testA()' in 'Day10.b_final.A'; overridden method is final
    //不能重写A类中的final方法
    *//*@Override
    public void testA() {
        System.out.println("B类重写A类方法");

    }*//*
}*/
