package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-30:Регистрация ЮР -лица в OFD.RU (адрес юр.лица)
public class Front30CompanyRegistration extends TestBase {

  @Test
  public void testRegistrationCompany() throws InterruptedException {
    String email = "usercompany@yopmail.com";
    String password = "12345";
    String inn = "2464114499";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkCompanyRegistration(inn);
  }

}
