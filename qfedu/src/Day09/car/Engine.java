package Day09.car;

/**
 * 引擎类
 * @author Anonymous
 */
public class Engine {

    private String name;
    private float capacity;

    public Engine () {
    }

    public Engine (String name, float capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void setName(String name, float capacity) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getCapacity() {
        return capacity;
    }

}
