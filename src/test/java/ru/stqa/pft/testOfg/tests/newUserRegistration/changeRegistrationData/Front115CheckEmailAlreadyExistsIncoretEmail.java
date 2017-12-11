package ru.stqa.pft.testOfg.tests.newUserRegistration.changeRegistrationData;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-115:Смена электронного адреса (некорректный пароль)
public class Front115CheckEmailAlreadyExistsIncoretEmail extends TestBase {

  @Test
  public void testEmailAlreadyExistsIncoretEmail() throws InterruptedException {
    String email1 = "testuserofd@yopmail.com";
    String email2 = "testuserofd@yopmailcom";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email1, password);
    app.getNavigationHelper().checkEmailIncoretEmail(email2, password);
    app.getNavigationHelper().signOut();
  }

}
