package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-18:Регистрация кассы с некорректным ФН
public class Front18IncorrectFiscalNumber extends TestBase {

  @Test
  public void testFiscalNumber() throws InterruptedException {
    app.getNavigationHelper().checkIncorrectFiscalNumber();
  }

}
