package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkHomepage;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-62:Проверка раздела "О компании"
public class Front62CheckingInformatinCompanyTab extends TestBase {

  @Test
  public void testCheckingInformatinCompanyTab() throws InterruptedException {
    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().clickMainLabel();
    app.getNavigationHelper().checkInformationCompany();
  }

}
