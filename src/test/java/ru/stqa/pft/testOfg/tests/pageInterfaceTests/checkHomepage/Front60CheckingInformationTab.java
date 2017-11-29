package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkHomepage;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-60:Проверка раздела "Информация"
public class Front60CheckingInformationTab extends TestBase {

  @Test
  public void testCheckingInformationTab() throws InterruptedException {
    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().clickMainLabel();
    app.getNavigationHelper().checkInformationPage();
  }

}
