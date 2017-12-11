package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkHomepage;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-58:Наличие всех вкладок на главной странице
public class Front58CheckingAllTabs extends TestBase {

  @Test
  public void testCheckingAllTabs() throws InterruptedException {
    app.getNavigationHelper().checkingTabsMainPage();
    app.getNavigationHelper().clickTabsMainPage();
  }

}
