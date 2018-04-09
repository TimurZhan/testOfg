package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-150:Добавление нового клиента (такой клиент уже есть)
public class Front150CheckAddNewUserAlreadyExists extends TestBase {

  @Test
  public void testUserAlreadyExists() throws InterruptedException {
    String email2 = "ofduser350056677@yopmail.com";
    String inn = "121635324100";
    String email1 = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email1, password);
    app.getNavigationHelper().checkUserAlreadyExists(email2, inn);
  }

}
