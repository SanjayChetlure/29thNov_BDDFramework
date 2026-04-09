package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AppHooks {


//    @Before(order = 1)
//    public void beforeHook1()
//    {
//        System.out.println("--running before Hook with order=1--");
//    }
//
//
//    @Before(order = 2)
//    public void beforeHook2()
//    {
//        System.out.println("--running before Hook with order=2--");
//    }
//
//
//    @After(order = 1)
//    public void afterHook1()
//    {
//        System.out.println("--running after Hook with order=1--");
//    }
//
//
//    @After(order = 2)
//    public void afterHook2()
//    {
//        System.out.println("--running after Hook with order=2--");
//    }




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

