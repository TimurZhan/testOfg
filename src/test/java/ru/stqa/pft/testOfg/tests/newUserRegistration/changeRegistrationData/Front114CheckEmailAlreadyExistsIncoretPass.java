package ru.stqa.pft.testOfg.tests.newUserRegistration.changeRegistrationData;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-114:Смена электронного адреса (некорректный e-mail)
public class Front114CheckEmailAlreadyExistsIncoretPass extends TestBase {

  @Test
  public void testEmailAlreadyExistsIncoretPass() throws InterruptedException {
    String email = "testuserofd@yopmail.com";
    String password1 = "123";
    String password2 = "124";

    app.getNavigationHelper().loginToSystem(email, password1);
    app.getNavigationHelper().checkEmailIncoretPassword(email, password2);
    app.getNavigationHelper().signOut();
  }

}
