package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-91:Регистрация на сайте (неверный e-mail)
public class Front91ChangePasswordIncorrectEmail extends TestBase {

  @Test
  public void testEmailAlreadyRegistered() throws InterruptedException {
    app.getNavigationHelper().checkChangePasswordEmailEmptyField();
  }


}
