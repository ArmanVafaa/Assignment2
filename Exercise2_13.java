package hw2;

import java.util.Scanner;

public class Exercise2_13 {
    public static void main(String[] args) {
        Scanner keyBoard= new Scanner(System.in);
        System.out.println("Please enter your monthly saving amount:");
        double cash= keyBoard.nextDouble();
        int i=1;
        double temp=0;
        while(i<=6){

            temp= (cash+temp)*(1+0.00417);

            System.out.println("your balance after "+i+" month: "+temp);
            i++;
        }


    }
}
