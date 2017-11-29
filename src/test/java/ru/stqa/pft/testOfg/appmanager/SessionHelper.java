package ru.stqa.pft.testOfg.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SessionHelper extends HelperBase {

  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  //Авторизация в системе
  public void login(String username, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    //click(By.cssSelector("div.pull-right a.analytics-login"));
    type(By.name("Login"), username);
    type(By.name("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
  }

}
