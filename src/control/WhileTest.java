package control;

/**
 * @author ziqin.lei
 * @since 2018/6/11
 */
public class WhileTest {
    private static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition()) {
            System.out.println("Inside 'while'");
        }
        System.out.println("Exited 'while'");
    }
}
