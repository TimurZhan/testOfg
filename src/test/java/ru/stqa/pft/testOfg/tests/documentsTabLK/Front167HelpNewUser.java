package ru.stqa.pft.testOfg.tests.documentsTabLK;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-167:Новые подсказки в разделе документы (новый пользователь)
public class Front167HelpNewUser extends TestBase {

  @Test
  public void testHelpNewUser () throws InterruptedException, IOException, SQLException {
    String email = "disey20173@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkHelpNewUser();
    app.getNavigationHelper().signOut();

  }

}
