package com.system.student.qfedu.mainProject;

import com.system.student.qfedu.entity.Student;
import com.system.student.qfedu.manager.StudentManager;
import com.system.student.qfedu.util.DataUtils;

import java.util.Scanner;

/**
 * main方法
 *
 * @author alleyCat
 */
public class Index {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int id = 0;
        int choose = 0;
        boolean flag = false;
        StudentManager studentManager = new StudentManager();

        DataUtils.readDate(studentManager);

        while (true) {
            System.out.println("********************欢迎来到ZX学生管理系统********************");
            System.out.println("***************     1.查看所有学生       ***************");
            System.out.println("***************     2.查看指定学生       ***************");
            System.out.println("***************     3.添加一个学生       ***************");
            System.out.println("***************     4.删除指定学生       ***************");
            System.out.println("***************     5.修改指定学生       ***************");
            System.out.println("***************     6.排序学生信息       ***************");
            System.out.println("***************     8.退出             ***************");
            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    studentManager.show();
                    break;
                case 2:
                    System.out.println("请输入需要查询的学生ID号");
                    id = scanner.nextInt();
                    Student student = studentManager.get(id);
                    if (null == student) {
                        System.out.println("该学生不存在");
                    } else {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    Student stu = null;

                    System.out.println("请输入学生姓名");
                    String name = scanner.nextLine();
                    System.out.println("请输入学生年龄");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("请输入学生性别");
                    char gender = scanner.nextLine().charAt(0);
                    System.out.println("请输入学生数学成绩");
                    int mathScore = scanner.nextInt();
                    System.out.println("请输入学生语文成绩");
                    int chnScore = scanner.nextInt();
                    System.out.println("请输入学生英语成绩");
                    int engScore = scanner.nextInt();

                    stu = new Student(name, age, gender, mathScore, chnScore, engScore);
                    studentManager.add(stu);
                    break;
                case 4:
                    System.out.println("请输入需删除的学生ID号");
                    id = scanner.nextInt();
                    studentManager.remove(id);
                    break;
                case 5:
                    System.out.println("请输入需修改的学生ID号");
                    id = scanner.nextInt();
                    studentManager.modify(id);
                    break;
                case 6:
                    sortChoose(studentManager);
                    break;
                case 8:
                    System.out.println("退出");
                    flag = true;
                    break;
                default:
                    break;
            }

            if (flag) {
                // 测试关闭程序保存数据
                DataUtils.saveData(studentManager);
                break;
            }
        }
    }

    /**
     * 排序选择模式
     *
     * @param studentManager 需要排序的学生类对象
     */
    public static void sortChoose(StudentManager studentManager) {
        System.out.println("请选择排序方式");
        System.out.println("1.总成绩升序");
        System.out.println("2.总成绩降序");
        System.out.println("3.年龄升序");
        System.out.println("4.年龄降序");
        System.out.println("5.数学成绩升序");
        System.out.println("6.数学成绩降序");
        System.out.println("7.语文成绩升序");
        System.out.println("8.语文成绩降序");
        System.out.println("9.英语成绩升序");
        System.out.println("10.英语成绩降序");

        int choose = 0;
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                studentManager.selectSortUsingComparator((stu1, stu2) -> stu1.getTotalScore() > stu2.getTotalScore());
                break;
            case 2:
                studentManager.selectSortUsingComparator((stu1, stu2) -> stu2.getTotalScore() > stu1.getTotalScore());
                break;
            case 3:
                studentManager.selectSortUsingComparator((stu1, stu2) -> stu1.getAge() > stu2.getAge());
                break;
            case 4:
                studentManager.selectSortUsingComparator((stu1, stu2) -> stu2.getAge() > stu1.getAge());
                break;
            case 5:
                studentManager.selectSortUsingComparator((stu1, stu2) -> stu1.getMathScore() > stu2.getMathScore());
                break;
            case 6:
                studentManager.selectSortUsingComparator((stu1, stu2) -> stu2.getMathScore() > stu1.getMathScore());
                break;
            case 7:
                studentManager.selectSortUsingComparator((stu1, stu2) -> stu1.getChnScore() > stu2.getChnScore());
                break;
            case 8:
                studentManager.selectSortUsingComparator((stu1, stu2) -> stu2.getChnScore() > stu1.getChnScore());
                break;
            case 9:
                studentManager.selectSortUsingComparator((stu1, stu2) -> stu1.getEngScore() > stu2.getEngScore());
                break;
            case 10:
                studentManager.selectSortUsingComparator((stu1, stu2) -> stu2.getEngScore() > stu1.getEngScore());
                break;
            default:
                System.out.println("选择错误");
                break;
        }
    }
}
