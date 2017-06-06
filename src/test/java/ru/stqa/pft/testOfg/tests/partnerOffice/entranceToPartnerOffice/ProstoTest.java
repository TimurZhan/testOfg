package ru.stqa.pft.testOfg.tests.partnerOffice.entranceToPartnerOffice;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

public class ProstoTest extends TestBase {

  @Test
  public void prosto() throws InterruptedException {
    //String email = "partofd1@yopmail.com";
    //String password = "12345";
    String inn = "6908009802";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().loginIparol();
    app.getNavigationHelper().fillingCustomerForm(inn);
  }

}
