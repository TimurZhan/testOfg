package ru.stqa.pft.testOfg.tests.newUserRegistration.registrationOnNewsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-146:Регистрация клиента (еmail- неверный)
public class Front146RegistrClientInvalidEmail extends TestBase {

  @Test
  public void testInvalidEmail() throws InterruptedException {
    String password = "123";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().registInvalidEmail(password);
  }

}
