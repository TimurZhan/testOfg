package ru.stqa.pft.testOfg.tests.partnerOffice.entranceToPartnerOffice;

import org.apache.http.client.fluent.Request;
import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-36:Регистрация партнера
public class Front36NewPartnerRegistration extends TestBase {

  @Test
  public void testNewRegistration() throws InterruptedException, IOException, SQLException {
    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email = String.format(user + "@yopmail.com");
    String password = "12345";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().enterBecomePartner();
    app.getNavigationHelper().fillingRegistrationFieldsNewPartner(email, password);
    //app.getNavigationHelper().confirmationRegistrationMail(user);
    String id = app.db().getIdUser(email);
    String code1 = app.db().getCodeUser(email);
    Request.Get("http://test.ofd.ru/api/Authorization/ConfirmRegistration?AccountId="+id+"&ConfirmCode="+code1).execute();
    app.getNavigationHelper().confirmationRegistrationOnSite(email, password);
  }

}
