package elements;

import org.openqa.selenium.By;

import static conf.TestManager.getDriver;

public class TextInput extends Elements {

    public TextInput(By by) { super(by); }

    public void fillIn(String text) throws Exception {
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(text);
    }

}
