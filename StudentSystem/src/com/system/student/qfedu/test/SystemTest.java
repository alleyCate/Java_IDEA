package com.system.student.qfedu.test;

import com.system.student.qfedu.entity.Student;
import com.system.student.qfedu.manager.StudentManager;
import org.junit.Test;


/**
 * 功能测试类
 *
 * @author alleyCat
 */
public class SystemTest {
    @Test
    public void testStudent() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student("懒羊", 16, '男', 99, 95, 97);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
    }

    @Test
    public void testAdd() {
        StudentManager studentManager = new StudentManager();

        studentManager.add(new Student());
        studentManager.add(new Student());
        studentManager.add(new Student());
        studentManager.add(new Student());
        studentManager.add(new Student());
        studentManager.add(new Student("懒羊", 16, '男', 99, 95, 97));
        studentManager.add(new Student("懒羊", 16, '男', 99, 95, 97));
        studentManager.add(new Student("懒羊", 16, '男', 99, 95, 97));
        studentManager.add(new Student("懒羊", 16, '男', 99, 95, 97));
        studentManager.add(new Student("懒羊", 16, '男', 99, 95, 97));

        studentManager.show();
    }
}


