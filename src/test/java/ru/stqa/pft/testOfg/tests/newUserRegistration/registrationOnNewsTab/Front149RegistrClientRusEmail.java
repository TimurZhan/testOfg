package ru.stqa.pft.testOfg.tests.newUserRegistration.registrationOnNewsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-149:Регистрация клиента (почта кириллицей)
public class Front149RegistrClientRusEmail extends TestBase {

  @Test(enabled = false)
  public void testRusEmail() throws InterruptedException {
    String email = "русмылотест@письмо.рф";
    String password = "123";

    app.getNavigationHelper().registRusEmail(email, password);
  }

}
