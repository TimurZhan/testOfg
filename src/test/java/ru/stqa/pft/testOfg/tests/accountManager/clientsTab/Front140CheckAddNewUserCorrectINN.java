package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-140:Добавление нового клиента (ИНН - 9 символов)
public class Front140CheckAddNewUserCorrectINN extends TestBase {

  @Test
  public void testCorrectINN() throws SQLException, InterruptedException {
    String email2 = "ofduser3556677@yopmail.com";
    String inn = "905359385";
    String email1 = "zhanchikov@ofd.ru";
    String password = "12345";

    app.getNavigationHelper().loginToSystem(email1, password);
    app.getNavigationHelper().checkAddNewUserCorrectINN(email2, inn);
  }

}
