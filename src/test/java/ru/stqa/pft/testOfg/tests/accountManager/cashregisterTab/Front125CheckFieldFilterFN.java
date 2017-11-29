package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-125:Проверка фильтра по номеру ФН
public class Front125CheckFieldFilterFN extends TestBase {

  @Test
  public void testFieldFilterFN() throws InterruptedException {
    app.getNavigationHelper().fieldFilterByFN();
  }

}
