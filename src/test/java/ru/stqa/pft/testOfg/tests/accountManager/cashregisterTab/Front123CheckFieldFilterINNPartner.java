package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-123:Проверка фильтра ИНН партнера
public class Front123CheckFieldFilterINNPartner extends TestBase {

  @Test
  public void testFieldFilterINNPartner() throws InterruptedException {
    app.getNavigationHelper().fieldFilterByINNPartner();
  }

}
