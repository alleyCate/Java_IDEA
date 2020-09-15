package Day12.a_throwable;

/*
 * 抛出异常总结：
 *      1.
 */

public class Demo4 {
    //调用带有异常抛出的方法，如果选择继续抛出需要在当前方法的声明位置告知其他调用者，这里有什么异常抛出
    public static void main(String[] args) throws ArithmeticException,NullPointerException {
        //调用一个带有异常抛出的方法
        //捕获异常
        try {
            test(10, 0, null);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        //可以继续抛出异常
        test(10, 0, null);
    }

    /**
     * 测试方法
     *
     * @param num1 int类型
     * @param num2 int类型
     * @param arr int类型数组
     * @throws ArithmeticException 除数不能为0
     * @throws NullPointerException 操作数组null地址异常
     */
    public static void test(int num1, int num2, int[] arr) throws ArithmeticException, NullPointerException {
        //参数合法性判断
        /*if (0 == num2 || null == arr) {
            System.out.println("Input Parameter is Invalid");
            return;
        }*/

        //抛出异常方式来处理当前的参数合法性判断
        if (0 == num2) {
            //有可能导致算数异常
            throw new ArithmeticException("算术异常");
        }

        if (null == arr) {
            //存在数组操作空指针异常
            throw new NullPointerException("数组空指针异常");
        }

        System.out.println(num1 / num2);
        arr[0] = 10;

    }
}
