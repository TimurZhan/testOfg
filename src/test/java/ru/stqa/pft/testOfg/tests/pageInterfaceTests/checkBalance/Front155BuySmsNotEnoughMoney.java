package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkBalance;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-155:Покупка смс пакетов "типовым" клиентом с не достаточным для покупки балансом
public class Front155BuySmsNotEnoughMoney extends TestBase {

  @Test
  public void testBuySmsNotMoney() throws InterruptedException {
    String email = "disey1111@yopmail.com";
    String password = "123";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkBuySmsNotMoney();
    app.getNavigationHelper().signOut();
  }

}
