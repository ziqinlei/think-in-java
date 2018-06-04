package concurrency;

/**
 * @author Leiziqin
 * @since 2018/6/4
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
