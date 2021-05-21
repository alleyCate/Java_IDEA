package Day20.a_stringBuffer;

/*
 * 查询方法
 */

public class Demo3 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("重庆小面，重庆酸辣粉，重庆火锅，万州烤鱼，重庆辣子鸡丁");

        System.out.println(stringBuffer.indexOf("重庆火锅"));
        System.out.println(stringBuffer.substring(5));
        System.out.println(stringBuffer.substring(5, 10));

        System.out.println(stringBuffer.length());
    }
}
