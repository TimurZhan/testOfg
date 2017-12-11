package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-33:Регитсрация в OFD.RU (чек-бокс Адрес корреспонденции пустые поля)
public class Front33CorrespAddressFields extends TestBase {

  @Test
  public void testCorrespAddressFields() throws InterruptedException {
    String email = "ofd222111@yopmail.com";
    String password = "123";
    String inn ="6618399732";

    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().notFillCorresoAddressFields(inn);
  }

}
