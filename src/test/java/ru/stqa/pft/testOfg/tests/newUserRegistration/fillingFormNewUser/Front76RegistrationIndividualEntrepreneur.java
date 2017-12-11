package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-76:Регистрация ИП в OFD.RU
public class Front76RegistrationIndividualEntrepreneur extends TestBase {

  @Test
  public void testRegistrationIndividualEntrepreneur() throws InterruptedException, SQLException {
    String email = "usercompany@yopmail.com";
    String password = "123";
    String inn = "246215905925";

    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().enterValuesInputFieldsIndividualEntrepreneur(inn);
    app.getNavigationHelper().signOut();
    app.db().deleteINN(inn);
    app.db().deleteUserFromDB(email);
    app.db().addUserInDB(email);
  }

}
