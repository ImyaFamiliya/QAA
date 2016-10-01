package tests;

import conf.TestManager;
import org.testng.annotations.Test;
import steps.LoginSteps;

public class YouTubeTest extends TestManager{

    private LoginSteps loginSteps = new LoginSteps();

    public class Untitled {

        @Test
        public void testUntitled() throws Exception {
            loginSteps.findYouTubePage().search("Java для тестировщиков");
        }
    }
}
