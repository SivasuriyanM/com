package com.oops;

import com.dsa.accessModifiers;

public class subclass extends accessModifiers {

    public subclass(int num) {
        super(num);
    }

    public static void main(String[] args) {
        subclass obj = new subclass(5);
        int n = obj.getNum();
        subclass2 obj2 = new subclass2(3);
        int n2 = obj2.getNum();
        System.out.println(n2);
    }
}

class subclass2 extends accessModifiers {

    public subclass2(int num) {
        super(num);
    }

    public static void main(String[] args) {
        subclass obj = new subclass(5);
        int n = obj.getNum();
    }
}
