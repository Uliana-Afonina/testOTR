
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import org.junit.jupiter.api.Test;
import org.tinylog.Logger;
import pages.SearchPage;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.screenshot;


public class SearchTest {
    SearchPage searchPage = new SearchPage();

    @Test
    public void searchNotepads() {
        //установить размер окна браузера на максимальный
        Configuration.startMaximized = true;
        Configuration.browser = CHROME;
        Selenide.open(SearchPage.url);
        Logger.info("Открыт браузер");
        searchPage.linkMarketClick();
        //переключиться на активную вкладку браузера
        Selenide.switchTo().window(1);
        searchPage.setHeaderSearch();
        searchPage.searchButtonClick();
        searchPage.setCheckBox();
        //задаем путь хранения скриншота
        Configuration.reportsFolder = "src/test/java";
        screenshot("ScreenShot");
        Logger.info("Скриншот экрана сделан");

    }
}
