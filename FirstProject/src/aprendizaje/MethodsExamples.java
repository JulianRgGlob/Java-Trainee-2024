package aprendizaje;

public class MethodsExamples {
    // methods [acces][modificator] type methodName(){}

    static void Message(String cText){
       System.out.println(cText);
    }
    static int Sumar(int number1, int number2){
        return number1+ number2;
    }
    public static void main(String[] args) {
        //code snip that is inside a class
        
        Message("This is my frist method of work in Java");
        System.out.println(Sumar(15, 23));
    }
}
