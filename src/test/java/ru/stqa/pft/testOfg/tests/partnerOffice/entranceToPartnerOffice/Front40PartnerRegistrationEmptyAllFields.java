package ru.stqa.pft.testOfg.tests.partnerOffice.entranceToPartnerOffice;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-40:Регистрация партнера в OFD.RU (пустые значения)
public class Front40PartnerRegistrationEmptyAllFields extends TestBase {

  @Test
  public void testEmptyAllFields() throws InterruptedException {
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().enterBecomePartner();
    app.getNavigationHelper().fillingRegistrationFieldsEmptyAllFields();
  }

}
