package aprendizaje;

import java.util.Scanner;

//this is a class
public class Practice_1 {
    //this is a method
    public static void main(String[] args) {
        
        System.out.println("Quotient and mod");
        Scanner read  = new Scanner(System.in);
        System.out.println("Write number 1: ");
        double number1 = read.nextDouble();
        System.out.println("Write number 2:");
        double number2 = read.nextDouble();
        double result1 = number1/number2;
        double result2 = number1%number2;

        System.out.printf("The quotient is %f + %f = %f \n", number1,number2,result1);
        System.out.printf("The mod is %f - %f = %f", number1,number2,result2);
        read.close();
    }
}
