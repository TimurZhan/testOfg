package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner.discountAndActivationCode;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-165:Коды активации. Вкладка Коды на скидку
public class Front165DiscountCode extends TestBase {

  @Test
  public void testDiscountCode () throws InterruptedException, IOException, SQLException {
    String email = "yaschenko@ofd.ru";
    String password = "121288";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkDiscountCodeTab();
    app.getNavigationHelper().checkPageDiscountCode();
    app.getNavigationHelper().signOutFromPK();
  }

}
