package streams.filters;

import java.util.List;
import java.util.OptionalDouble;

public class NumericFilters {

    public int sumInt(List<Integer> list) {
        return list.stream()
                .mapToInt(i -> i)
                .sum();
    }

    public double sumDouble(List<Double> list) {
        return list.stream()
                .mapToDouble(d -> d)
                .sum();
    }

    public long sumLong(List<Long> list) {
        return list.stream()
                .mapToLong(l -> l)
                .sum();
    }

    public OptionalDouble average(List<Double> list) {
        return list.stream()
                .mapToDouble(d -> d)
                .average();
    }
}
