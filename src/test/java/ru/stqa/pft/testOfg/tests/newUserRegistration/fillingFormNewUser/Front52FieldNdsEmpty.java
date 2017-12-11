package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-52:Регистрация клиента OFD.RU (не указан НДС)
public class Front52FieldNdsEmpty extends TestBase {

  @Test
  public void testFieldNdsEmpty() throws InterruptedException {
    String email = "ofdinnispres@yopmail.com";
    String password = "123";
    String inn = "7719778113";

    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkFieldNdsEmpty(inn);
  }

}
