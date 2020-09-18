package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.tinylog.Logger;

import static com.codeborne.selenide.Selenide.$;


public class SearchPage {
    int wait = 100000;
    int waitInterval = 50;

    public static boolean startMaximized;


    public static String url = "https://yandex.ru/";
    //элемент "Маркет"
    public SelenideElement linkMarket = $("[data-id='market']");
    //элемент текстбокс для поиска
    public SelenideElement headerSearch = $("[type=text]#header-search");
    //кнопка "найти"
    public SelenideElement searchButton = $("._1XiEJDPVpk");
    //чек-бокс
    public SelenideElement checkBox = $(".NVoaOvqe58");

    //установка чек-бокса
    public void setCheckBox() {
        checkBox.waitUntil(Condition.visible, wait, waitInterval).click();
        Logger.info("Чек-бокс выбран");
    }

    public void linkMarketClick() {
        linkMarket.click();
        Logger.info("Перешли в раздел 'Маркет'");
    }

    public void searchButtonClick() {
        searchButton.click();
    }

    public void setHeaderSearch() {
        headerSearch.waitUntil(Condition.visible, wait, waitInterval).setValue("ноутбук xiaomi redmibook");
    }
}
