package tests;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;

public class MainPage {

    public TextInput recipient = new TextInput(By.name("to"));
    public TextInput subjectOfLetter = new TextInput(By.name("subjectbox"));
    public TextInput textOfLetter = new TextInput(By.xpath("//div[@class='Am Al editable LW-avf']"));
    public Button sendButton = new Button(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3 T-I-Zf-aw2']"));
    public Button writeALetterButton = new Button(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
}