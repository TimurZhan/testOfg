package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import javax.mail.MessagingException;
import java.io.IOException;

//Front-1:Регистрация клиента OFD.RU
public class Front1CostumerRegistrationTest extends TestBase {

  @Test
  public void test1CustomerRegistration() throws IOException, MessagingException, InterruptedException {
    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email = String.format(user + "@yopmail.com");
    String password = "12345";
    System.out.println(email);
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().registrationUserToMailinator(user);
    app.getNavigationHelper().newCustomerRegistration2(email, password);
    app.getNavigationHelper().confirmationRegistration(user, email, password);
  }

}
