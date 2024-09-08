package aprendizaje;

public class Vectors {
    public static void main(String[] args) {
    //datatype [] var = new datatype [size]
        String [] Names = new String[3]; 
        Names[0] = "Julian";
        Names[1] = "Andres";
        Names[2] = "Rod";

        for (int i = 0; i < Names.length; i++) {
            System.out.println("Nombres: " + Names[i]);
        }

    }
}
