package ru.stqa.pft.testOfg.tests.newUserRegistration.changeRegistrationData;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-86:Смена пароля
public class Front86CheckChangePassword extends TestBase {

  @Test(enabled = true)
  public void testChangePassword() throws InterruptedException, IOException, SQLException {
    String email = "userofd12341@yopmail.com";
    String password1 = "123";
    String password2 = "321";

    app.getNavigationHelper().loginToSystem(email, password1);
    app.db().sendPOSTRequestForLinkFormation(email);
    app.db().sendPOSTRequestForChangePassword(email, password2);
    app.getNavigationHelper().authUnderModifMail();
    app.getNavigationHelper().loginToSystem(email, password2);
    app.getNavigationHelper().signOut();
    app.db().sendPOSTRequestForLinkFormation(email);
    app.db().sendPOSTRequestForChangePassword(email, password1);
  }

}
