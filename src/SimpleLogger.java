import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A simple logger class that logs messages with a timestamp.
 */
public class SimpleLogger {
    /** The date format used for logging timestamps. */
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * Logs a message with the current timestamp.
     *
     * @param pMessage The message to log.
     */
    public void logThis(String pMessage) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_FORMAT));
        System.out.printf("[%s] %s%n", timestamp, pMessage);
    }
}
