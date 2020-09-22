package com.system.student.qfedu.manager;

import com.system.student.qfedu.entity.Student;
import java.util.Scanner;

/**
 * 学生管理类
 *
 * @author alleyCat
 */
public class StudentManager {
    /**
     * 保存学生数据的Student类型数组
     * 这里只有一个数组的引用，并没有数组的真实空间
     */
    private Student[] allStus;

    /**
     * 这里是允许的数组容量的最大值！！！
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * 定义一个成员变量，私有化静态final修饰，描述默认初始化容量问题
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 数组有效元素计数器，记录当前数组中有多少有效元素
     */
    private int size = 0;

    /**
     * 构造方法
     * 这里需要提供一个数组初始化容量进行数据保存和操作
     */
    public StudentManager() {
        //给予初始化容量，可以保存10个学生数据
        allStus = new Student[DEFAULT_CAPACITY];
    }

    /**
     * 给予用户初始化底层保存数据的数组容量大小空间
     *
     * @param initCapacity 用户指定的初始化容量，不能小于等于0，不能大于MAX_ARRAY_SIZE
     *                                                             MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8
     */
    public StudentManager(int initCapacity) {
        //不允许！！！
        if (initCapacity <= 0 || initCapacity > MAX_ARRAY_SIZE) {
            System.out.println("超出合理范围，给予一个默认的初始化容量使用");
            allStus = new Student[DEFAULT_CAPACITY];
        } else {
            //满足要求，按照用户指定的容量创建对应的数组
            allStus = new Student[initCapacity];
        }
    }

    /*
     * 增加学生的方法
     * 方法分析：
     *      权限修饰符 public
     *      不需要 static 修饰
     *      返回值类型：boolean 添加成功返回true，失败返回false
     *      方法名：add
     *      形式参数列表：
     *          Student类对象
     *          (Student student)
     * 方法声明：
     *      public boolean add(Student student)
     *
     */
    /**
     * 添加哟个学生类对象到底层Student数组allStus中
     *
     * @param student Student类对象
     * @return 添加成功返回true，失败返回false
     */
    public boolean add(Student student) {
//        /*
//         * 这里需要存储到数组的末尾，尾插法来完成的
//         * 计数器
//         *      1.数据类型 int
//         *          (a) 有效元素个数
//         *          (b) 下一次存放的位置
//         *      2.采用哪种方式
//         *          局部变量
//         *              定义在方法内部，方法调用时存在，方法运行结束，局部变量销毁，
//         *              没有复用性，没有持久性，方法下一次执行无法获取之前的数据，不能满足需求！。
//         *          成员变量
//         *              定义在类内，当前对象创建时存在，对象销毁时被销毁，当前方法也是一个成员方法，
//         *              和成员变量生存周期一致，可以满足需求！
//         *          静态成员变量
//         *              定义在类内，随着类文件的加载而出现，和对象无关，不管创建多少个StudentManager对象，
//         *              都是使用一个计数器。共享资源，会导致代码出现问题。不具备对每一个类的独立性，不可以考虑！
//         */
//
//        //如果发现size有效元素个数和数组的容量一直
//        if (size == allStus.length) {
//            //最小要求的当前有效元素个数+1,因为目前是添加一个元素
//            grow(size + 1);
//        }
//
//        allStus[size] = student;
//        size += 1;

        //调用指定下标位置插入元素的方法，只不过指定下标位置是size
        //等价于尾插法
        add(size, student);

        return true;
    }

    /*
     * 需求
     *      在指定下标位置添加指定学生类对象
     * 方法分析：
     *      权限修饰符：public
     *      非静态修饰，需要使用类内非静态成员
     *      返回值类型：boolean
     *      方法名：add 方法的重载机制，方法参数不一致，满足重载要求
     *      形式参数列表：
     *          1.指定下标位置：0 <= index <= size
     *          2.指定的Student类对象
     * 方法声明：
     *      public boolean add(int index, Student stu)
     */
    /**
     * 在指定下标位置添加指定元素
     *
     * @param index 指定的下标位置， 0 <= index <= size
     * @param stu Student类对象
     * @return 添加成功返回true，失败返回false
     */
    public boolean add(int index, Student stu) {
        //判断用户传入点的index数据是否合法
        if (index > size || index < 0) {
            System.out.println("Input Parameter is Invalid");
            return false;
        }

        //容量不足可以扩容操作
        if (size == allStus.length) {
            grow(size + 1);
        }

        /*
         * 1 3 5 7 9 0
         *
         * index = 2 添加元素10
         * ==> 1 3 10 5 7 9
         *
         * allStus[5] = allStus[4]
         * allStus[4] = allStus[3]
         * allStus[3] = allStus[2]
         */

        for (int i = size; i > index; i--) {
            allStus[i] = allStus[i - 1];
        }

        allStus[index] = stu;
        size += 1;

        return true;
    }

    /*
     * 需求
     *      根绝学生的ID号，删除对应的学生信息
     * 方法分析：
     *      权限修饰符：public
     *      非静态成员方法
     *      返回值类型：Student 类对象，删除的Student类对象，可以用于后期的数据暂存服务，给用户提供一个可以缓冲的余地
     *      方法名：remove 移除
     *      形式参数列表：
     *          1.Student ID号
     *          2.int id
     * 方发声明
     *      public Student remove(int id)
     *
     */

    /**
     * 根据学生ID号，删除对应的学生信息
     *
     * @param id 指定的学生ID
     * @return 被删除的学生类对象，如果删除失败，返回null
     */
    public Student remove(int id) throws StudentIdParameterException {
        //调用类内私有化方法，提供指定ID对应的下标位置
        int index = findIndexId(id);

        Student stu = null;

        if (index >= 0) {
            //保留被删除的学生信息
            stu = allStus[index];
            //删除操作
            for (int i = index; i < size - 1; i++) {
                allStus[i] = allStus[i + 1];
            }

            //保证原本最后一个有效元素内容==null
            allStus[size - 1] = null;
            //删除一个元素之后，有效元素格式 -1
            size -= 1;
        }

        return stu;
    }

    /*
     * 需求：
     *      修改指定ID学生的信息
     * 方法分析：
     *      权限修饰符：public
     *      非静态成员方法
     *      返回值类型：boolean 操作成功返回true 失败返回false
     *      方法名：modify 修改
     *      形式参数列表：int id 指定的学生ID号
     *方发声明：
     *      public boolean modify(int id)
     */

    /**
     *  修改指定ID学生的信息
     *  问题：
     *      当前方法的行数超出要求的代码行数80行！！！
     *
     * @param id 指定的学生ID
     * @return 删除操作成功返回true，失败返回false
     */
    public boolean modify(int id) throws StudentIdParameterException {
        //调用类内私有化方法，提供指定ID对应的下标位置
        int index = findIndexId(id);

        //不存在指定元素
        if (-1 == index) {
            return false;
        }

        //获取指定下标的元素
        Student stu = allStus[id];

        int choose = 0;
        //退出标记
        boolean flag = false;
        Scanner sc = new Scanner(System.in);

        while (true) {
            //展示当前Student类对象数据情况
            System.out.println("ID:" + stu.getId());
            System.out.println("Name:" + stu.getName() + "Age:" + stu.getAge() + "Gender:" + stu.getGender());
            System.out.println("MathScore:" + stu.getMathScore() + "ChnScore:" + stu.getChnScore() + "EngScore:" + stu.getEngScore());
            System.out.println("TotalScore:" + stu.getTotalScore() + "Rank:" + stu.getRank());
            System.out.println("1.修改学生姓名");
            System.out.println("2.修改学生年龄");
            System.out.println("3.修改学生性别");
            System.out.println("4.修改学生数学成绩");
            System.out.println("5.修改学生语文成绩");
            System.out.println("6.修改学生英语成绩");
            System.out.println("7.退出");

            choose= sc.nextInt();
            //出去输入之后的/n
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("请输入学生姓名");
                    String name = sc.nextLine();

                    stu.setName(name);
                    break;
                case 2:
                    System.out.println("请输入学生年龄");
                    int age = sc.nextInt();

                    stu.setAge(age);
                    break;
                case 3:
                    System.out.println("请输入学生性别");
                    char gender = sc.nextLine().charAt(0);

                    stu.setGender(gender);
                    break;
                case 4:
                    System.out.println("请输入学生数学成绩");
                    int mathScore = sc.nextInt();

                    stu.setMathScore(mathScore);
                    break;
                case 5:
                    System.out.println("请输入学生语文成绩");
                    int chnScore = sc.nextInt();

                    stu.setChnScore(chnScore);
                    break;
                case 6:
                    System.out.println("请输入学生英语成绩");
                    int engScore = sc.nextInt();

                    stu.setEngScore(engScore);
                    break;
                case 7:
                   flag = true;
                    break;
                default:
                    System.out.println("选择有误");
                    break;

            }

            if (flag) {
                //跳出循环结构
                break;
            }
        }

        return true;
    }

    /*
     * 需求：
     *      根据指定的ID获取Student类对象
     * 方法分析：
     *      权限修饰符：public
     *      非静态成员方法
     *      返回值类型： Student类对象
     *      方法名：add
     *      形式参数列表： int id 用户指定ID
     * 方发声明：
     *      public Student get(int id)
     */

    /**
     * 根据指定的ID号，返回对应Student类对象
     *
     * @param id 指定的ID号
     * @return 找到返回对应的Student类对象，没有找到返回null
     */
    public Student get(int id) throws StudentIdParameterException {
        int index = findIndexId(id);

        return index >= 0 ? allStus[index] : null;
    }

    /*
     * 排序算法
     * 需求：
     *      数学成绩降序排序
     * 方法分析：
     *      权限修饰符：public
     *      非静态成员方法
     *      返回值类型：void
     *      方法名：selectByAgeDesc
     *      形式参数列表：不需要参数
     * 方法声明：
     *      public void selectByAgeDesc()
     */

    /**
     * 根据年龄降序完成排序展示数据
     */
    public void selectByAgeDesc() {
        //这里不能在源数据数组中进行排序，需要保护数据，拷贝一个新数组
        Student[] sortTemp = new Student[size];

        for (int i= 0; i < sortTemp.length; i++) {
            sortTemp[i] = allStus[i];
        }

        //选择排序算法
        for (int i = 0; i < size - 1; i ++) {
            int index = i;

            for (int j = i + 1; j < size; j++) {
                //两个学生类对象中的年龄比较
                if (sortTemp[index].getAge() < sortTemp[j].getAge()) {
                    index = j;
                }
            }

            if (index != i) {
                Student temp = sortTemp[index];
                sortTemp[index] = sortTemp[i];
                sortTemp[i] = temp;
            }

        }

        //展示数据的过程
        for (int i = 0; i < sortTemp.length; i++) {
            System.out.println(sortTemp[i]);
        }

    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(allStus[i]);
        }
    }

    /*
     * 添加方法需要考虑扩容问题
     * 添加数据时会调用当前的扩容方法
     *      1.自动调用
     * 是否要求类外可已使用
     *      2.不允许类外使用，只允许在add方法发现容量不足的情况下使用
     *      private方法
     * 考虑最小扩容容量
     *      3.满足当前添加操作的最小容量要求
     *
     * 方法分析：
     *      private修饰，类外不能使用
     *      非静态方法，需要使用类内的成员变量
     *      返回值类型： void
     *      方法名: grow
     *      形式参数列表： int minCapacity 最小容量要求
     *
     * 方法声明：
     *      private void grow(int minCapacity)
     *
     * 流程：
     *      数组的容量从基本语法要求，是不可以更改的！！！
     *      这里需要一个新的数组
     *      源数据数组中能够提供：
     *          1.原始容量
     *          2.原始数据
     *      1.获取源数组容量
     *      2.计算得到新数组容量，新数组容量是原数据数组的1.5倍左右
     *      3.判断新数组容量要求是否能够满足最小容量要求
     *      4.创建新数组
     *      5.复制源数据数组中的内容到新数组中
     *      6.保存新数组首地址
     */

    /**
     * 底层保存Student数据数组扩容方法
     *
     * @param minCapacity 指定要求的最小容量，作为容量约束！！
     */
    private void grow(int minCapacity) {
        //1.获取源数组容量
        int oldCapacity = allStus.length;

        //2.计算得到新数组容量，新数组容量是原数据数组的1.5倍左右
        // oldCapacity >> 1 当前数据右移一位 == / 2; 但是效率搞那么一丢丢
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        //3.判断新数组容量要求是否能够满足最小容量要求
        if (minCapacity > newCapacity) {
            newCapacity = minCapacity;
        }

        //4.创建新数组
        Student[] temp = new Student[newCapacity];

        //5.复制源数据数组中的内容到新数组中
        for (int i = 0; i < size; i++) {
            temp[i] = allStus[i];
        }

        //6.保存新数组首地址
        allStus = temp;
    }

    /*
     * 需求：
     *      发现很多地方都需要使用一个通过学生ID获取当前学生在数组中下标位置的方法。
     * 方法分析：
     *      权限修饰符：private 数组的下标位置是一个核心数据，如果提供给类外使用有可能会导致其他问题。该方法只有类内删除，修改，查询使用。
     *      非静态成员方法
     *      返回值类型：int
     *      方法名：findIndexById
     *      形式参数列表：int id
     *方发声明：private int findIndexId()
     */

    /**
     * 类内的私有化成员方法，用于根据用户指定的ID号获取对应的学生类对象在底层数组中的下标位置，提供给类内其他成员方法使用
     *
     * @param id 指定的学生ID号
     * @return 如果找到学生对象返回值大于等于0，没有找到返回-1
     */
    private int findIndexId(int id) throws StudentIdParameterException {
        /*//参数合法性判断
        if (id < 0) {
            System.out.println("Input Parameter is Invalid!");
            return -1;
        }*/

        /*
         * 参数合法性判断
         */
        studentIdParameterCheck(id);

        //数组中的存放的学生类对象的ID比较
        int index = -1;

        //循环结束可以找到指定的下标位置
        for (int i = 0; i < size; i++) {
            if (allStus[i].getId() == id) {
                index = i;
                break;
            }
        }

        return index;
    }

    /**
     * 自定义异常-学生ID参数异常
     */
    public static class StudentIdParameterException extends Exception {
        /**
         * 无参构造方法
         */
        public StudentIdParameterException() {

        }

        /**
         * 带有String类型参数的构造方法
         *
         * @param message 描述当前的异常信息
         */
        public StudentIdParameterException(String message) {
            super(message);
        }
    }

    /**
     * 输入参数检查方法
     * @param id 指定的学生ID号
     * @throws StudentIdParameterException 输入学生id参数异常
     */
    public static void studentIdParameterCheck(int id) throws StudentIdParameterException {
        if (id < 0) {
            throw new StudentIdParameterException("Input Parameter is Invalid!");
        }
    }

}
