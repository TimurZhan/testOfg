package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkHomepage;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-63:Проверка вкладки "Партнёрам"
public class Front63CheckingPartnersTab extends TestBase {

  @Test
  public void testCheckingPartnersTab() throws InterruptedException {
    app.getNavigationHelper().clickMainLabel();
    app.getNavigationHelper().checkPartnersPage();
  }

}
