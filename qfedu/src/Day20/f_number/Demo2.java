package Day20.f_number;

public class Demo2 {
    public static void main(String[] args) {
        byte parseByte = Byte.parseByte("1");
        short parseShort = Short.parseShort("123");
        int parseInt = Integer.parseInt("100");
        long parseLong = Long.parseLong("1000");

        float parseFloat = Float.parseFloat("3.14");
        double parseDouble = Double.parseDouble("0.618");

        boolean parseBoolean = Boolean.parseBoolean("true");

        System.out.println(parseBoolean);

        System.out.println(Integer.parseInt("abc"));
    }
}
