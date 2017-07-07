package ru.stqa.pft.testOfg.tests.partnerOffice.fillingFormOfPartner;

import org.apache.http.client.fluent.Request;
import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

// Front-41:Регистрация партнера (анкета партнера)
public class Front41FormOfPartner extends TestBase {

  @Test
  public void testFormOfPartner() throws InterruptedException, IOException, SQLException {
    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email = String.format(user + "@yopmail.com");
    String password = "123";
    String inn = "7723900990";
    System.out.println(email);

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().enterBecomePartner();
    app.getNavigationHelper().fillingRegistrationFieldsNewPartner(email, password);
    String id = app.db().getIdUser(email);
    String code1 = app.db().getCodeUser(email);
    Request.Get("http://test.ofd.ru/api/Authorization/ConfirmRegistration?AccountId="+id+"&ConfirmCode="+code1).execute();
    app.getNavigationHelper().confirmationRegistrationOnSite2(email, password);
    app.getNavigationHelper().fillingCustomerForm(inn);
    app.db().deleteINN(inn);
  }

}
