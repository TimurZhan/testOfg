package ru.stqa.pft.testOfg.tests.partnerOffice.fillingFormOfPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-41:Регистрация партнера (анкета партнера)
public class Front41FormOfPartner extends TestBase {

  @Test
  public void testFormOfPartner() throws InterruptedException {
    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email = String.format(user + "@yopmail.com");
    String password = "12345";
    String inn = "6908009802";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().enterBecomePartner();
    app.getNavigationHelper().fillingRegistrationFieldsNewPartner(email, password);
    app.getNavigationHelper().confirmationRegistrationMail(user);
    app.getNavigationHelper().confirmationRegistrationOnSite(email, password);
    app.getNavigationHelper().fillingCustomerForm(inn);
  }

}
