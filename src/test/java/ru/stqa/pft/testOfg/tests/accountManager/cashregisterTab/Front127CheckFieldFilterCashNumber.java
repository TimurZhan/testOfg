package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-127:Проверка фильтра по номеру кассы
public class Front127CheckFieldFilterCashNumber extends TestBase {

  @Test
  public void testFilterCashNumber() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().fieldFilterCashNumber();
  }

}
