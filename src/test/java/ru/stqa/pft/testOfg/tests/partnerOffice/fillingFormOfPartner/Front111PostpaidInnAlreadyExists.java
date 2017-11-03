package ru.stqa.pft.testOfg.tests.partnerOffice.fillingFormOfPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-111:Регистрация партнера (анкета партнера постоплатник ЛК)
public class Front111PostpaidInnAlreadyExists extends TestBase {

  @Test
  public void testPostpaidInnAlreadyExists() throws InterruptedException {
    String email = "userofd1222@yopmail.com"; //После выполнения теста, этого юзера удалять НЕ надо.
    String password = "123";
    String inn = "6658399762";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkInnAlreadyExists(inn);
  }

}
