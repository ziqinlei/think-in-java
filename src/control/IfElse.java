package control;

/**
 * @author ziqin.lei
 * @since 2018/6/11
 */
public class IfElse {
    private static int result = 0;

    private static void test(int testval, int target) {
        if (testval > target) {
            result = +1;
        } else {
            result = 0;
        }
    }

    public static void main(String[] args) {
        test(10, 5);
        System.out.println(result);
        test(5, 10);
        System.out.println(result);
        test(5, 5);
        System.out.println(result);
    }
}
