package ru.stqa.pft.testOfg.tests.newUserRegistration.changeRegistrationData;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-112:Смена пароля (пароли не совпадают)
public class Front112PasswordsNotMatch extends TestBase {

  @Test(enabled = false)
  public void testPasswordsNotMatch() throws InterruptedException {
    String email = "testuserofd@yopmail.com";
    String password1 = "123";
    String password2 = "321";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password1);
    app.getNavigationHelper().changingPasswordOnLK();
    app.getNavigationHelper().checkPasswordsNotMatch(email, password1, password2);
  }

}
