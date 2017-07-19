package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-18:Регистрация кассы с некорректным ФН
public class Front18IncorrectFiscalNumber extends TestBase {

  @Test
  public void testFiscalNumber() throws InterruptedException {
    String email = "ofdtestpartner@yopmail.com";
    String password = "12345";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkIncorrectFiscalNumber();
  }

}
