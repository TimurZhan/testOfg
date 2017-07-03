package ru.stqa.pft.testOfg.tests.newUserRegistration.changeRegistrationData;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-86:Смена пароля
public class Front86CheckChangePassword extends TestBase {

  @Test
  public void testChangePassword() throws InterruptedException, IOException, SQLException {
    String email = "userofd007@yopmail.com";
    String password1 = "321";
    String password2 = "123";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().changingPassword(email, password1);
    app.db().sendPOSTRequestForLinkFormation(email);
    app.db().sendPOSTRequestForChangePassword(email, password2);
    app.getNavigationHelper().authUnderModifMail(email, password2);
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().changingPassword(email, password2);
    app.db().sendPOSTRequestForLinkFormation(email);
    app.db().sendPOSTRequestForChangePassword(email, password1);
    app.getNavigationHelper().authUnderModifMail(email, password1);
  }

}
