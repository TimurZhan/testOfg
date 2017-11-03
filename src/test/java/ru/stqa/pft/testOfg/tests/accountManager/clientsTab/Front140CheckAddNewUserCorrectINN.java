package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-140:Добавление нового клиента (ИНН - 9 символов)
public class Front140CheckAddNewUserCorrectINN extends TestBase {

  @Test
  public void testCorrectINN() throws SQLException, InterruptedException {
    String email = "ofduser3556677@yopmail.com";
    String inn = "905359385";

    app.getNavigationHelper().checkAddNewUserCorrectINN(email, inn);
  }

}
