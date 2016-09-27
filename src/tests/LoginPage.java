package tests;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;

public class LoginPage {

    public TextInput loginInput = new TextInput(By.id("Email"));
    public Button loginButton = new Button(By.id("next"));
    public TextInput passwordInput = new TextInput(By.id("Passwd"));
    public Button signInButton = new Button(By.id("signIn"));
}
