package com.system.student.qfedu.compare;

import com.system.student.qfedu.entity.Student;

public interface MyComparator {
    /**
     * 学生自定义比较方式接口方法，要求比较的是两个Student类对象
     * 比较方式由MyComparator接口实现类对象来完成。
     *
     * @param stu1 Student类对象
     * @param stu2 Student类对象
     * @return 满足条件返回true，不满足条件返回false
     */
    boolean compare(Student stu1, Student stu2);
}
