package aprendizaje;

import aprendizaje.ClassExamples; //improt class  from the other side and call its components

public class Homework {
    public static void main(String[] args) {
        Person oPer1 = new Person();
        
        oPer1.Name = "Julk";
        oPer1.Age = 25;
        oPer1.Phone = "546532";

        Person.Saludo("pruebita");
    }
}
