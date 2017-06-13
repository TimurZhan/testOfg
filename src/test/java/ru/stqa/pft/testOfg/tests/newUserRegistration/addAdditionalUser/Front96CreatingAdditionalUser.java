package ru.stqa.pft.testOfg.tests.newUserRegistration.addAdditionalUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-96:Создание "дополнительного пользователя"
public class Front96CreatingAdditionalUser extends TestBase {

  @Test
  public void testCreatingUser() throws InterruptedException {
    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email = String.format(user + "@yopmail.com");
    app.getNavigationHelper().createMailbox(user);
    app.getNavigationHelper().addAdditionalUser(email);
    app.getNavigationHelper().checkVerificationEmail(user);
    app.getNavigationHelper().checkUserConfirmation(email);
  }

}
