package aprendizaje;

import java.util.Scanner;

public class ConditionWhile {
    public static void main(String[] args) {
        Scanner Entry = new Scanner(System.in);
        int nNumber1, nNumber2, nQuantity = 0;

        System.out.println("indicate initial number");
        nNumber1 = Entry.nextInt();
        System.out.println("indicate second number");
        nNumber2 = Entry.nextInt();

        while (nNumber1 < nNumber2) {
            nQuantity += 1;
            nNumber1++;
        }
        System.out.printf("The quantity of numbers is: %d ", nQuantity);
    }
    // System.out.println("indicate table number to be multiplied");
    // nMultiplicationTable = Entrey.nextInt();
    // WHILE
    /*
     * while (nSecuence <13) {
     * AddltiplicationTable + " X " + nSecuence+ " = " + (nMultiplicationTable *
     * nSecuence));
     * nSecuence++;
     * }
     */
    // DO WHILE
    // int Age = 30;
    // do {
    // System.out.println("Imprimir "+ nSecuence);
    // nSecuence++;
    // } while (Age < 30);
}
