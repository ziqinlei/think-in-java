package initialization;

/**
 * @author Leiziqin
 * @since 2018/7/2
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}
