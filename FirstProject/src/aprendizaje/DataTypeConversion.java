package aprendizaje;

public class DataTypeConversion {
    public static void main(String[] args) {
        // when use "" and concat ex: "126+"126" the result is not an add is a concat 126126
        // datatype.parsedatatype(content)
        System.out.println(Integer.parseInt("120") + Integer.parseInt("16"));
        
        /* 
        int IntegerNumber = 15;
        Integer IntegerNumber2 = 15;
        double DoubVar = 15.0d;
        Double DoubVar2 = 15.0d;
        boolean ask = true;
        Boolean ask2 = false;

        //
        String Number = "120";
        byte bNumber = Byte.parseByte(Number); // from -128 to 127
        System.out.println(bNumber);

        int iNumber = Integer.parseInt(Number);
        System.out.println(iNumber);

        float fNumber = Float.parseFloat(Number);
        System.out.println(fNumber);

        double dNumber = Double.parseDouble(Number);
        System.out.println(dNumber);
        */
        //
        String cText = "Text contain: ";
        byte bNumber =10;
        int iNumber = 120;
        float fNumber = 16f;
        double dNumber = 16d;
        char Charr = 'H';
        boolean Verd = true;

        cText += bNumber;
        System.out.println(cText);



    }
}
