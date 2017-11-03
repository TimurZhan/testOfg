package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-138:Добавление нового клиента (ИП)
public class Front138CheckAddNewUserIndividMerch extends TestBase {

  @Test
  public void testAddNewUserIndividMerch() throws InterruptedException, SQLException {
    String email = "ofduser3556677@yopmail.com";
    String inn = "503111739928";

    app.getNavigationHelper().checkAddNewUserIndividMerch(email, inn);
    app.db().deleteINN(inn);
    app.db().deleteUserFromDB(email);
  }

}
