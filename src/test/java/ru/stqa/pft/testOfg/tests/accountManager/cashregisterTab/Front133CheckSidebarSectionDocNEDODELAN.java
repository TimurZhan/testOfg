package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-133:Проверка сайтбара (блок Просмотреть документ)
public class Front133CheckSidebarSectionDocNEDODELAN extends TestBase {

  @Test(enabled = false)
  public void testSectionDoc() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    app.getNavigationHelper().loginToSystem(email, password);

  }

}
