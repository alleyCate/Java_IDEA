package Day09.car;

/**
 * 轮胎类
 * @author Anonymous
 */
public class Tyre {
    //成员变量
    private String name;
    private int size;

    public Tyre() {

    }

    public Tyre(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
