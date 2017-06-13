package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-21:Регистрация кассы с некорректным параметрами
public class Front21IncorrectFiscalAndCashNumber extends TestBase {

  @Test
  public void testFiscalAndCashNumber() throws InterruptedException {
    app.getNavigationHelper().checkIncorrectFiscalAndCashNumber();
  }

}
