package aprendizaje;

import java.util.Scanner;

public class SwitchWorking {
    public static void main(String[] args) {
        Scanner Entry = new Scanner(System.in);
        int result = 0;
        System.out.println("Write Operator( + , - , * , /)");
        String nChart = Entry.nextLine();
        System.out.println("Write a number 1");
        int nNumber1 = Entry.nextInt();
        System.out.println("Write a number 2");
        int nNumber2 = Entry.nextInt();

        switch (nChart) {
            case "+":
                result = nNumber1 + nNumber2;
                break;
            case "-":
                result = nNumber1 - nNumber2;

                break;
            case "*":
                result = nNumber1 * nNumber2;

                break;
            case "/":
                if (nNumber2 != 0) {
                    result = nNumber1 / nNumber2;

                } else {
                    System.out.println("0");
                }
                break;
            default:
                System.out.println("Number invalid");
                break;
        }
        System.out.printf("The result of operation is: %d ",result);
    }
}
