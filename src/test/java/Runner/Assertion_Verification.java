package Runner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Verification
{

//    @Test
    public void m1_assertEquals()
    {
        String actResult="hi";
        String expResult="hi";

        Assert.assertEquals(actResult,expResult,"Act & Exp results are different");
    }


    @Test
    public void m2_assertNotEquals()
    {
        String actResult="hi";
        String expResult="hello";

        Assert.assertNotEquals(actResult,expResult,"Act & Exp results are Same");
    }

}
