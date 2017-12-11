package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-7:Вход в личный кабинет (не зарегистрированный пользователь)
public class Front7AuthorizationUserNotRegister extends TestBase {

  @Test
  public void testCheckAuthorizationPageUserNotRegister() throws InterruptedException {
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkUserNotRegister();
  }

}
