package ru.stqa.pft.testOfg.tests.partnerOffice.entranceToPartnerOffice;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-39:Регистрация партнера (пустое поле пароль)
public class Front39PartnerRegistrationEmptyPasswordField extends TestBase {

  @Test
  public void testEmptyPasswordField() throws InterruptedException {
    String email = "ofdtest451111@yopmail.com";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().enterBecomePartner();
    app.getNavigationHelper().fillingRegistrationFieldsEmptyPasswordField(email);
  }

}
