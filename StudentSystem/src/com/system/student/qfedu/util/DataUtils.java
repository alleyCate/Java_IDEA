package com.system.student.qfedu.util;

import com.system.student.qfedu.entity.Student;
import com.system.student.qfedu.manager.StudentManager;

import java.io.*;

public class DataUtils {
    /**
     * 从文件中读取数据到StudentManager对象中
     *
     * @param studentManager 学生管理类对象
     */
    public static void readDate(StudentManager studentManager) {
        /*
         * {7,学生6,35,男,67,46,23,136,0}
         * {8,学生8,64,男,90,78,46,214,0}
         * {9,学生9,34,男,36,93,46,175,0}
         * count:10
         */
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(new File("./StudentSystem/data/student.txt")));

            String data = null;

            while ((data = br.readLine()) != null) {
                if ('{' == data.charAt(0)) {
                    //学生数据
                    String[] split = data.substring(1, data.length() - 1).split(",");

                    // 解析数组中每一个元素对应的数据
                    int id = Integer.parseInt(split[0]);
                    String name = split[1];
                    int age = Integer.parseInt(split[2]);
                    char gender = split[3].charAt(0);
                    int mathScore = Integer.parseInt(split[4]);
                    int chnScore = Integer.parseInt(split[5]);
                    int engScore = Integer.parseInt(split[6]);
                    int totalScore = Integer.parseInt(split[7]);
                    int rank = Integer.parseInt(split[8]);

                    //创建Student类对象，存储到StudentManager中
                    Student student = new Student(id, name, age, gender, mathScore, chnScore, engScore, totalScore, rank);
                    studentManager.add(student);
                } else if ('c' == data.charAt(0)) {
                    // count数据 count:10
                    Student.setCount(Integer.parseInt(data.split(":")[1]));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 从StudentManager中保存数据到文件
     *
     * @param studentManager 学生管理类对象
     */
    public static void saveData(StudentManager studentManager) {
        BufferedWriter bw = null;

        try {
            // 选择写入文件的方式是删除写！
            bw = new BufferedWriter(new FileWriter(new File("./StudentSystem/data/student.txt")));

            // 获取StudentManager对象中保存的所有学生类对象数据
            Student[] allStudent = studentManager.getAllStudent();
            for (int i = 0; i < allStudent.length; i++) {
                // 写入学生数据
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
