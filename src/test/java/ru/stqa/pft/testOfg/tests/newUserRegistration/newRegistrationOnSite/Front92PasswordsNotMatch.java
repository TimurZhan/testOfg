package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-92:Регистрация на сайте (пароли не совпадают)
public class Front92PasswordsNotMatch extends TestBase {

  @Test
  public void testCheckPasswordsNotMatch() throws InterruptedException {
    long now = System.currentTimeMillis();
    String email = String.format("user%s@yopmail.com", now);
    String password = "123";
    System.out.println(email);
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().newCustomerRegistration(email, password);
    app.getNavigationHelper().checkPasswordsNotMatch(email, password);
  }

}
