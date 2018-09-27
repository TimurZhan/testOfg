package ru.stqa.pft.testOfg.tests.partnerOfficeDISABLED.entranceToPartnerOffice;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-44:Вход в партнерский кабинет (незарегистрированный пользователь)
public class Front44UnregisteredUser extends TestBase {

  @Test
  public void testUnregisteredUser() throws InterruptedException {
    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().enterUnregisteredUser();
  }

}
