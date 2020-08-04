package Day11.b_interface;

public class Demo2 {

}

interface C {
    void testC();
}

interface D {
    void testD();

}

/**
 * 接口之间可以多继承】
 *
 * @author alleyCat
 */
interface E extends C, D {
    void testE();

}


class TypeB implements E {
    @Override
    public void testC() {
        //5V1A
        System.out.println("C协议");
    }

    @Override
    public void testD() {
        //9V2A
        System.out.println("D协议");
    }

    @Override
    public void testE() {
        //10V4A
        System.out.println("E协议");
    }
}