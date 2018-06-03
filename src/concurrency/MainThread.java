package concurrency;

/**
 * @author Leiziqin
 * @since 2018/6/3
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}