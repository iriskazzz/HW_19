package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties",
})

public interface WebConfig extends Config{

  @Key("browserName")
  @DefaultValue("chrome")
  String getBrowserName();

  @Key("browserVersion")
  @DefaultValue("119.0")
  String getBrowserVersion();

  @Key("remoteUrl")
  String getRemoteUrl();

  @Key("baseUrl")
  @DefaultValue("https://www.bork.ru/")
  String getBaseUrl();

}
