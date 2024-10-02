/**
 * Main java class used to run the logger example.
 */
public class Main {
    /**
     * Main method for testing the SimpleLogger.
     *
     * @param pArgs Command line arguments (not used).
     */
    public static void main(String[] pArgs) {
        SimpleLogger logger = SimpleLogger.getInstance();
        logger.logThis("This is a log message.");
        logger.logThis("Another log message.");
    }
}