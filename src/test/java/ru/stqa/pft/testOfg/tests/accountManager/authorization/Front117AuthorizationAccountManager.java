package ru.stqa.pft.testOfg.tests.accountManager.authorization;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-117:Вход в МК
public class Front117AuthorizationAccountManager extends TestBase{

  @Test
  public void testAuthAccountManager() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().authAccountManager(email, password);
  }

}
