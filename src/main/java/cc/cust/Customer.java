package cc.cust;

public class Customer {
    String id;
    int cost;
    int discount;

    public Customer(String id, int cost, int discount){
        this.id = id;
        this.cost = cost;
        this.discount = discount;
    }
    public void print(){
        System.out.println(id + "\t" + cost + " " + "\t" + discount + "\t" + "   " + (cost - discount));
    }
}
