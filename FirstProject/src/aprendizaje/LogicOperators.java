package aprendizaje;

public class LogicOperators {
    public static void main(String[] args) {
        // && AND, || OR, !NOT
        int Number1, Number2;
        Boolean Result;
        
        Number1 = 10;
        Number2 = 15;

        Result = Number1==Number2 || !(Number2 == Number1);
        System.out.println(Result);

    }
}
