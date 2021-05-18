package cc.box;

public class Box4 extends Box{
    public Box4(){
        length = 15;
        width = 15;
        height = 10;
    }
    @Override
    public String getName(){
        return "Box4";
    }
    @Override
    public  int getPrice(){
        return 70;
    }

}
