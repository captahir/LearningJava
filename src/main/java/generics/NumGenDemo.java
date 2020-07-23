package generics;

class NumGen<T extends Number> {
    //here T is bounded with Numbers

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

        NumGen<Double> doubles = new NumGen<>(new Double[] {1.5, 2.5, 3.5, 4.5});
        System.out.println(doubles.findAve(doubles.getArray()));

        //creating String list will fail
        
    }
}
