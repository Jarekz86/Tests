package tests;

import config.TestBase;
import org.testng.annotations.Test;
import page.objects.MainPage;

import static org.testng.Assert.*;

public class PositiveResultTest extends TestBase {

    @Test
    public void asUserSearchJob() {
        MainPage mainpage = new MainPage();
        mainpage
                .searchJob("Tester");
        assertTrue(mainpage.isDisplayedResult());
    }
}
