package streams.filters.numeric;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntFilter {

    public static Optional<Integer> maxInt(List<Integer> list) {
        return list.stream()
                .max(Comparator.comparingInt(i -> i));
    }

    public static int sumInt(List<Integer> list) {
        return list.stream()
                .mapToInt(i -> i)
                .sum();
    }

    public static OptionalDouble averageInt(List<Integer> list) {
        return list.stream()
                .mapToInt(i -> i)
                .average();
    }


}
