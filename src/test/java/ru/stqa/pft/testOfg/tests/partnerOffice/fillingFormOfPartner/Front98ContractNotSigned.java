package ru.stqa.pft.testOfg.tests.partnerOffice.fillingFormOfPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-98:Партнер не подписал договор и вышел из кабинета
public class Front98ContractNotSigned extends TestBase {

  @Test
  public void testContractNotSigned() throws InterruptedException, SQLException {
    String email = "ofdru2@yopmail.com";
    String password = "123";
    String inn = "2130189551";
    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystemDemoSite(email, password);
    app.getNavigationHelper().checkContractNotSigned1(inn);
    app.getNavigationHelper().loginToSystemDemoSite(email, password);
    app.getNavigationHelper().checkContractAvailable();
    app.db().deleteINN(inn);
    app.db().deleteUserFromDB(email);
    app.db().addUserInDB(email);
  }

}
