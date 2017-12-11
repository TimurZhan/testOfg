package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-6:Вход в личный кабинет
public class Front6CheckLoginAccount extends TestBase {

  @Test
  public void testCheckLoginAccount() throws InterruptedException {
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkHomePage();
  }

}
