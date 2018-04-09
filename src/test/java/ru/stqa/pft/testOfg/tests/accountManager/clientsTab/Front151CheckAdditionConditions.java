package ru.stqa.pft.testOfg.tests.accountManager.clientsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-151:Добавление рамочных условий
public class Front151CheckAdditionConditions extends TestBase {

  @Test
  public void testAdditionConditions() throws InterruptedException, SQLException {
    String email = "yaschenko@ofd.ru";
    String password = "121288";
    String conNum = "503151";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkAdditionConditions(conNum);
    app.getNavigationHelper().removeConditions();
  }

}


