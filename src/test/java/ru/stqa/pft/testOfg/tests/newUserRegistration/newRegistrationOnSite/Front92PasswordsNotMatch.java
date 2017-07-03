package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-92:Регистрация на сайте (пароли не совпадают)
public class Front92PasswordsNotMatch extends TestBase {

  @Test
  public void testCheckPasswordsNotMatch() throws InterruptedException, IOException, SQLException {
    String email = "ofdcachangepass@yopmail.com";
    String password1 = "123";
    String password2 = "321";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().replaceForgotPassword(email);
    app.getNavigationHelper().checkPasswordsNotMatch(email, password1, password2);
  }

}
