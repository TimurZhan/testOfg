package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-144:Добавление нового клиента (некорректный индекс)
public class Front144CheckAddNewUserIncorrectZipcode extends TestBase {

  @Test
  public void testIncorrectZipcode() throws InterruptedException {
    String email2 = "ofduser3556677@yopmail.com";
    String inn = "290124258407";
    String email1 = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email1, password);
    app.getNavigationHelper().checkAddNewUserIncorrectZipcode(email2, inn);
  }

}
