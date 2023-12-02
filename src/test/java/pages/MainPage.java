package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

  public MainPage openPage() {
    open(baseUrl);
    return this;
  }

  public MainPage clickByText(String value) {
    $(byText(value)).click();
    return this;
  }

  public MainPage checkVisibleElement(String value) {
    $(byText(value)).shouldBe(Condition.visible);
    return this;
  }

}
