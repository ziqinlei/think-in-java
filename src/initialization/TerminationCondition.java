package initialization;

/**
 * @author Leiziqin
 * @since 2018/7/3
 */
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
    }
}

class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() {
        if (checkedOut) {
            System.out.println("Error: checked out");
            // Normally, you will also do this:
            // super.finalize(); // Call the base-class version
        }
    }
}