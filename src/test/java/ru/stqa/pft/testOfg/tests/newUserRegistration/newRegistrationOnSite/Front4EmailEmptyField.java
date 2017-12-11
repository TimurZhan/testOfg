package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-4:Регистрация пользователя (некорректный e-mail пустые значения)
public class Front4EmailEmptyField extends TestBase {

  @Test
  public void testEmailAlreadyRegistered() throws InterruptedException {
    app.getNavigationHelper().clickButtonConnect();
    app.getNavigationHelper().checkEmailEmptyField();
  }

}
