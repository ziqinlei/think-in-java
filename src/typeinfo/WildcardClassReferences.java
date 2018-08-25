package typeinfo;

/**
 * @author Leiziqin
 * @since 2018/8/25
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
