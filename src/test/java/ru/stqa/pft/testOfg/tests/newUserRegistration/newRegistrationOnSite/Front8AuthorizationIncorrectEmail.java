package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-8:Вход в личный кабинет (некорректный email)
public class Front8AuthorizationIncorrectEmail extends TestBase {

  @Test
  public void testCheckAuthorizationPageUserIncorrectEmail() throws InterruptedException {
    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkAuthorizationIncorrectEmail();
  }

}
