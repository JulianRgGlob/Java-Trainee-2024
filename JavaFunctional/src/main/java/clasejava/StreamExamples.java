package clasejava;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        System.out.println("----- 1 Filter Example-----");
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream()
                .filter(x -> x.isEmpty()).count();
        System.out.println(count);//2

        System.out.println("----- 2 Count Strings size is more than three Example-----");

        long num = strList.stream().filter(x -> x.length() > 3).count();
        System.out.println(num);//1

        System.out.println("----- 3 Collectors Example: Remove all empty Strings from List");
        List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());

        System.out.println(filtered);//[abc, bcd, defg, jk]

        System.out.println("----- 4 Map functional Example: Convert String to uppercase and Join them with coma");
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        String G7Countries = G7.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println(G7Countries);//USA, JAPAN, FRANCE, GERMANY, ITALY, U.K., CANADA

        System.out.println("----- 4 Statistics Example: Get count, min, max, sum, and the average for numbers");
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();

        System.out.println(stats);//IntSummaryStatistics{count=10, sum=129, min=2, average=12.900000, max=29}


    }
}
