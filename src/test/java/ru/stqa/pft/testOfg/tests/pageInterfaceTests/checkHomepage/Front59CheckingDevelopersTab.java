package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkHomepage;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-59:Проверка вкладки "Разработчикам"
public class Front59CheckingDevelopersTab extends TestBase {

  @Test
  public void testCheckingDevelopersTab() throws InterruptedException {
    app.getNavigationHelper().clickMainLabel();
    app.getNavigationHelper().checkDevelopersPage();
  }

}
