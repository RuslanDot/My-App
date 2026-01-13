package app;

public class Main {
    public static void main(String[] args)

     double profit = 11000 ;
     double tax ;

     if (profit <= 10000){tax = profit * 0.25 } ;
     else if (profit <= 25000) {tax = profit * 0.43 } ;
     else {tax = profit * 0.67 } ;




        System.out.println("Profit: "+ profit);
        System.out.print("Tax amount: " + tax);
    }
}
