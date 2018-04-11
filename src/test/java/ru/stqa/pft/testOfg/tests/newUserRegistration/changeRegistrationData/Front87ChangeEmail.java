package ru.stqa.pft.testOfg.tests.newUserRegistration.changeRegistrationData;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-87:Смена электронного адреса
public class Front87ChangeEmail extends TestBase {

  @Test(enabled = true)
  public void testChangeEmail() throws InterruptedException, IOException, SQLException {
    String email1 = "userofd202@yopmail.com";
    String email2 = "userofd203@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email1, password);
    app.getNavigationHelper().changeEmail(email2, password);
    String link1 = app.db().confirmEmailRegistration(email2);
    System.out.println(link1);
    app.getNavigationHelper().confirmChangeEmail(email2, password, link1);
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email2, password);
    app.getNavigationHelper().changeEmail(email1, password);
    String link2 = app.db().confirmEmailRegistration(email1);
    System.out.println(link2);
    app.getNavigationHelper().confirmChangeEmail(email1, password, link2);
    app.getNavigationHelper().signOut();
  }

}
