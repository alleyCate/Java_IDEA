package Day12.a_throwable;

public class Demo5 {
    public static void main(String[] args) throws NoGirlFriendException {
        try {
            buyOneFreeOne(true);
        } catch (NoGirlFriendException e) {
            e.printStackTrace();
        }

        buyOneFreeOne(false);
    }

    /**
     *买一送一方法，需要判断是不是单身狗
     * @param singledog singleDog boolean类型数据，true是单身，false表示有女朋友
     * @throws NoGirlFriendException 没有女朋友异常
     */
    public static void buyOneFreeOne(boolean singledog) throws NoGirlFriendException {
        if (singledog) {
            throw new NoGirlFriendException("两只黄鹂鸣翠柳，你还没有女朋友");
        }

        System.out.println("买蜜雪冰城送保时捷一辆");
    }
}

/*
 * 自定义异常
 */
class NoGirlFriendException extends Exception {
    /**
     * 无参构造方法
     */
    public NoGirlFriendException() {

    }

    /**
     * 带有String类型参数的构造方法
     *
     * @param message 描述当前的异常信息
     */
    public NoGirlFriendException(String message) {
        super(message);
    }
}