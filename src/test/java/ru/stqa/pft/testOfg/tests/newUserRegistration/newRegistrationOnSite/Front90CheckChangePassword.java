package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;


// Front-90:Регистрация на сайте (смена пароля)
public class Front90CheckChangePassword extends TestBase {

  @Test
  public void testCheckChangePassword() throws InterruptedException, SQLException, IOException {
    long now = System.currentTimeMillis();
    String email = String.format("user%s@yopmail.com", now);
    String password1 = "123";
    String password2 = "321";
    System.out.println(email);

    app.getNavigationHelper().newCustomerRegistration(email, password1);
    app.db().sendGETRequestForRegConfirm(email);
    app.getNavigationHelper().confirmationRegistration(email, password1);
    app.getNavigationHelper().replaceForgotPassword1(email);
    app.db().sendPOSTRequestForChangePassword(email, password2);
    app.getNavigationHelper().confirmForgotPassword(email, password2);
  }



}
