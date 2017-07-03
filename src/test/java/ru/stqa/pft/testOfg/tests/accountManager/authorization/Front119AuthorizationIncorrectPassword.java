package ru.stqa.pft.testOfg.tests.accountManager.authorization;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-119:Вход в МК (некорректный пароль)
public class Front119AuthorizationIncorrectPassword extends TestBase {

  @Test
  public void testtestAuthIncorrectPassword() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12346";
    app.getNavigationHelper().authIncorrectPassword(email, password);
  }

}
