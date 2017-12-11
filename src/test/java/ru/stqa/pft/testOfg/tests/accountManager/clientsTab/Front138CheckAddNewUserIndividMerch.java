package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-138:Добавление нового клиента (ИП)
public class Front138CheckAddNewUserIndividMerch extends TestBase {

  @Test
  public void testAddNewUserIndividMerch() throws InterruptedException, SQLException {
    String email1 = "zhanchikov@ofd.ru";
    String password = "12345";
    String email2 = "ofduser55667711711@yopmail.com";
    String inn = "503111739928";

    //app.getNavigationHelper().loginToSystem(email1, password);
    app.getNavigationHelper().checkAddNewUserIndividMerch(email2, inn);
    app.db().deleteINN(inn);
    app.db().deleteUserFromDB(email2);
  }

}
