package com.system.student.qfedu.manager;

import com.system.student.qfedu.compare.MyComparator;
import com.system.student.qfedu.entity.Student;
import com.system.student.qfedu.util.MyArrayList;

import java.util.Scanner;

/**
 * 学生管理类
 *
 * @author alleyCat
 */
public class StudentManager {
    /**
     * 保存学生数据的MyArrayList类型集合
     * 这里只有一个数组的引用，并没有数组的真实空间
     */
    private MyArrayList<Student> allStus;

    /**
     * 构造方法
     * 这里需要提供一个数组初始化容量进行数据保存和操作
     */
    public StudentManager() {
        //给予初始化容量，可以保存10个学生数据
        allStus = new MyArrayList<>();
    }

    /**
     * 给予用户初始化底层保存数据的数组容量大小空间
     *
     * @param initCapacity 用户指定的初始化容量，不能小于等于0，不能大于MAX_ARRAY_SIZE
     *                     MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8
     */
    public StudentManager(int initCapacity) {
        allStus = new MyArrayList<>(initCapacity);
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
        add(allStus.size(), student);

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
     * @param stu   Student类对象
     * @return 添加成功返回true，失败返回false
     */
    public boolean add(int index, Student stu) {
        allStus.add(index, stu);
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
    public Student remove(int id) {
        //调用类内私有化方法，提供指定ID对应的下标位置
        int index = findIndexById(id);

        return allStus.remove(index);
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
     * 修改指定ID学生的信息
     * 问题：
     * 当前方法的行数超出要求的代码行数80行！！！
     *
     * @param id 指定的学生ID
     * @return 删除操作成功返回true，失败返回false
     */
    public boolean modify(int id) {
        //调用类内私有化方法，提供指定ID对应的下标位置
        int index = findIndexById(id);

        //不存在指定元素
        if (-1 == index) {
            return false;
        }

        //获取指定下标的元素
        Student stu = allStus.get(index);

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

            choose = sc.nextInt();
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
    public Student get(int id) {
        int index = findIndexById(id);

        return allStus.get(index);

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
    }

    /**
     * 选择排序算法，但是需要依赖于MyComparator接口来提供排序算法核心比较内容
     *
     * @param com MyComparator,遵从MyComparator接口实现类对象
     */
    public void selectSortUsingComparator(MyComparator com) {
        //这里不能在源数据数组中进行排序，需要保护数据，拷贝一个新数组
        int size = allStus.size();
        Student[] sortTemp = new Student[size];

        for (int i = 0; i < sortTemp.length; i++) {
            sortTemp[i] = allStus.get(i);
        }

        //选择排序算法
        for (int i = 0; i < size - 1; i++) {
            int index = i;

            for (int j = i + 1; j < size; j++) {
                //【核心比较方式】
                //if (sortTemp[index].getAge() < sortTemp[j].getAge()) {
                if (com.compare(sortTemp[index], sortTemp[j])) {
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
        for (int i = 0; i < allStus.size(); i++) {
            System.out.println(allStus.get(i));
        }
    }

    /**
     * 返回整个StudentManager中保存的所有Student的类对象数组
     *
     * @return Student类对象数组
     */
    public Student[] getAllStudent() {
        Student[] stus = new Student[allStus.size()];

        for (int i = 0; i < stus.length; i++) {
            stus[i] = allStus.get(i);
        }

        return stus;
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
    private int findIndexById(int id) {
        /*
         * 参数合法性判断
         */
        if (id < 0) {
            throw new ArrayIndexOutOfBoundsException("Input Parameter is Invalid!");
        }

        //数组中的存放的学生类对象的ID比较
        int index = -1;
        int size = allStus.size();

        //循环结束可以找到指定的下标位置
        for (int i = 0; i < allStus.size(); i++) {
            if (allStus.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }
}


