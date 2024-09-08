package aprendizaje;

import java.util.Scanner;

public class ConditionalEstructure {
    public static void main(String[] args) {
        System.out.println("Conditional If 2");
        Scanner read  = new Scanner(System.in);
        System.out.println("Write number: ");
        int number1 = read.nextInt();

        if (number1 % 3 == 0 && number1 % 5 == 0  ) {
            System.out.printf(" %d Is multiplot of 3 and 5",number1);            
        }else{
            System.out.printf(" %d Is not multiplot of 3 and 5",number1);            
        }
    }
}
