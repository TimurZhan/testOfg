package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.apache.http.client.fluent.Request;
import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import javax.mail.MessagingException;
import java.io.IOException;
import java.sql.SQLException;

// Front-74:Регистрация клиента OFD.RU (неподтвержденный пользователь)
public class Front74CostumerRegUnconfirmedUser extends TestBase {

  @Test
  public void test2CustomerRegistration() throws IOException, MessagingException, InterruptedException, SQLException {
    long now = System.currentTimeMillis();
    String email = String.format("user%s@yopmail.com", now);
    String password = "123";
    System.out.println(email);

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().newCustomerRegistration(email, password);
    app.getNavigationHelper().notConfirmEmailRegistration(email, password);
    String id = app.db().getIdUser(email);
    String code = app.db().getCodeUser(email);
    Request.Get("http://test.ofd.ru/api/Authorization/ConfirmRegistration?AccountId="+id+"&ConfirmCode="+code).execute();
    app.getNavigationHelper().confirmationRegistration(email, password);
  }

}