package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-21:Регистрация кассы с некорректным параметрами
public class Front21IncorrectFiscalAndCashNumber extends TestBase {

  @Test
  public void testFiscalAndCashNumber() throws InterruptedException {
    String email = "ofdtestpartner@yopmail.com";
    String password = "12345";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkIncorrectFiscalAndCashNumber();
  }

}
