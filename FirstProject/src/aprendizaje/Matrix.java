package aprendizaje;

public class Matrix {
    public static void main(String[] args) {
        //similary to vectors but double
        String [][] People = new String[4][3];
        
        People [0][0] = "Julian";
        People [0][1] = "Rod";
        People [0][2] = "Gomez";
        People [1][0] = "Marcos";
        People [1][1] = "Locancio";
        People [1][2] = "Romero";
        People [2][0] = "Matiu";
        People [2][1] = "Fern";
        People [2][2] = "Loc";
        People [3][0] = "Maria";
        People [3][1] = "marca";
        People [3][2] = "cuanti";

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("Name: " + People[i][j]);
            }
            System.out.println("-------------");
        }
    }
}
