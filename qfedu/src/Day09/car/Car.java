package Day09.car;

/**
 * 汽车类
 *      成员变量
 *      Engine类对象
 *      Tyre类对象
 * @author Anonymous
 */
public class Car {
    /**
     * Enging引擎类对象
     */
    private Engine engine;

    /**
     * Tyre轮胎类对象
     */
    private Tyre tyre;
    
    public Car(Engine engine, boolean b) {

    }

    /**
     * 带有参数的Car类构造方法，需要的参数类型是Engine类对象和Tyre类对象
     *
     * @param engine 引擎类对象，一个完整的发动机
     * @param tyre 轮胎类对象，一个完整的轮胎
     */
    public Car(Engine engine, Tyre tyre) {
        this.engine = engine;
        this.tyre = tyre;
    }

    /**
     * 获取当前Car类对象Engine对象，可以理解为查看汽车发动机
     *
     * @return Engine类对象
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * 修理发动机，更换发动机，这里需要一个Engine类对象
     *
     * @param engine Enginge类对象
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * 查看轮胎
     *
     * @return 可以获取到一个轮胎类对象
     */
    public Tyre getTyre() {
        return tyre;
    }

    /**
     * 更换轮胎，这里需要的是一个轮胎类对象
     *
     * @param tyre Tyre类对象
     */
    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void show() {
        System.out.println("Engine Name:" + engine.getName() +  "  Capactiy:" + engine.getCapacity());
        System.out.println("Tyre Name:" + tyre.getName() +  "  Size:" + tyre.getSize());
    }
}
