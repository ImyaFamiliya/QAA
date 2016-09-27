package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import conf.TestManager;

public class LoginTest extends TestManager {

    Steps steps = new Steps();

    @Test
    public void Test1WithValidLoginAndPassword() throws Exception {
        steps.fillInLoginForm("o.testov789", "testov123");
        Thread.sleep(4000);
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).isDisplayed());
    }

    @Test
    public void Test2SendingALetter() throws Exception {
        steps.fillInLetterAndSend("o.testov789@gmail.com", "Test subject", "Hello, world! This is my first automated test.");
    }

//    @Test
//    public void TestWithInvalidPassword() throws Exception {
//        steps.fillInLoginForm("o.testov789", "testov12");
//        Assert.assertFalse(getDriver().findElement(By.xpath("//*[@id=\":ja\"]/div/div[1]/span/a")).isDisplayed());
//    }
//
//    @Test
//    public void TestWithInvalidLogin() throws Exception {
//        steps.fillInLoginForm("o.testov78", "testov123");
//        Assert.assertFalse(getDriver().findElement(By.xpath("//*[@id=\":ja\"]/div/div[1]/span/a")).isDisplayed());
//    }
//
//    @Test
//    public void TestWithoutLoginAndPassword() throws Exception {
//        steps.fillInLoginForm("", "");
//        Assert.assertFalse(getDriver().findElement(By.xpath("//*[@id=\":ja\"]/div/div[1]/span/a")).isDisplayed());
//    }

}