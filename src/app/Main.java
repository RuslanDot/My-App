package app;

import java.util.Locale;

public class Main {

  public static void main(String[] args)  {

   Locale locale = Locale.GERMANY;

   String product1 = "smartfone";
   int days1 = 5;
   double totalSales1 = 12153.41;
   double salesByDay1 = totalSales1 / days1;

   String product2 = "laptop";
   int days2 = 7;
   double totalSales2 = 10486.85;
   double salesByDay2 = totalSales2 / days2;

   System.out.printf("Product No 1 : %s,%n" +
                   "total sales for %d days is EUR %.2f. %n" +
                   "sales bay day is EUR %.2f, %n" ,
           product1, days1, totalSales1, salesByDay1);

   System.out.printf("Product No 2 : %s,%n" +
                    "total sales for %d days is EUR %.2f. %n" +
                    "sales bay day is EUR %.2f, %n" ,
           product2, days2, totalSales2, salesByDay2);
  }

}
