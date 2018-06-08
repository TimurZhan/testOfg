package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-161:Клиенты, заведение нового клиента
public class Front161CreateNewUser extends TestBase {

  @Test
  public void test_CreateNewUser () throws InterruptedException, IOException, SQLException {
    long now = System.currentTimeMillis();
    String email2 = String.format("user%s@yopmail.com", now);
    String email1 = "zhanchikov@ofd.ru";
    String password = "12345";
    String inn = "7702386245";
    System.out.println(email2);

    app.getNavigationHelper().loginToSystem(email1, password);
    app.getNavigationHelper().createNewUser(email2, inn);
    app.getNavigationHelper().signOutFromPK();
    app.db().deleteUserFromDB(email2);
  }

}
