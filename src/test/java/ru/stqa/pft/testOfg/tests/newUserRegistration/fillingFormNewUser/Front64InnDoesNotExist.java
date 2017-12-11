package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-64:Регистрация данных пользователя (нет данных клиента)
public class Front64InnDoesNotExist extends TestBase {

  @Test
  public void testInnDoesNotExist() throws InterruptedException {
    String email = "ofdtest@yopmail.com";
    String password = "12345";
    String inn = "675675677646";

    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkInnDoesNotExist(inn);
  }

}