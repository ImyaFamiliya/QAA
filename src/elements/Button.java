package elements;

import org.openqa.selenium.By;

import static conf.TestManager.getDriver;

public class Button extends Elements {

    public Button(By by){ super(by);}

    public void singleClick(){
        getDriver().findElement(by).click();
    }
}
