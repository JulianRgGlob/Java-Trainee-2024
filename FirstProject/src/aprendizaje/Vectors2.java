package aprendizaje;

import java.util.Scanner;

public class Vectors2 {
    public static void main(String[] args) {
        Scanner Entry = new Scanner(System.in);
        int nQuantity = 0;
        System.out.println("Enter the number of notes");
        nQuantity = Entry.nextInt();
        int [] Notes = new int[nQuantity];
        //
        for (int i = 0; i < nQuantity; i++) {
            System.out.print("Enter the note number " + i + " = ");
            Notes[i] = Entry.nextInt();
        }
        System.out.println("Printing of entered notes");
        for (int i = 0; i < nQuantity; i++) {
            System.out.println(Notes[i]);            
        }
    }
}
