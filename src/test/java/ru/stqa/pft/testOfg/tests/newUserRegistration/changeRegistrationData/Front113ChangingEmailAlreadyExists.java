package ru.stqa.pft.testOfg.tests.newUserRegistration.changeRegistrationData;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-113:Смена электронного адреса (e-mail уже существует)
public class Front113ChangingEmailAlreadyExists extends TestBase {

  @Test
  public void testChangingEmailAddress() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";
    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkEmailAlreadyExists(email, password);
    app.getNavigationHelper().signOut();
  }

}
