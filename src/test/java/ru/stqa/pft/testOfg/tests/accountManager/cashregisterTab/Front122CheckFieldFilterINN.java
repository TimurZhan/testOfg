package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-122:Проверка фильтра ИНН
public class Front122CheckFieldFilterINN extends TestBase {

  @Test
  public void testFieldFilterINN() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().fieldFilterByINN();
  }

}
