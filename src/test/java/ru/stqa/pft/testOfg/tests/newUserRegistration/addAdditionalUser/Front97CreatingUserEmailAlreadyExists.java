package ru.stqa.pft.testOfg.tests.newUserRegistration.addAdditionalUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-97:Создание "дополнительного пользователя" email уже существует
public class Front97CreatingUserEmailAlreadyExists extends TestBase {

  @Test(enabled = true)
  public void testEmailAlreadyExists() throws InterruptedException {
    String email = "user1497865190220@yopmail.com";
    String email2 = "user1527069419291@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email2, password);
    app.getNavigationHelper().addAdditionalUser2(email);
  }

}
