package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-135:Просмотреть документ (нет документа)
public class Front135CheckSidebarSectionDocWhereDocIsNull extends TestBase {

  @Test
  public void testSectionDocWhereDocIsNull() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkSectionDocWhereDocIsNull();
  }

}
