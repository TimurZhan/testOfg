package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-52:Регистрация клиента OFD.RU (не указан НДС)
public class Front52FieldNdsEmpty extends TestBase {

  @Test
  public void testFieldNdsEmpty() throws InterruptedException {
    String email = "userofd2@yopmail.com";
    String password = "12345";
    String inn = "2464114499";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkFieldNdsEmpty(inn);
  }

}
