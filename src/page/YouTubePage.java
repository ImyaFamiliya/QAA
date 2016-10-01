package page;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;

public class YouTubePage{

    public TextInput searchInput = new TextInput(By.id("masthead-search-term"));

    public Button playlistButton(String text){
        return new Button(By.linkText(text));
    }

    public Button searchButton = new Button(By.id("search-btn"));
}
