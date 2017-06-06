package ru.stqa.pft.testOfg.tests.partnerOffice.entranceToPartnerOffice;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-93:Регистрация партнера на сайте (смена пароля)
public class Front93ChangePassword extends TestBase {

  @Test
  public void testChangePassword() throws InterruptedException {
    String email = "ofdtestpartner@yopmail.com";
    String user = "ofdtestpartner";
    String password = "12345";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().makePasswordChange(email);
    app.getNavigationHelper().passwordConfirmation(user, email, password);
  }

}
