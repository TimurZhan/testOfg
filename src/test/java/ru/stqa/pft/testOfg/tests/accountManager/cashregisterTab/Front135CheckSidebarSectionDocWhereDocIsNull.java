package ru.stqa.pft.testOfg.tests.accountManager.cashregisterTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-135:Просмотреть документ (нет документа)
public class Front135CheckSidebarSectionDocWhereDocIsNull extends TestBase {

  @Test
  public void testSectionDocWhereDocIsNull() throws InterruptedException {
    app.getNavigationHelper().checkSectionDocWhereDocIsNull();
  }

}
