package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-163:Кассы.Вкладка Бронирование касс
public class Front163BookingCash extends TestBase {

  @Test
  public void testBookingCash () throws InterruptedException, IOException, SQLException {
    String email = "yaschenko@ofd.ru";
    String password = "121288";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkBookingCash();
    app.getNavigationHelper().signOutFromPK();
  }

}
