package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AppHooks {

    @Before
    public void openBrowser()
    {
        System.out.println("--Open browser--");
    }

    @After
    public void closeBrowser()
    {
        System.out.println("-close browser-");
    }


//    @BeforeStep
//    public void beforeStep()
//    {
//        System.out.println("-before step-");
//    }
//
//    @AfterStep
//    public void afterStep()
//    {
//        System.out.println("-after step-");
//    }

}

