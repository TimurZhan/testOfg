package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-126:Проверка фильтра по номеру ФН (некорректный номер ФН)
public class Front126CheckFieldFilterIncorrectFN extends TestBase {

  @Test
  public void testFilterIncorrectFN() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().fieldFilterIncorrectFN();
  }

}
