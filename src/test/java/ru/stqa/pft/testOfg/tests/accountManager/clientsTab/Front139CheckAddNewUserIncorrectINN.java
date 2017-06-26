package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-139:Добавление нового клиента (ИНН некорректный)
public class Front139CheckAddNewUserIncorrectINN extends TestBase {

  @Test
  public void testIncorrectINN() throws InterruptedException {
    String inn = "1234567890123";
    app.getNavigationHelper().checkAddNewUserIncorrectINN(inn);
  }

}
