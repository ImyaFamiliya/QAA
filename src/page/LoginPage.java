package page;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;

public class LoginPage {

    public TextInput loginInput = new TextInput(By.id("Email"));
    public Button loginButton = new Button(By.id("next"));
    public TextInput passwordInput = new TextInput(By.id("Passwd"));
    public Button signInButton = new Button(By.id("signIn"));
    public Button menuButton = new Button(By.xpath("//div[@id='gbwa']"));
    public Button youTubeButton = new Button(By.xpath("//a[contains(text(), 'Youtube')]"));
}
