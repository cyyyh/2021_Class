package cc.box;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Box[] boxes = {new Box1(), new Box2(), new Box3(), new Box4()};

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter object\'s length: ");
        int length = Integer.parseInt(scanner.next());
        System.out.println("PLease enter object\'s width: ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("PLease enter object\'s height: ");
        int height = Integer.parseInt(scanner.next());
        System.out.println("Length: " + length + "Width: " + width + "Height: " + height);
        for (Box box : boxes){
            if (box.validate(length, width, height)){
                System.out.println(box.getName() + "/" +box.getPrice());
                break;
            }
        }
    }
}
