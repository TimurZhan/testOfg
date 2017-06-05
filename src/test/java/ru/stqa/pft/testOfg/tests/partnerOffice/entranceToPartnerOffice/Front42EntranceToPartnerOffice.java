package ru.stqa.pft.testOfg.tests.partnerOffice.entranceToPartnerOffice;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-42:Вход в партнерский кабинет
public class Front42EntranceToPartnerOffice extends TestBase{

  @Test
  public void testEntranceToPartnerOffice() throws InterruptedException {
    String email = "ofdtestpartner@yopmail.com";
    String password = "12345";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().entranceToPartnerOffice(email, password);
  }

}
