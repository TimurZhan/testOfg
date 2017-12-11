package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-152:Регистрация клиента OFD.RU (нет согласия с офертой)
public class Front152NoAgreementOffer extends TestBase {

  @Test
  public void testNoAgreementOffer() throws InterruptedException {
    String email = "ofdinnispres@yopmail.com";
    String password = "123";
    String inn = "1215114521";

    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkNoAgreementOffer(inn);
  }

}
