package ru.stqa.pft.testOfg.tests.partnerOffice.fillingFormOfPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-94:Регистрация партнера (анкеты партнера ИНН нет в БД)
public class Front94InnNotInDatabase extends TestBase {

  @Test(enabled = true)
  public void testInnNotInDatabase() throws InterruptedException, SQLException {
    String email = "userofd12345@yopmail.com"; //После выполнения теста надо удалить из базы и зарегать заново, как партнера
    String password = "123";
    String inn = "545645645645";
    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().fillingCustomerFormInnNotBD(inn);
    app.db().deleteINN(inn);
    app.db().deleteUserFromDB(email);
    app.db().addUserInDB(email);
  }

}
