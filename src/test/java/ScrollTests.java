import base.BaseTest;
import org.junit.Test;

public class ScrollTests extends BaseTest {
    @Test
    public void testLargeDom() {
        driver.get(System.getProperty("site.largedom.url"));
        eyesManager.getEyes().setForceFullPageScreenshot(true);
        eyesManager.validateWindow();
    }
}
