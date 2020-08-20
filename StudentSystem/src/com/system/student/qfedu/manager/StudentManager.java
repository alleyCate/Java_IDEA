package com.system.student.qfedu.manager;

import com.system.student.qfedu.entity.Student;
import javafx.css.Size;

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
     *      返回值类型：
     *          添加成功返回true，失败返回false
     *      方法名：
     *          add
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
        /*
         * 这里需要存储到数组的末尾，尾插法来完成的
         * 计数器
         *      1.数据类型 int
         *          (a) 有效元素个数
         *          (b) 下一次存放的位置
         *      2.采用哪种方式
         *          局部变量
         *              定义在方法内部，方法调用时存在，方法运行结束，局部变量销毁，
         *              没有复用性，没有持久性，方法下一次执行无法获取之前的数据，不能满足需求！。
         *          成员变量
         *              定义在类内，当前对象创建时存在，对象销毁时被销毁，当前方法也是一个成员方法，
         *              和成员变量生存周期一致，可以满足需求！
         *          静态成员变量
         *              定义在类内，随着类文件的加载而出现，和对象无关，不管创建多少个StudentManager对象，
         *              都是使用一个计数器。共享资源，会导致代码出现问题。不具备对每一个类的独立性，不可以考虑！
         */
        allStus[size] = student;
        size += 1;

        return true;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(allStus[i]);
        }
    }

}
