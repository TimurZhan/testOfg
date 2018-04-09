package ru.stqa.pft.testOfg.tests.newUserRegistration.addAdditionalUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-97:Создание "дополнительного пользователя" email уже существует
public class Front97CreatingUserEmailAlreadyExists extends TestBase {

  @Test(enabled = true)
  public void testEmailAlreadyExists() throws InterruptedException {
    String email = "user1497865190220@yopmail.com";
    String email2 = "zhanchikov@ofd.ru";
    String password = "12345";

    app.getNavigationHelper().loginToSystem(email2, password);
    app.getNavigationHelper().addAdditionalUser2(email);
  }

}
