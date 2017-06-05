package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-32:Регитсрация в OFD.RU (чек-бокс Адрес корреспонденции)
public class Front32FillOutAddressCorresp extends TestBase {

  @Test
  public void testFillOutAddressCorresp() throws InterruptedException {
    String email = "ofd222111@yopmail.com";
    String password = "12345";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().enterValuesCorrespAddress();
  }

}
