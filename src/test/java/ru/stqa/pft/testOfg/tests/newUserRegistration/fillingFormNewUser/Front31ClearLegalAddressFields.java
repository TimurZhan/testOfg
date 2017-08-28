package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-31:Регитсрация ЮР -лица в OFD.RU (адрес юр.лица пустые поля)
public class Front31ClearLegalAddressFields extends TestBase {

  @Test
  public void testClearLegalAddressFields() throws InterruptedException {
    String email = "ofd222111@yopmail.com";
    String password = "123";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().clearLegalAddressFields();
  }

}
