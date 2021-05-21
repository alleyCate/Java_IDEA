package Day20.a_stringBuffer;

/*
 * 修改方法
 */

public class Demo4 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("热干面 ，豆皮，鱼");

        stringBuffer.replace(1, 2, "武汉加油！");
        System.out.println(stringBuffer);

        stringBuffer.setCharAt(5,'钱');
        System.out.println(stringBuffer);
    }
}
