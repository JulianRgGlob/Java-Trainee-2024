package aprendizaje;

class Person {
    // attribute
    String Name;
    int Age;
    String Phone;
    // Method greetings
    static void Saludo (String cName){
        System.out.println("Hola que tal " + cName);
    }
}

public class ClassExamples {
    public static void main(String[] args) {
        Person oPerson1 = new Person();

        oPerson1.Name = "Julian";
        oPerson1.Age = 25;
        oPerson1.Phone = "343435";
        System.out.println(oPerson1.Name + oPerson1.Phone);

        Person.Saludo(oPerson1.Name);
        greet();
    }
    //funciones
    static void greet(){
        System.out.println("Hello c");
    }
    
}
