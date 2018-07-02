package initialization;

/**
 * @author Leiziqin
 * @since 2018/7/2
 */
public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana();
        Banana b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}

class Banana {
    void peel(int i) {
    }
}