package ru.stqa.pft.testOfg.tests.newUserRegistration.changeRegistrationData;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-114:Смена электронного адреса (некорректный e-mail)
public class Front114CheckEmailAlreadyExistsIncoretPass extends TestBase {

  @Test
  public void testEmailAlreadyExistsIncoretPass() throws InterruptedException {
    String email = "userofd007@yopmail.com";
    String password = "12346";
    app.getNavigationHelper().checkEmailIncoretPassword(email, password);
  }

}
