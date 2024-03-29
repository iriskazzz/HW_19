package tests;

import com.codeborne.selenide.Configuration;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

  @BeforeAll
  static void beforeAll() {
    WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
    Configuration.baseUrl = webConfig.getBaseUrl();
    Configuration.browser = webConfig.getBrowserName();
    Configuration.browserVersion = webConfig.getBrowserVersion();
    Configuration.remote = webConfig.getRemoteUrl();
    Configuration.pageLoadStrategy = "eager";
  }

}
