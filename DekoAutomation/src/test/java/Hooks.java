import PageObjects.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    Base baseObj = new Base();

    @Before
    public void setUP() {
        baseObj.OpenBrowser();
    }


    @After
    public void tearDown()
    {
        baseObj.CloseBrowser();
    }
}
