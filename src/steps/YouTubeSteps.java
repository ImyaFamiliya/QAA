package steps;

import page.YouTubePage;

public class YouTubeSteps {

    YouTubePage youTubePage = new YouTubePage();

    public YouTubeSteps search(String text) throws Exception {
        youTubePage.searchInput.fillIn(text);
        youTubePage.searchButton.click();
        youTubePage.playlistButton(text).click();
        return this;
    }
}
