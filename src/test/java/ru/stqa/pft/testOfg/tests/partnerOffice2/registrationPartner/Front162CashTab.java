package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-162:Кассы.Вкладка Кассы
public class Front162CashTab extends TestBase {

  @Test
  public void testCashTab () throws InterruptedException, IOException, SQLException {
    String email = "yaschenko@ofd.ru";
    String password = "121288";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkCashTab();
    app.getNavigationHelper().checkSearchCash();
    app.getNavigationHelper().checkAddCash();
    app.getNavigationHelper().signOutFromPK();
  }

}
