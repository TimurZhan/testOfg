package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkingPersonalCabinet;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-70:Проверка самой кассы
public class Front70CheckingCashMachinePage extends TestBase {

  @Test
  public void testCheckingCashMachinePage() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().clickCashMachinePage();
    app.getNavigationHelper().checkingCashMachinePage();
    app.getNavigationHelper().signOut();
  }

}
