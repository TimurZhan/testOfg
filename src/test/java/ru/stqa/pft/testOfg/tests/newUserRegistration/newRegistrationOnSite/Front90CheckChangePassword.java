package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;


// Front-90:Регистрация на сайте (смена пароля)
public class Front90CheckChangePassword extends TestBase {

  @Test
  public void testCheckChangePassword() throws InterruptedException {
    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email = String.format(user + "@yopmail.com");
    String password = "12345";
    System.out.println(email);
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().registrationUserToYopmail(user);
    app.getNavigationHelper().newCustomerRegistration2(email, password);
    app.getNavigationHelper().replaceForgotPassword(user, email, password);

  }

}
