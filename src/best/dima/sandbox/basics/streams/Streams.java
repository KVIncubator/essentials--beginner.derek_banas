package best.dima.sandbox.basics.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Streams {

    // ---- STREAMS ----
    // Streams represent groups of objects
    // you can perform aggregate operations on
    public void run() {
        System.out.printf("\n### %s\n", Streams.class.getSimpleName());

        // Map performs an operation on each value
        // IntStream is used with ints
        // rangeClosed generates a list from start to finish
        // Boxed returns list boxed to an Integer
        // Collect process the list elements into a container
        List<Integer> oneTo10 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

        List<Integer> squares = oneTo10.stream().map(x -> x*x).collect(Collectors.toList());

        for(Integer x: squares) System.out.println(x);

        // Filter eliminates values based on a condition
        List<Integer> evens = oneTo10.stream().filter(x -> (x % 2) == 0).collect(Collectors.toList());
        for(Integer x: evens) System.out.println(x);

        // Limit output to 5
        IntStream limitTo5 = IntStream.range(1, 10).limit(5);
        limitTo5.forEach(System.out::println);

        int multAll = IntStream.range(1, 5).reduce(1, (x, y) -> x * y);
        System.out.println(multAll);

        // Map to double
        DoubleStream stream = IntStream.range(1, 5).mapToDouble(i -> i);

        // Generate statistics
        IntSummaryStatistics iStats = IntStream.range(1, 10).summaryStatistics();
        System.out.println("Avg " + iStats.getAverage());
        System.out.println("Sum " + iStats.getSum());
        System.out.println("Min " + iStats.getMin());
        System.out.println("Max " + iStats.getMax());
    }
}
