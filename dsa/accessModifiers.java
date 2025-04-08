package com.dsa;

public class accessModifiers {

    public String name;
    private int age;
    protected int num;
    int amt;

    public accessModifiers(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public static void main(String[] args) {
        accessModifiers obj = new accessModifiers(10);
        System.out.println("value is: " + obj.num);
    }

}
