package steps;


import page.LoginPage;
import page.MainPage;


public class LoginSteps {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    public YouTubeSteps findYouTubePage(){
        loginPage.menuButton.singleClick();
        loginPage.youTubeButton.singleClick();
        return new YouTubeSteps();
    }

    public MainPage fillInLoginForm(String username, String password) throws Exception {
        loginPage.loginInput.fillIn(username);
        Thread.sleep(1000);
        loginPage.loginButton.singleClick();
        Thread.sleep(2000);
        loginPage.passwordInput.fillIn(password);
        loginPage.signInButton.singleClick();
        return new MainPage();
    }

    public void fillInLetterAndSend(String recipient, String subjectOfLetter, String textOfLetter) throws Exception {
        Thread.sleep(1000);
        mainPage.writeALetterButton.singleClick();
        Thread.sleep(500);
        mainPage.recipient.fillIn(recipient);
        Thread.sleep(1000);
        mainPage.subjectOfLetter.fillIn(subjectOfLetter);
        Thread.sleep(1000);
        mainPage.textOfLetter.fillIn(textOfLetter);
        Thread.sleep(1000);
        mainPage.sendButton.singleClick();
        Thread.sleep(10000);
    }
}