package enumeration;

enum Apple {
    Jonathan, RedDel, GoldenDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.Winesap;

        System.out.printf("Value of the ap is %s\n", ap);
        System.out.println();

        if (ap == Apple.GoldenDel) System.out.printf("I put %s on the table\n", Apple.GoldenDel);
        else System.out.println("I have no idea what kind of apple there is");

        switch (ap) {
            case RedDel:
                System.out.printf("I am eating %s", Apple.RedDel);
                break;
            case Winesap:
                System.out.printf("I am eating %s", Apple.Winesap);
                break;
            case Cortland:
                System.out.printf("I am eating %s", Apple.Cortland);
                break;
            case Jonathan:
                System.out.printf("I am eating %s", Apple.Jonathan);
                break;
            case GoldenDel:
                System.out.printf("I am eating %s", Apple.GoldenDel);
                break;
            default:
                System.out.println("I have no idea what I am eating");
                break;
        }
    }
}
