package ru.stqa.pft.testOfg.tests.newUserRegistration.registrationOnNewsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-147:Регистрация клиента (не указываем phone number)
public class Front147RegistrClientInvalidNumber extends TestBase {

  @Test
  public void testInvalidNumber() throws InterruptedException {
    String password = "123";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().registInvalidNumber(password);
  }

}
