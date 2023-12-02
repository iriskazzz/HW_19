package tests;

import org.junit.jupiter.api.Test;
import pages.MainPage;

public class BorkTests extends TestBase{
  MainPage mainPage = new MainPage();

  @Test
  void CheckLang() {
    mainPage.openPage()
            .clickByText("Личный кабинет")
            .clickByText("Eng")
            .checkVisibleElement("Cleanliness and climate");
  }
}
