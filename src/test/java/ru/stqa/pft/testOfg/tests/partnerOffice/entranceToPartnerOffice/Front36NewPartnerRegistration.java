package ru.stqa.pft.testOfg.tests.partnerOffice.entranceToPartnerOffice;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-36:Регистрация партнера
public class Front36NewPartnerRegistration extends TestBase {

  @Test
  public void testNewRegistration() throws InterruptedException {
    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email = String.format(user + "@yopmail.com");
    String password = "12345";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().enterBecomePartner();
    app.getNavigationHelper().fillingRegistrationFieldsNewPartner(email, password);
    app.getNavigationHelper().confirmationRegistrationMail(user);
    app.getNavigationHelper().confirmationRegistrationOnSite(email, password);
  }

}
