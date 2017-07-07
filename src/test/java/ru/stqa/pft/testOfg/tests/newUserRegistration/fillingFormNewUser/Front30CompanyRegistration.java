package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-30:Регистрация ЮР -лица в OFD.RU (адрес юр.лица)
public class Front30CompanyRegistration extends TestBase {

  @Test
  public void testRegistrationCompany() throws InterruptedException, SQLException {
    String email = "usercompany@yopmail.com";
    String password = "123";
    String inn = "2464114499";
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkCompanyRegistration(inn);
    app.getNavigationHelper().signOut();
    app.db().deleteINN(inn);
    app.db().deleteUserFromDB(email);
    app.db().addUserInDB(email);
  }

}
