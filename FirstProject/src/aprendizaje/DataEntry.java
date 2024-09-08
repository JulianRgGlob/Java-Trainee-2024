package aprendizaje;

import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {
        // import java.util.Scanner; is used for keyboard entry
        Scanner Entry = new Scanner(System.in);        
        String Name;
        String Profession;
        int Age;
        double Salary;
        System.out.println("Plase write your name ");
        Name = Entry.nextLine();

        System.out.println("Plase write your profession ");
        Profession = Entry.nextLine();

        System.out.println("Plase write your age ");
        Age = Entry.nextInt();

        System.out.println("Plase write your salary ");
        Salary = Entry.nextDouble();

        System.out.println("Hola " + Name + " Your profession is: " + Profession + " with " + Age + " years old, you have a salary of "+ Salary);
        Entry.close();
    }
}
