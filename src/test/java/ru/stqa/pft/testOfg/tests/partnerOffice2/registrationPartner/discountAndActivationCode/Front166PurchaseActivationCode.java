package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner.discountAndActivationCode;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-166:Коды активации. Покупка кодов активации
public class Front166PurchaseActivationCode extends TestBase {

  @Test
  public void testPurchaseCode () throws InterruptedException, IOException, SQLException {
    String email = "yaschenko@ofd.ru";
    String password = "121288";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkPurchaseCode();
    app.getNavigationHelper().signOutFromPK();
  }

}
