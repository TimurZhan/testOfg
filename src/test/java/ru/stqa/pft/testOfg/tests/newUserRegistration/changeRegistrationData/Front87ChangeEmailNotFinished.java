package ru.stqa.pft.testOfg.tests.newUserRegistration.changeRegistrationData;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-87:Смена электронного адреса
public class Front87ChangeEmailNotFinished extends TestBase {

  @Test(enabled = true)
  public void testChangeEmail() throws InterruptedException, IOException, SQLException {
    String email1 = "userofd202@yopmail.com";
    String email2 = "userofd203@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email1, password);
    //Разобраться с ПОСТ запросом. Он не отрабатывает.
    app.db().sendPOSTRequestForChangeEmail(email1, email2, password);
    app.getNavigationHelper().authUnderModifMail();
    app.getNavigationHelper().loginToSystem(email2, password);
    app.getNavigationHelper().signOut();
  }

}
