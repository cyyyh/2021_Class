package cc.box;

import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args){
        Box3 box3 = new Box3();

        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter object\'s length: ");
        int length = Integer.parseInt(scan.next());
        System.out.println("PLease enter object\'s width: ");
        int width = Integer.parseInt(scan.next());
        System.out.println("PLease enter object\'s height: ");
        int height = Integer.parseInt(scan.next());
        System.out.println("Length: " + length + "Width: " + width + "Height: " + height);
        if (box3.validate(length, width, height)){
            System.out.println(box3.getName());
        }
    }
}
