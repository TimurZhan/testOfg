package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-164:Коды Активации. Вкладка Коды активации
public class Front164ActivationCode extends TestBase {

  @Test
  public void testActivationCode () throws InterruptedException, IOException, SQLException {
    String email = "yaschenko@ofd.ru";
    String password = "121288";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkActivationCodeTab();
    app.getNavigationHelper().checkFilterCode();
    app.getNavigationHelper().checkPageCode();
    app.getNavigationHelper().signOutFromPK();
  }

}
