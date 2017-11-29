package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-130:Проверка фильтра по номеру счета
public class Front130CheckFieldFilterInvoiceNumber extends TestBase {

  @Test
  public void testFilterInvoiceNumber() throws InterruptedException {
    app.getNavigationHelper().fieldFilterInvoiceNumber();
  }

}
