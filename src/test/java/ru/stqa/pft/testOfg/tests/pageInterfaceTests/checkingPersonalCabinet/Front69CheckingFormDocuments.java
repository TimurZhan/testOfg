package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkingPersonalCabinet;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-69:Вкладка Документы
public class Front69CheckingFormDocuments extends TestBase {

  @Test
  public void testCheckingFormDocuments() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkingFormDocuments();
    app.getNavigationHelper().signOut();
  }

}
