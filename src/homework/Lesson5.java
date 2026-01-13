package homework;
import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter profit: ");
        double profit = scanner .nextDouble();
        double tax ;

        if (profit <= 10000){tax = profit * 0.025 ;
        }
        else if (profit <= 25000) {tax = profit * 0.043 ;
        }
        else {tax = profit * 0.067 ;
        }




        System.out.println("Profit: " + profit);
        System.out.print("Tax amount: " + tax);
    }

}
