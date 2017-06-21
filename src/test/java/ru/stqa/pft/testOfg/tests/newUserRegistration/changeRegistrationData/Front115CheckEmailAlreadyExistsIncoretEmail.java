package ru.stqa.pft.testOfg.tests.newUserRegistration.changeRegistrationData;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-115:Смена электронного адреса (некорректный пароль)
public class Front115CheckEmailAlreadyExistsIncoretEmail extends TestBase {

  @Test
  public void testEmailAlreadyExistsIncoretEmail() throws InterruptedException {
    String email = "userofd12345yopmail.com";
    String password = "12345";
    app.getNavigationHelper().checkEmailIncoretEmail(email, password);
  }

}
