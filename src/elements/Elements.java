package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static conf.TestManager.getDriver;

public class Elements {

    protected By by;

    public Elements(){}

    public Elements(By by) {
        this.by = by;
    }

    public void clickEnterKey(){
        getDriver().findElement(by).sendKeys(Keys.ENTER);
    }

    public void multiClickCtrlPlus(String key){
        getDriver().findElement(by).sendKeys(Keys.chord(Keys.CONTROL, key));
    }
}
