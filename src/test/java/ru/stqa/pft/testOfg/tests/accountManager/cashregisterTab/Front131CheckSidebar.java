package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-131:Проверка сайтбара
public class Front131CheckSidebar extends TestBase {

  @Test
  public void testCheckSidebar() throws InterruptedException {
    app.getNavigationHelper().checkCheckSidebar();
  }

}
