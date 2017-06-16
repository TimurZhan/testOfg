package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.apache.http.client.fluent.Request;
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
    String password = "123";
    System.out.println(email);
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().newCustomerRegistration(email, password);
    String id = app.db().getIdUser(email);
    String code1 = app.db().getCodeUser(email);
    Request.Get("http://test.ofd.ru/api/Authorization/ConfirmRegistration?AccountId="+id+"&ConfirmCode="+code1).execute();
    app.getNavigationHelper().confirmationRegistration(email, password);
    app.getNavigationHelper().replaceForgotPassword(email);
    String emailUser = app.db().getEmailUser(email);
    String code2 = app.db().getCodeUser(email);
    Request.Post("https://dev.ofd.ru/api/userAccounts/ChangePassword?Email="+emailUser+"&ConfirmationCode="+code2+"&NewPassword=321").execute();
    //Request.Post("http://test.ofd.ru/api/userAccounts/forceChangePassword?Email="+emailUser+"&NewPassword=321").execute();
    app.getNavigationHelper().confirmForgotPassword(email);
  }

}
