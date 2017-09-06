package ru.stqa.pft.testOfg.tests.newUserRegistration.registrationOnNewsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-148:Регистрация клиента (не указываем password)
public class Front148RegistrClientInvalidPassword extends TestBase {

  @Test
  public void testInvalidPassword() throws InterruptedException {

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().registInvalidPassword();
  }

}
