package generics;

class Gen<T> {
    T ob;

    Gen(T o) {
        this.ob = o;
    }

    T getOb() {return ob;}

    void showType() {
        System.out.printf("Type is %s\n", ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(1894);
        iOb.showType();

        int value = iOb.getOb();
        System.out.println(value);

        System.out.println("-------------------");

        Gen<String> sOb = new Gen<>("Pestilence");
        sOb.showType();

        String s = sOb.getOb();
        System.out.println(s);
    }
}
