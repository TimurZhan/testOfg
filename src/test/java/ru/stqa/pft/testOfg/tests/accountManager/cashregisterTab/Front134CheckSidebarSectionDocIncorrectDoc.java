package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-134:Проверка блока "Просмотреть документ (превышена длина значения)
public class Front134CheckSidebarSectionDocIncorrectDoc extends TestBase {

  @Test
  public void testSectionDocIncorrectDoc() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkSectionDocIncorrectDoc();
  }

}
