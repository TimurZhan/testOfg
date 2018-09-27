package ru.stqa.pft.testOfg.tests.partnerOfficeDISABLED.fillingFormOfPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-110:Регистрация партнера (анкета партнера постоплатник)
public class Front110PartnerRegistrationPostpaid extends TestBase {

  @Test
  public void testPostpaid() throws InterruptedException, SQLException {
    String email = "userofd12345@yopmail.com"; //После выполнения теста надо удалить из базы и зарегать заново
    String password = "123";
    String inn = "7744001497";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkRegistrationPostpaid(inn);
    app.db().deleteUserFromDB(email);
    app.db().deleteINN(inn);
    app.db().addUserInDB(email);
  }

}
