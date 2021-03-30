package cc.stud;

public class GraduateStudent extends Student
implements Mailer{
    int thesis;
    public GraduateStudent(String id, String name, int english, int math, int thesis){
        super(id, name, english, math);
        this.thesis = thesis;
    }
    public void print(){
        System.out.println(id + "\t" + name + "\t" + english + "\t" + math + "\t" + (english+math)/2 + "\t" + thesis);
    }
    public void mail(){

    }
}
