package com.example.sureoa.dao.entity;

public enum EnumTest {
    SUCCESS("1","董鹏飞"),ERROR("2","蓝猫");


    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    EnumTest(String name,String age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
