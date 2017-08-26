package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    static SelenideElement searchField = $(By.id("search-key"));
    static SelenideElement searchFieldSubmitBtn = $(By.className("search-button"));
    static SelenideElement popUpCloseBtn = $(By.className("close-layer"));

    public static void open() {
        Selenide.open("https://ru.aliexpress.com");
    }

    public static void closePopUpWindow() {
        popUpCloseBtn.click();
    }

    public static void enterInSearchField(String string) {
        searchField.val(string);
    }

    public static void clickSearchSubmitBtn() {
        searchFieldSubmitBtn.submit();
    }


}
