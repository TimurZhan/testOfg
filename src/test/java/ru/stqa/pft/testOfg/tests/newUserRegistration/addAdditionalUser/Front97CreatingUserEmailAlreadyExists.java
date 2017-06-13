package ru.stqa.pft.testOfg.tests.newUserRegistration.addAdditionalUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-97:Создание "дополнительного пользователя" email уже существует
public class Front97CreatingUserEmailAlreadyExists extends TestBase {

  @Test
  public void testEmailAlreadyExists() throws InterruptedException {
    String email = "userofd4@yopmail.com";
    app.getNavigationHelper().addAdditionalUser2(email);
  }

}
