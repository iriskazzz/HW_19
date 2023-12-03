package components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainMenu {

  public MainMenu openPage() {
    open(baseUrl);
    return this;
  }

  public MainMenu clickByText(String value) {
    $(byText(value)).click();
    return this;
  }

  public MainMenu checkVisibleElement(String value) {
    $(byText(value)).shouldBe(Condition.visible);
    return this;
  }

}
