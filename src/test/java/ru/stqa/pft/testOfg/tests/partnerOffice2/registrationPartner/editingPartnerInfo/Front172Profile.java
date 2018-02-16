package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner.editingPartnerInfo;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-172:Профиль
public class Front172Profile extends TestBase {

  @Test
  public void testProfile () throws InterruptedException, IOException, SQLException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkProfile();
    app.getNavigationHelper().signOutFromPK();
  }

}
