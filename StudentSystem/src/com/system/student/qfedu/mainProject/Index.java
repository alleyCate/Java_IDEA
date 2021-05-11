package com.system.student.qfedu.mainProject;

import com.system.student.qfedu.entity.Student;
import com.system.student.qfedu.manager.StudentManager;

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

        studentManager.add(new Student("学生1", 18, '男', 54, 67, 93));
        studentManager.add(new Student("学生2", 45, '男', 31, 46, 35));
        studentManager.add(new Student("学生3", 12, '男', 54, 89, 73));
        studentManager.add(new Student("学生4", 31, '男', 85, 13, 78));
        studentManager.add(new Student("学生5", 85, '男', 23, 64, 54));
        studentManager.add(new Student("学生5", 16, '男', 15, 76, 56));
        studentManager.add(new Student("学生6", 35, '男', 67, 46, 23));
        studentManager.add(new Student("学生8", 64, '男', 90, 78, 46));
        studentManager.add(new Student("学生9", 34, '男', 36, 13, 46));

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
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 8:

                    break;
                default:
                    break;
            }
        }
    }
}
