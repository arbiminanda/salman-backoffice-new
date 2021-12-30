package utils;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class Litsteners extends RunListener {
    @Override
    public void testFinished(Description result) throws java.lang.Exception
    {
        String preTest = "********************  TEST RESULT  ********************";
        String titleTestPass = "Result Test Salman : ";
        int countResult = result.testCount();
        try {
            SlackUtils.slackTestResult(preTest, titleTestPass,countResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
