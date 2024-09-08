package aprendizaje;

public class StringClass {
    public static void main(String[] args) {
        String name = "Oregoom";
        System.out.println(name.charAt(3));

        System.out.println("Hola".equals("Hola"));

        StringBuilder nuevo = new StringBuilder();
        System.out.println(nuevo);

        nuevo.append("yan");
        System.out.println(nuevo);

    }
}
