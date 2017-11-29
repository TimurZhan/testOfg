package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-11:Вход в личный кабинет (Пустое поле)
public class Front11AuthorizationEmptyInput extends TestBase {

  @Test
  public void testCheckAuthorizationPageEmptyInput() throws InterruptedException {
    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkAuthorizationEmptyInput();
  }

}
