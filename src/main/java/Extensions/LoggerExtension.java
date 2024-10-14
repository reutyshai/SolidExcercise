package Extensions;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * LoggerExtension is a JUnit 5 extension that implements the TestWatcher interface.
 * It logs the results of test executions, including failures, successes, aborts, and disabled tests.
 * This class utilizes SLF4J for logging purposes.
 *
 * <p>This extension can be registered in JUnit tests to monitor the execution of test cases
 * and provide insights into their outcomes through logging.</p>
 */
@Slf4j
public class LoggerExtension implements TestWatcher {

    private static final Logger logger = LoggerFactory.getLogger(LoggerExtension.class);

    /**
     * Logs an error message when a test fails.
     *
     * @param context the context of the test that failed
     * @param cause   the throwable that caused the test to fail
     */
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        logger.error("Test " + context.getDisplayName() + " failed, The reason is: " + cause);
    }

    /**
     * Logs an info message when a test passes successfully.
     *
     * @param context the context of the test that passed
     */
    @Override
    public void testSuccessful(ExtensionContext context) {
        logger.info("Test " + context.getDisplayName() + " passed!");
    }

    /**
     * Logs a warning message when a test is aborted.
     *
     * @param context the context of the test that was aborted
     * @param cause   the throwable that caused the test to be aborted
     */
    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        logger.warn("Test: " + context.getDisplayName() + " aborted, The reason is: " + cause);
    }

    /**
     * Logs an info message when a test is disabled.
     *
     * @param context the context of the test that was disabled
     * @param reason  an optional reason for why the test was disabled
     */
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        logger.info("Test " + context.getDisplayName() + " disabled!");
    }
}
