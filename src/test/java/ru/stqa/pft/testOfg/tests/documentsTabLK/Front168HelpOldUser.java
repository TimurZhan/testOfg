package ru.stqa.pft.testOfg.tests.documentsTabLK;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-168:Новые подсказки в разделе документы (старый пользователь)
public class Front168HelpOldUser extends TestBase {

  @Test
  public void testHelpOldUser () throws InterruptedException, IOException, SQLException {
    String email = "yaschenko@ofd.ru";
    String password = "121288";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkHelpOldUser();
    app.getNavigationHelper().signOut();

  }

}
