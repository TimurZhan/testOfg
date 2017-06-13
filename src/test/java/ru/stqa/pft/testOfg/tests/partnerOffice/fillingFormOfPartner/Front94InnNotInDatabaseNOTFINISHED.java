package ru.stqa.pft.testOfg.tests.partnerOffice.fillingFormOfPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-94:Регистрация партнера (анкеты партнера ИНН нет в БД)
public class Front94InnNotInDatabaseNOTFINISHED extends TestBase {

  @Test
  public void testInnNotInDatabase() throws InterruptedException {
    String email = "userofd12345@yopmail.com"; //После выполнения теста надо удалить из базы и зарегать заново, как партнера
    String password = "123";
    String inn = "545645645645";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().fillingCustomerFormInnNotBD(inn);
  }

}
