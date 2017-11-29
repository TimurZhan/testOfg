package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-129:Проверка фильтра по регномеру
public class Front129CheckFieldFilterRegnumber extends TestBase {

  @Test
  public void testFieldFilterRegnumber() throws InterruptedException {
    app.getNavigationHelper().fieldFilterRegnumber();
  }

}
