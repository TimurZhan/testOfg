package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-53:Регистрация клиента OFD.RU (не указан Юр.адрес)
public class Front53FieldLegalAddressEmpty extends TestBase {

  @Test
  public void testFieldLegalAddressEmpty() throws InterruptedException {
    String email = "userofd2@yopmail.com";
    String password = "12345";
    String inn = "2464114499";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkFieldLegalAddressEmpty(inn);
  }

}