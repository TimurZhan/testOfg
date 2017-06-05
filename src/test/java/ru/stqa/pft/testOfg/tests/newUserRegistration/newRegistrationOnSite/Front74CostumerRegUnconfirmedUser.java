package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import javax.mail.MessagingException;
import java.io.IOException;

// Front-74:Регистрация клиента OFD.RU (неподтвержденный пользователь)
public class Front74CostumerRegUnconfirmedUser extends TestBase {

  @Test
  public void test2CustomerRegistration() throws IOException, MessagingException, InterruptedException {
    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email = String.format(user + "@yopmail.com");
    String password = "12345";
    System.out.println(email);
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().registrationUserToMailinator(user);
    app.getNavigationHelper().newCustomerRegistration2(email, password);
    app.getNavigationHelper().notConfirmEmailRegistration(user, email, password);
  }

}