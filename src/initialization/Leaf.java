package initialization;

/**
 * @author Leiziqin
 * @since 2018/7/2
 */
public class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}
