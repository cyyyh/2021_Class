package com.collection;

import com.test.Box;
import com.test.Box1;
import com.test.Box2;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 3;
//        nums[3] = "Cynthia";
//        nums[2] = true;
        ArrayList list = new ArrayList();
        list.add("Cynthia");
        list.add(123);
        list.add(true);
        Box1 box = new Box1();
        list.add(box);
        // Heterogeneous NG!?
        String name = (String)list.get(0);
        String kk = (String)list.get(1);
        //
        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(box1);
        boxes.add(box2);
        Box b = boxes.get(0);

    }
}
