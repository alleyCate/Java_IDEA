package Day20.a_stringBuffer;

/*
 * 删除和逆序方法
 */

public class Demo5 {
    public static void main(String[] args) {
        StringBuffer stb = new StringBuffer("生煎，阳春面，云吞");

        stb.delete(1, 5);
        System.out.println(stb);

        stb.deleteCharAt(1);
        System.out.println(stb);

        stb.reverse();
        System.out.println(stb);
    }
}
