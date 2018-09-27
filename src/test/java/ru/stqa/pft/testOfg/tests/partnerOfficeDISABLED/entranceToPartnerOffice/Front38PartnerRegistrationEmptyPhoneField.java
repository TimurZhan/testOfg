package ru.stqa.pft.testOfg.tests.partnerOfficeDISABLED.entranceToPartnerOffice;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-38:Регистрация партнера (пустое поле номер телефона)
public class Front38PartnerRegistrationEmptyPhoneField extends TestBase{

  @Test
  public void testEmptyPhoneField() throws InterruptedException {
    String email = "ofdtest451111@yopmail.com";
    String password = "123";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().enterBecomePartner();
    app.getNavigationHelper().fillingRegistrationFieldsEmptyPhoneField(email, password);
  }

}
