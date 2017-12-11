package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-106:Вход в личный кабинет (забыли пароль)
public class Front106MessagePasswordChange extends TestBase {

  @Test
  public void testMessagePasswordChange() throws InterruptedException {
    app.getNavigationHelper().checkMessagePasswordChange();
  }

}
