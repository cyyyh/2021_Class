package com.practice;

import com.test.Box1;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        int[] nums = new int[5];
        ArrayList list = new ArrayList();
        list.add("Cynthia");

        Integer n = new Integer(123);
        Boolean b = new Boolean(true);
        Character c = new Character('5');
        Double d = new Double(1.23456789);
        Float f = new Float(1.234);
        Short s = new Short((short) 2);
        Long l = new Long(123456789);

        list.add(n);
        list.add(b);
        list.add(c);
        Box1 box = new Box1();
        list.add(box);

        String name = (String) list.get(0);
        String kk = (String) list.get(1);
        //
        Box1 box1 = new Box1();
        
    }
}
