package tests;

import org.junit.jupiter.api.Test;
import components.MainMenu;

public class BorkTests extends TestBase{
  MainMenu mainMenu = new MainMenu();

  @Test
  void checkLang() {
    mainMenu.openPage()
            .clickByText("Личный кабинет")
            .clickByText("Eng")
            .checkVisibleElement("Cleanliness and climate");
  }
}
