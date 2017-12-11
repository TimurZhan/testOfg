package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkBalance;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-154:Покупка смс пакетов "типовым" клиентом с достаточным для покупки балансом
public class Front154BuySmsEnoughMoney extends TestBase {

  @Test
  public void testBuySmsEnoughMoney() throws InterruptedException {
    String email = "disey1111@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkBuySmsEnoughMoney();
    app.getNavigationHelper().signOut();
  }

}
