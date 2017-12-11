package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-125:Проверка фильтра по номеру ФН
public class Front125CheckFieldFilterFN extends TestBase {

  @Test
  public void testFieldFilterFN() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().fieldFilterByFN();
  }

}
