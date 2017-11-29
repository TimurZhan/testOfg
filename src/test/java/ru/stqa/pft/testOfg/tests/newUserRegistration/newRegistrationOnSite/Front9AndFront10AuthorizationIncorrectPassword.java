package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-10:Вход в личный кабинет (некорректный пароль)
public class Front9AndFront10AuthorizationIncorrectPassword extends TestBase {

  @Test
  public void testCheckAuthorizationPageIncorrectPassword() throws InterruptedException {
    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkAuthorizationIncorrectPassword();
  }

}
