package ru.stqa.pft.testOfg.tests.partnerOfficeDISABLED.entranceToPartnerOffice;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-37:Регистрация партнера в OFD.RU (уже зарегистрированный)
public class Front37PartnerAlreadyRegistered extends TestBase {

  @Test
  public void testPartnerAlreadyRegistered() throws InterruptedException {
    String email = "ofdtest451111@yopmail.com";
    String password = "123";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().enterBecomePartner();
    app.getNavigationHelper().fillingRegistrationFieldsPartnerAlreadyExists(email, password);
  }

}
