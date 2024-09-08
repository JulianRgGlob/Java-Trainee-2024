package aprendizaje;

public class ConditionalOperator {
    public static void main(String[] args) {
        // exp1 ? exp2 : exp3
        int Number1 = 5, Number2 = 6;
        String Result ="";
        Result = (Number1 > Number2) ? "Es Mayor ": "Es Menor";
        System.out.println(Result);
    }
}
