package operators;

/**
 * @author Leiziqin
 * @since 2018/6/9
 */
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 27;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}

class Tank {
    int level;
}