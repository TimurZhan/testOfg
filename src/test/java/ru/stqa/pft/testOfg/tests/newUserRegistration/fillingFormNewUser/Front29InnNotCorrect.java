package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-29:Регистрация данных пользователя (неверный ИНН)
public class Front29InnNotCorrect extends TestBase {

  @Test
  public void testInnNotCorrect() throws InterruptedException {
    String email = "ofdtest@yopmail.com";
    String password = "12345";

    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkNotCorrectInn();
  }

}