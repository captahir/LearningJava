package enumeration;

enum Apple2 {
    Jonathan(10), RedDel(12), GoldenDel(15), Winesap(), Cortland(9);

    private int price;

    Apple2(int price) {
        this.price = price;
    }

    Apple2() { this.price = 0;}

    public int getPrice() {
        return price;
    }
}

public class EnumWithInstance {
    public static void main(String[] args) {
        for (Apple2 a :
                Apple2.values()) {
            if (a.getPrice() == 0) System.out.printf("%s is out of stock\n", a);
            else
                System.out.printf("%s costs %d $\n", a, a.getPrice());
        }
    }
}
