package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkingPersonalCabinet;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-68:Проверка вкладки "Отчеты"
public class Front68CheckingUploadTab extends TestBase {

  @Test
  public void testCheckingUploadTab() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().addCashRegister();
    app.getNavigationHelper().goToEditAndAssertUpload();
    app.getNavigationHelper().signOut();
  }

}
