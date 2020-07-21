package Day03;

public class Demo2 {
    public static void main(String[] args) {
        boolean ret = 5 > 3 && 10 > 5;
        System.out.println(ret);

        ret = 5 > 10 && 10 > 8;
        System.out.println(ret);

        ret = 5 > 10 || 10 > 8;
        System.out.println(ret);

        ret = 5 > 10 || 10 > 20;
        System.out.println(ret);

        ret = !(10 > 5);
        System.out.println(ret);

    }
}
