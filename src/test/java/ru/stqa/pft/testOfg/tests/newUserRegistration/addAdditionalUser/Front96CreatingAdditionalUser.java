package ru.stqa.pft.testOfg.tests.newUserRegistration.addAdditionalUser;

import org.apache.http.client.fluent.Request;
import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-96:Создание "дополнительного пользователя"
public class Front96CreatingAdditionalUser extends TestBase {

  @Test(enabled = true)
  public void testCreatingUser() throws InterruptedException, SQLException, IOException {
    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email = String.format(user + "@yopmail.com");
    String email2 = "zhanchikov@ofd.ru";
    String password = "12345";
    System.out.println(email);

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email2, password);
    app.getNavigationHelper().addAdditionalUser(email);
    String id = app.db().getIdUser(email);
    String code1 = app.db().getCodeUser(email);
    Request.Get("http://test.ofd.ru/api/Authorization/ConfirmRegistration?AccountId="+id+"&ConfirmCode="+code1).execute();
    app.getNavigationHelper().checkUserConfirmation(email);
  }

}