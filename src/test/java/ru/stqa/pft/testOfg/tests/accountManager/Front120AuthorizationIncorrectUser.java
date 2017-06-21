package ru.stqa.pft.testOfg.tests.accountManager;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-120: Вход в МК (другая роль)
public class Front120AuthorizationIncorrectUser extends TestBase {

  @Test
  public void testIncorrectUser() throws InterruptedException {
    String email = "userofd@yopmail.com";
    String password = "123";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().authIncorrectUser(email, password);
  }

}
