package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-20:Регистрация касс,которые уже были зарегистрированы
public class Front20CashNumberAlreadyExists extends TestBase {

  @Test
  public void testCashNumberAlreadyExists() throws InterruptedException {
    String email = "ofdtestpartner@yopmail.com";
    String password = "12345";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkCashNumberAlreadyExists();
  }

}
