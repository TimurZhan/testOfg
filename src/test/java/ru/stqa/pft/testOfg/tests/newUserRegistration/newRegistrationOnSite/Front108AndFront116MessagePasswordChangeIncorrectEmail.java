package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-108:Вход в личный кабинет (забыли пароль некорректный e-mail)
public class Front108AndFront116MessagePasswordChangeIncorrectEmail extends TestBase {

  @Test
  public void testIncorrectEmail() throws InterruptedException {
    app.getNavigationHelper().checkMessagePasswordChangeIncorrectEmail();
  }

}
