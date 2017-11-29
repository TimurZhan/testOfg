package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkHomepage;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-61:Проверка раздела "Новости"
public class Front61CheckingNewsTab extends TestBase {

  @Test
  public void testCheckingNewsTab() throws InterruptedException {
    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().clickMainLabel();
    app.getNavigationHelper().checkNewsPage();
  }

}
