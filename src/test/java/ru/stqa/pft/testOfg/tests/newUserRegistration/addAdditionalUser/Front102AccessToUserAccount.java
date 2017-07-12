package ru.stqa.pft.testOfg.tests.newUserRegistration.addAdditionalUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-102:Вход в личный кабинет доп.пользователя
public class Front102AccessToUserAccount extends TestBase {

  @Test
  public void testAccessToUserAccount() throws InterruptedException {
    String email = "ofdru007@yopmail.com";
    String password = "123";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkAccessUserAccount();
  }

}
