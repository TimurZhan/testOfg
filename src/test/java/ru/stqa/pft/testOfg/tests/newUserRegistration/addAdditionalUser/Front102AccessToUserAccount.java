package ru.stqa.pft.testOfg.tests.newUserRegistration.addAdditionalUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-102:Вход в личный кабинет доп.пользователя
public class Front102AccessToUserAccount extends TestBase {

  @Test
  public void testAccessToUserAccount() throws InterruptedException {
    app.getNavigationHelper().checkAccessUserAccount();
  }

}
