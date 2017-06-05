package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-76:Регистрация ИП в OFD.RU
public class Front76RegistrationIndividualEntrepreneur extends TestBase {

  @Test
  public void testRegistrationIndividualEntrepreneur() throws InterruptedException {
    String email = "timurofd123@mailinator.com";
    String password = "12345";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().enterValuesInputFieldsIndividualEntrepreneur();
  }

}
