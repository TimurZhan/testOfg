package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner.discountAndActivationCode;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-169:Коды активации. Создание кодов на скидку
public class Front169PurchaseDiscountCode extends TestBase {

  @Test
  public void testPurchaseDiscountCode () throws InterruptedException, IOException, SQLException {
    String email = "yaschenko@ofd.ru";
    String password = "121288";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkPurchaseDiscountCode();
    app.getNavigationHelper().signOutFromPK();
  }

}
