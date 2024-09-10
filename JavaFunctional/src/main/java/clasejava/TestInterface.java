package clasejava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestInterface {
    public static void main(String[] args) {

        List<Integer> evenNumber = Arrays.asList(0,2,4,6,8,10,12);
        List<Integer> oddNumber = Arrays.asList(1,3,5,7,9,11);
        List<String> words = List.of("sun","night","evening","sunset");

        //Test Predicate
        System.out.println("-----Predicate Simple-----");

        Predicate<List<Integer>> predicate = list -> (list.stream().anyMatch(n -> n == 5));
        System.out.println("is " + predicate.test(evenNumber));

        System.out.println("-----Predicate and-----");

        Predicate<Integer> predicateBetweenLess = num -> num > 50;
        Predicate<Integer> predicateBetweenGreater = num -> num < 100 && num > 50;
        System.out.println("is " +predicateBetweenLess.and(predicateBetweenGreater).test(55));

        System.out.println("-----Predicate or-----");

        System.out.println("is " + predicateBetweenLess.or(predicateBetweenGreater).test(2));

        System.out.println("-----Function-----");
        String wordSearch = "sun";
        Function<List<String>, Boolean> function1 = word -> word.contains(wordSearch);
        if (function1.apply(words)){
            System.out.println( "The word " + wordSearch + "is in the list " + words);
        }else {
            System.out.println("The word" + wordSearch + "don't appear in the list ");
        }
        System.out.println("-----Consumers-----");
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello in consumer");

        System.out.println("-----Supplier-----");

        Supplier<Double> supplierRandom = () -> Math.random();
        int number1 = 5;
        int number2 = 7;

        System.out.println("The random number is: "+ supplierRandom.get());
        System.out.println("-----Supplier2-----");
        Supplier<Integer> supplier2 = () -> number1*number2;
        System.out.printf("%d * %d is = "+ supplier2.get(),number1,number2);

        System.out.println("-----Optional-----");//isPresent

        System.out.println("-----Stream Filter-----");//isPresent

        List<Integer> numbers = Arrays.asList(5, 12, 3, 19, 7, 30, 1, 8, 21);

        //greater than 10 and return de quantity
        long listChanged = numbers.stream()
                .filter(num -> num > 10)
                .count();

        System.out.println("Quantity of number greeter than 10: " + listChanged);

        System.out.println("-----Stream con forEach-----");//isPresent

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        //"Alice", "Bob", "Charlie", "David"
//        - Dada una lista de nombres, conviértelos a mayúsculas.

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " " +"\n"));

        System.out.println("-----Stream con con collect-----");//isPresent
        String namesUpperCase = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.joining(","));

        System.out.println("Words: " + names + " Uppercase: "+namesUpperCase);

        System.out.println("-----Stream con con collect y join-----");//isPresent
//        - Une todos los nombres en una sola cadena, separados por comas.
         String namesU = names.stream()
                .collect(Collectors.joining(","));


    }
}
