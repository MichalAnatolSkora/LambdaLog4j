package test.java;

import junit.framework.TestCase;
import main.java.Logger;

public class LoggerTest extends TestCase {
    public void testTechnicalMessage() {
        Logger logger = new Logger(getClass().getName());
        logger.Log(e -> e.Info()
                .CorrelationId("fakeCorrelationId")
                .Technical()
                .Message("Created trigger")
                .Field("Method", "testMessage"));
    }

    public void testException() {
        Logger logger = new Logger(getClass().getName());
        try {
            throw new Exception("New exception");
        }catch (Exception ex){
            logger.Log(e -> e.Error()
                    .CorrelationId("fakeCorrelationId")
                    .Technical()
                    .Message("Unexpected case")
                    .Exception(ex).Field("Method", "testException"));
        }
    }

    public void testBusinessMessage() {
        Logger logger = new Logger(getClass().getName());
        logger.Log(e -> e.Info()
                .CorrelationId("fakeCorrelationId")
                .Business()
                .Message("Created trigger")
                .Field("Method", "testMessage"));
    }
}
