package Day18.b_string;

public class Demo2 {
    public static void main(String[] args) {
        String str = "土豆牛肉";

        System.out.println("str.length() : " + str.length());
        System.out.println("str.charAt(0) : " + str.charAt(0));
        //System.out.println("str.charAt(4) : " + str.charAt(4)");

        System.out.println("str.indexOf('土') : " + str.indexOf('土'));
        System.out.println("str.indexOf('面') : " + str.indexOf('面'));
        System.out.println("str.indexOf(\"土豆\") : " + str.indexOf("土豆"));
        System.out.println("str.indexOf(\"肉面\") : " + str.indexOf("肉面"));

        System.out.println("str.indexOf('土', 2) : " + str.indexOf('土', 2));
        System.out.println("str.indexOf('面', 2) : " + str.indexOf('面', 2));

        System.out.println("str.lastIndexOf('土') : " + str.lastIndexOf('土'));
        System.out.println("str.lastIndexOf('面') : " + str.lastIndexOf('面'));
        System.out.println("str.lastIndexOf(\"土豆\") : " + str.lastIndexOf("土豆"));
        System.out.println("str.lastIndexOf(\"肉面\") : " + str.lastIndexOf("肉面"));

        System.out.println("str.lastIndexOf('土', 2) : " + str.lastIndexOf('土', 2));
        System.out.println("str.lastIndexOf('面', 2) : " + str.lastIndexOf('面', 2));
    }
}
