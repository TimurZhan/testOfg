package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-137:Проверка страницы "Клиенты"
public class Front137CheckClientsTab extends TestBase {

  @Test
  public void testClientsTab() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkClientsTab();
  }

}
