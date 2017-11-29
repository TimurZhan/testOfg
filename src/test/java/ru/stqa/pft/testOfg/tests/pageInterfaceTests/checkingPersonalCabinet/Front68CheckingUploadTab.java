package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkingPersonalCabinet;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-68:Проверка вкладки "Выгрузки"
public class Front68CheckingUploadTab extends TestBase {

  @Test
  public void testCheckingUploadTab() throws InterruptedException {
    String email = "testuserofd@yopmail.com";
    String password = "123";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().addCashRegister();
    app.getNavigationHelper().goToEditAndAssertUpload();
    app.getNavigationHelper().signOut();
  }

}
