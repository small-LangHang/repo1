package com.lianghang.git;

/**
 * @Author: LiangHang
 * @date 2020/12/14
 */
public class FirstClss {
    private int age;
    private String name;
    private int sex;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        System.out.println("Hello Git");
        System.out.println("Hello Git");
        System.out.println("Hello Git");
        System.out.println("Hello Git");
        System.out.println("Hello Git");
        System.out.println("Hello Git");
        FirstClss firstClss = new FirstClss();
        firstClss.setSex(1);
        firstClss.setAge(18);
        firstClss.setName("zhangsan");

    }
}
