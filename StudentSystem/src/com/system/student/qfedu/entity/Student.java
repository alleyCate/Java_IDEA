package com.system.student.qfedu.entity;

/**
 * 学生实体类
 *
 * @author alleyCat
 */
public class Student {
    /**
     * ID具有唯一性，问题1
     * 每一个类对象的ID不可重复
     * 【创建】每一个对象时，ID都需要【自动】赋值，赋值的数据有一定的【持久性】
     * 创建 ==> new 构造方法();
     * 自动 ==> 构造代码块，每一次创建对象，使用构造方法一定会执行
     * 持久性 ==>
     *      1.可以给每一个类对象进行赋值操作，但是又独立于对象之外
     *      2.程序不退出，计数依然存在
     *      3.需要的数据类型int，并且不希望公开
     *      private static int count = 1;
     */
    private int id;
    private String name;
    private int age;
    private char gender;
    private int mathScore;
    private int chnScore;
    private int engScore;
    /**
     * 需要通过数学。英语，语文相加得到。所有涉及到数据更改的位置，都需要修改总成绩
     */
    private int totalScore;
    /**
     * 总分只要受到影响，rank排名需要新来过
     * 需要后面的业务来完成
     */
    private int rank;

    /**
     * 类对象计数器，每一次创建对象，赋值ID属性，同时自增长
     */
    private static int count = 1;

    //构造代码块
    {
        //使用count计数器赋值ID属性，同时count++自增操作
        id = count++;
    }

    public Student() {
    }

    public Student(String name, int age, char gender, int mathScore, int chnScore, int engScore) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mathScore = mathScore;
        this.chnScore = chnScore;
        this.engScore = engScore;

        //计算总分
        this.totalScore = mathScore + chnScore + engScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        //修改总分
        //1.减去原数学成绩
        this.totalScore -= this.mathScore;

        //2.加上现有数学成绩
        this.totalScore += mathScore;

        this.mathScore = mathScore;
    }

    public int getChnScore() {
        return chnScore;
    }

    public void setChnScore(int chnScore) {
        //参考数学成绩修改方法
        this.totalScore -= this.chnScore;
        this.totalScore += chnScore;
        this.chnScore = chnScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        //参考数学成绩修改方法
        this.totalScore -= this.engScore;
        this.totalScore += engScore;
        this.engScore = engScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", mathScore=" + mathScore +
                ", chnScore=" + chnScore +
                ", engScore=" + engScore +
                ", totalScore=" + totalScore +
                ", rank=" + rank +
                '}';
    }
}
