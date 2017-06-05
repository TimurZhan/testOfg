package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-28:Регистрация данных пользователя (некорректный ИНН)
public class Front28InnNotFound extends TestBase {

  @Test
  public void testInnNotFound() throws InterruptedException {
    String email = "ofdtest@yopmail.com";
    String password = "12345";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkInnNotFound();
  }

}
