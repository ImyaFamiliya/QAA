package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static conf.TestManager.getDriver;

public class Steps {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();


    public MainPage fillInLoginForm(String username, String password) throws Exception {
        loginPage.loginInput.fillIn(username);
        Thread.sleep(1000);
        loginPage.loginButton.singleClickButton();
        Thread.sleep(2000);
        loginPage.passwordInput.fillIn(password);
        loginPage.signInButton.singleClickButton();
        return new MainPage();
    }

    public void fillInLetterAndSend(String recipient, String subjectOfLetter, String textOfLetter) throws Exception {
        Thread.sleep(1000);
        mainPage.writeALetterButton.singleClickButton();
        Thread.sleep(500);
        mainPage.recipient.fillIn(recipient);
        Thread.sleep(1000);
        mainPage.subjectOfLetter.fillIn(subjectOfLetter);
        Thread.sleep(1000);
        mainPage.textOfLetter.fillIn(textOfLetter);
        Thread.sleep(1000);
        mainPage.sendButton.singleClickButton();
        Thread.sleep(10000);
    }
}