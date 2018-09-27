package ru.stqa.pft.testOfg.tests.partnerOfficeDISABLED.fillingFormOfPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-47:Проверка договора партнера с OFD.RU
public class Front47VerificationSignature extends TestBase {

  @Test
  public void testVerificationSignature() throws InterruptedException, SQLException {
    String email = "userofd12345@yopmail.com"; //После выполнения теста надо удалить из базы и зарегать заново
    String password = "123";
    String inn = "7801441024";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkVerificationSignature(inn);
    app.db().deleteUserFromDB(email);
    app.db().deleteINN(inn);
    app.db().addUserInDB(email);
  }

}
