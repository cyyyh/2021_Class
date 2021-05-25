package cc.car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        int fee = 30;
        List<Car> cars = new ArrayList<>();

        Car c1 = new Car("abc-123", "07:30");
        Car c2 = new Car("efg-456", "09:45");
        Car c3 = new Car("xyz-789", "10:10");
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        String id = "abc-123";
        for (Car c : cars) {   //for each
            if(c.id.equals(id)){
                break;
            }

        }




//  practice
/*
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm"); //"時時：分分"
        try{
            Date d = sdf.parse("08:58");
        } catch (ParseException e){
            e.printStackTrace();
        }

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());


        Car c1 = new Car("abc-123");
        Car c2 = new Car("xyz-888", "07:30");
        System.out.println(c1.enter);

        Date now = new Date();
        System.out.println(now.getTime());

        long dis = now.getTime() - c1.enter.getTime();
        System.out.println(dis);
*/

    }
}
