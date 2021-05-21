package Day20.a_stringBuffer;

/*
 * stringBuffer append 和 insert 方法演示
 */

public class Demo2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("方中山胡辣汤, 萧记烩面, 蔡记蒸饺, 葛记焖饼");

        stringBuffer.append("秦朴油泼面, 臊子面");
        stringBuffer.append(new Demo1());
        stringBuffer.append(new Demo2());

        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("ABCDEFGHIJKLMN");
        stringBuilder.insert(3, "羊肉汤");
        stringBuilder.insert(9, "馄饨");

        System.out.println(stringBuilder);
    }
}
