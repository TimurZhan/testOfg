package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-128:Проверка фильтра по номеру кассы (некорректный номер кассы)
public class Front128CheckFieldFilterIncorrectCashNumber extends TestBase {

  @Test
  public void testFilterIncorrectCashNumber() throws InterruptedException {
    app.getNavigationHelper().fieldFilterIncorrectCashNumber();
  }

}