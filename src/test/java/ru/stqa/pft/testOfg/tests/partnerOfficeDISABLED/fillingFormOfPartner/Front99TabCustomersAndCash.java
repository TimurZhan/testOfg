package ru.stqa.pft.testOfg.tests.partnerOfficeDISABLED.fillingFormOfPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-99:Партнер не подписал договор (доступна вкладка клиенты и кассы)
public class Front99TabCustomersAndCash extends TestBase{

  @Test
  public void testTabCustomersAndCash() throws SQLException, InterruptedException {
    String email = "ofdru2@yopmail.com";
    String password = "123";
    String inn = "7713443953";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkContractNotSigned2(inn);
    app.getNavigationHelper().checkTabCustomersAndCash();
    app.db().deleteINN(inn);
    app.db().deleteUserFromDB(email);
    app.db().addUserInDB(email);
  }

}
