package streams.filters;

import java.util.ArrayList;
import java.util.List;

public class FilterApp {
    private static List<Double> dd = new ArrayList<>();

    public static void main(String[] args) {
        dd.add(4.7);
        dd.add(9.8);
        dd.add(5.1);
        dd.add(63.4);

        List<Double> aa = new ArrayList<>();

        NumericFilters doubleNum = new NumericFilters();
        System.out.println(doubleNum.sumDouble(dd));
        System.out.println(doubleNum.average(dd));
    }

}
