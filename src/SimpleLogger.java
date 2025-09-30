import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A simple logger class that logs messages with a timestamp to a file.
 */
public class SimpleLogger {
    /** The date format used for logging timestamps. */
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String LOG_FILE = "application.log"; // Change the file name/path as needed

    private static SimpleLogger aLogger;

    private SimpleLogger() {
    }

    public static SimpleLogger getInstance() {
        if (aLogger == null) {
            aLogger = new SimpleLogger();
        }
        return aLogger;
    }

    /**
     * Logs a message with the current timestamp to a file.
     *
     * @param pMessage The message to log.
     */
    public void logThis(String pMessage) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_FORMAT));
        String logEntry = String.format("[%s] [Info] Singleton logger says: %s%n", timestamp, pMessage);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            writer.write(logEntry);
        } catch (IOException e) {
            // If logging fails, print to console as a fallback
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }
}
