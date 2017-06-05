package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-2:Регистрация ЮР -лица в OFD.RU и Front-30:Регистрация ЮР -лица в OFD.RU (адрес юр.лица)
public class front2andFront30_RegistrationLegalEntity extends TestBase{

  @Test
  public void testRegistrationLegalEntity() throws InterruptedException {
    String email = "ofd222111@yopmail.com";
    String password = "12345";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().enterValuesInputFieldsLegalEntity();
  }

}
