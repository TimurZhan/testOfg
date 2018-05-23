package ru.stqa.pft.testOfg.tests.newUserRegistration.changeRegistrationData;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-113:Смена электронного адреса (e-mail уже существует)
public class Front113ChangingEmailAlreadyExists extends TestBase {

  @Test
  public void testChangingEmailAddress() throws InterruptedException {
    String email = "user1527068766772@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkEmailAlreadyExists(email, password);
    app.getNavigationHelper().signOut();
  }

}
