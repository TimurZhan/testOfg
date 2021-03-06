package ru.stqa.pft.testOfg.tests.partnerOfficeDISABLED.fillingFormOfPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-46:Регистрация партнера (ЮР-лицо)
public class Front46RegistrationlegalEntity extends TestBase {

  @Test
  public void testlegalEntity() throws InterruptedException, SQLException {
    String email = "userofd12345@yopmail.com"; //После выполнения теста надо удалить из базы и зарегать заново
    String password = "123";
    String inn = "7801441024";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().testRegLegalEntity(inn);
    app.db().deleteUserFromDB(email);
    app.db().deleteINN(inn);
    app.db().addUserInDB(email);
  }

}
