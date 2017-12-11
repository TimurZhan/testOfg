package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-132:Проверка сайтбара (блок Действия)
public class Front132CheckSidebarSectionActions extends TestBase {

  @Test
  public void testSectionActions() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkSectionActions();
  }

}
