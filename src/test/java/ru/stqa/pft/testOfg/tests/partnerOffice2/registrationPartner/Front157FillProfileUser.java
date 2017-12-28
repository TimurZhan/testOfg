package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner;

import org.apache.http.client.fluent.Request;
import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-157:Заполнение данных профиля партнера и согласие с офертой
public class Front157FillProfileUser extends TestBase {

  @Test
  public void testFillProfileUser() throws InterruptedException, IOException, SQLException {
    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email = String.format(user + "@yopmail.com");
    String password = "123";
    String inn = "2465122693";
    System.out.println(email);

    app.getNavigationHelper().enterBecomePartner();
    app.getNavigationHelper().fillingRegFieldsNewPartner(email, password);
    String id = app.db().getIdUser(email);
    String code1 = app.db().getCodeUser(email);
    Request.Get("http://test.ofd.ru/api/Authorization/ConfirmRegistration?AccountId="+id+"&ConfirmCode="+code1).execute();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().fillingInUserForm();
    app.getNavigationHelper().signOutFromPK();
    app.db().deleteUserFromDB(email);
    app.db().deleteINN(inn);
  }




}
