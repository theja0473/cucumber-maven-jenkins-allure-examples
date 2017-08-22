package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public MainPage open() {
        Selenide.open("https://ru.aliexpress.com");
        return this;
    }

    SelenideElement searchField = $(By.id("search-key"));
    SelenideElement searchFieldSubmitBtn = $(By.className("search-button"));
    SelenideElement popUpCloseBtn = $(By.className("close-layer"));

    public void closePopUpWindow() {
        popUpCloseBtn.click();
    }

    public void enterInSearchField(String string) {
        searchField.val(string);
    }

    public void clickSearchSubmitBtn() {
        searchFieldSubmitBtn.submit();
    }


}
