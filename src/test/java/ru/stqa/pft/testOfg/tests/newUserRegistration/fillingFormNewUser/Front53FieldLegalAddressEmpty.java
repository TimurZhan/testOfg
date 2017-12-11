package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-53:Регистрация клиента OFD.RU (не указан Юр.адрес)
public class Front53FieldLegalAddressEmpty extends TestBase {

  @Test
  public void testFieldLegalAddressEmpty() throws InterruptedException {
    String email = "ofdinnispres@yopmail.com";
    String password = "123";
    String inn = "6618399732";

    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkFieldLegalAddressEmpty(inn);
  }

}