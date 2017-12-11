package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-3:Регистрация клиента OFD.RU некорректный email
public class Front3IncorrectEmail extends TestBase {

  @Test
  public void testIncorrectEmail() throws InterruptedException {
    app.getNavigationHelper().clickButtonConnect();
    app.getNavigationHelper().checkEmailWhenRegistering();
  }

}