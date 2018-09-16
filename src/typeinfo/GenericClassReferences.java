package typeinfo;

/**
 * @author Leiziqin
 * @since 2018/8/25
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
        // genericIntClass = double.class; // Illegal
    }
}
