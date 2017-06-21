package ru.stqa.pft.testOfg.tests.accountManager;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-118:Вход в МК (некорректный e-mail)
public class Front118AuthorizationIncorrectEmail extends TestBase {

  @Test
  public void testAuthIncorrectEmail() throws InterruptedException {
    String email = "test1111@yopmail.com";
    String password = "123";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().authIncorrectEmail(email, password);
  }

}
