package aprendizaje;

import java.util.Scanner;

public class ConditionalFor {
    public static void main(String[] args) {
        Scanner Entry = new Scanner(System.in);
        

        System.out.println("indicate initial number");
        int nNumber1 = Entry.nextInt();
        System.out.println("indicate second number");
        int nNumber2 = Entry.nextInt();

        int result = 0;

        for (int i = nNumber1; i < nNumber2; i++) {
            result ++;
        }
        System.out.printf("Result to numbers from %d to %d is: " + result,nNumber1,nNumber2);


    }
    // int nMultiplicationTable = 0;
        // System.out.println("indicate table number to be multiplied");
        // nMultiplicationTable = Entry.nextInt();

        // for (int i = 0; i < 13; i++) {

        //     System.out.println(nMultiplicationTable + " X " + i + " = " + (nMultiplicationTable * i));
        // }
}
