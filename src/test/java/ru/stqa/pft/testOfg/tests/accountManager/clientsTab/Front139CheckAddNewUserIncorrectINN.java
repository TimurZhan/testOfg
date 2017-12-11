package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-139:Добавление нового клиента (ИНН некорректный)
public class Front139CheckAddNewUserIncorrectINN extends TestBase {

  @Test
  public void testIncorrectINN() throws InterruptedException {
    String inn = "1234567890123";
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkAddNewUserIncorrectINN(inn);
  }

}
