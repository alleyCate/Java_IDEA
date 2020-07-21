package Day09.e_extends;

public class Demo3 {
    public static void main(String[] args) {

    }
}

class Hero {
    int hp;
    int mp;

    public Hero() {
        System.out.println("无参构造方法");
    }

    public Hero(int hp) {
        this.hp = hp;
        System.out.println("单参数构造方法");
    }

    public Hero(int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
        System.out.println("两个参数的构造方法");
    }
}

class VN extends Hero {
    public VN () {
        super(10,20);
        System.out.println("VN类构造方法");
    }
}
