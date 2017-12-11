package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-73:Регистрация клиента OFD.RU (уже зарегистрированный ящик)
public class Front73EmailAlreadyRegistered extends TestBase {

  @Test
  public void testEmailAlreadyRegistered() throws InterruptedException {
    app.getNavigationHelper().clickButtonConnect();
    app.getNavigationHelper().checkEmailRegistrationForm();

  }

}
