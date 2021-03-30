package cc.cust;

public class Detail {
    public static void main(String[] args){
        System.out.println("客戶編號/消費金額/折讓/金額");
        Customer[] customers = {
                new Customer("0013", 490, 0),
                new Customer("0052", 1000, 100),
                new Customer("0081", 290, 0),
                new Customer("2122", 2000, 200),
        };
        for (int i = 0; i < customers.length; i++){
            customers[i].print();
        }
    }

}
