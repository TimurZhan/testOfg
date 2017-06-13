package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-19:Регистрация кассы с некорректным НК
public class Front19IncorrectCashRegisterNumber extends TestBase {

  @Test
  public void testIncorrectCashNum() throws InterruptedException {
    app.getNavigationHelper().checkIncorrectCashRegisterNumber();
  }

}
