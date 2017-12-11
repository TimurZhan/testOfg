package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-143:Добавление нового клиента (Юр.лицо)
public class Front143CheckAddNewUserlegalEntity extends TestBase {

  @Test
  public void testAddNewUserlegalEntity() throws SQLException, InterruptedException {
    String email2 = "ofduser3556677@yopmail.com";
    String inn = "7906006886";
    String email1 = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email1, password);
    app.getNavigationHelper().checkAddNewUserlegalEntity(email2, inn);
    app.db().deleteINN(inn);
    app.db().deleteUserFromDB(email2);
  }

}