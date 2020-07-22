package generics;

class NumGen<T extends Number> {
    T[] array;

    public NumGen(T[] array) {
        this.array = array;
    }

    T[] getArray() {return  array;}

    public double findAve(T[] array) {
        double sum = 0;
        for (T t : array) {
            sum += t.doubleValue();
        }

        return sum/array.length;
    }
}
public class NumGenDemo {
    public static void main(String[] args) {
        NumGen<Integer> ints = new NumGen<>(new Integer[] {1, 2, 3, 4, 5});
        System.out.println(ints.findAve(ints.getArray()));
    }
}
