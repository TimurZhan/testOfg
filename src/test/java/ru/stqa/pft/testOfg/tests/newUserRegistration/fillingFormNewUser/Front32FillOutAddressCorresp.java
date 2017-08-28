package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

// Front-32:Регитсрация в OFD.RU (чек-бокс Адрес корреспонденции)
public class Front32FillOutAddressCorresp extends TestBase {

  @Test
  public void testFillOutAddressCorresp() throws InterruptedException, SQLException {
    String email = "ofd222111@yopmail.com";
    String password = "123";
    String inn = "5262210124";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().enterValuesCorrespAddress(inn);
    app.getNavigationHelper().signOut();
    app.db().deleteINN(inn);
    app.db().deleteUserFromDB(email);
    app.db().addUserInDB(email);
  }

}
