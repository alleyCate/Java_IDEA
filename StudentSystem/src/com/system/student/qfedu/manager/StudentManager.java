package com.system.student.qfedu.manager;

import com.system.student.qfedu.entity.Student;

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
    private Student[] allStudent;

    /**
     * 这里是允许的数组容量的最大值！！！
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * 定义一个成员变量，私有化静态final修饰，描述默认初始化容量问题
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 构造方法
     * 这里需要提供一个数组初始化容量进行数据保存和操作
     */
    public StudentManager() {
        //给予初始化容量，可以保存10个学生数据
        allStudent = new Student[DEFAULT_CAPACITY];
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
            allStudent = new Student[DEFAULT_CAPACITY];
        } else {
            //满足要求，按照用户指定的容量创建对应的数组
            allStudent = new Student[initCapacity];
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
         */
        return  true;
    }
}
