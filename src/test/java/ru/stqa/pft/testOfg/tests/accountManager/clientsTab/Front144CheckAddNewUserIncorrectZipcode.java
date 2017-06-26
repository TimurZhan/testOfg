package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-144:Добавление нового клиента (некорректный индекс)
public class Front144CheckAddNewUserIncorrectZipcode extends TestBase {

  @Test
  public void testIncorrectZipcode() throws InterruptedException {
    String email = "ofduser3556677@yopmail.com";
    String inn = "124601959242";
    app.getNavigationHelper().checkAddNewUserIncorrectZipcode(email, inn);
  }

}
