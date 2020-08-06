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
     * 构造方法
     * 这里需要提供一个数组初始化容量进行数据保存和操作
     */
    public StudentManager() {
        //给予初始化容量，可以保存10个学生数据
        allStudent = new Student[10];
    }

    /**
     * 给予用户初始化底层保存数据的数组容量大小空间
     *
     * @param initCapacity 用户指定的初始化容量，不能小于等于0，不能大于MAX_ARRAY_SIZE
     *                                                             MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8
     */
    public StudentManager(int initCapacity) {
        //不允许！！！
        if (initCapacity <= 0 || initCapacity > Max_ARRAY_SIZE) {
            System.out.println("超出合理范围，给予一个默认的初始化容量使用");
            allStudent = new Student[10];
        } else {
            //满足要求，按照用户指定的容量创建对应的数组
            allStudent = new Student[initCapacity];
        }
    }
}
