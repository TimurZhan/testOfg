package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-92:Регистрация на сайте (пароли не совпадают)
public class Front92PasswordsNotMatch extends TestBase {

  @Test
  public void testCheckPasswordsNotMatch() throws InterruptedException {

    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email = String.format(user + "@yopmail.com");
    String password = "12345";
    System.out.println(email);
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().registrationUserToMailinator(user);
    app.getNavigationHelper().newCustomerRegistration2(email, password);
    app.getNavigationHelper().checkPasswordsNotMatch(user, email, password);
  }

}
