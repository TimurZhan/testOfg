package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-160:Клиенты Общая страница
public class Front160ClientsGeneralPage extends TestBase {

  @Test
  public void testGeneralPage() throws InterruptedException, IOException, SQLException {
    String email = "yaschenko@ofd.ru";
    String password = "121288";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().generalPageCheck();
    app.getNavigationHelper().signOutFromPK();
  }

}
