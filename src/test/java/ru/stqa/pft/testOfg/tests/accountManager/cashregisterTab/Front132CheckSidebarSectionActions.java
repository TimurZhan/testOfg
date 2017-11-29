package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-132:Проверка сайтбара (блок Действия)
public class Front132CheckSidebarSectionActions extends TestBase {

  @Test
  public void testSectionActions() throws InterruptedException {
    app.getNavigationHelper().checkSectionActions();
  }

}
