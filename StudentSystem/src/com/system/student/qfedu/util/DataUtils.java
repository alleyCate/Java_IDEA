package com.system.student.qfedu.util;

import com.system.student.qfedu.entity.Student;
import com.system.student.qfedu.manager.StudentManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataUtils {
    /**
     * 从文件中读取数据到StudentManager对象中
     *
     * @param studentManager 学生管理类对象
     */
    public static void readDate(StudentManager studentManager) {

    }

    /**
     * 从StudentManager中保存数据到文件
     *
     * @param studentManager 学生管理类对象
     */
    public static void saveData(StudentManager studentManager) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(new File("./data/student.txt")));

            Student[] allStudent = studentManager.getAllStudent();
            for (int i = 0; i < allStudent.length; i++) {
                bw.write(allStudent[i].getData());
                bw.newLine();
            }

            bw.write("count:" + Student.getCount());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
