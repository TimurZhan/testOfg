package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkingPersonalCabinet;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-67:Проверка перехода по вкладкам из личного кабинета
public class Front67TabNavigationPersonalArea extends TestBase {

  @Test
  public void testTabNavigationPersonalArea() throws InterruptedException {
    String email = "testuserofd@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().addCashRegister();
    app.getNavigationHelper().tabNavigation();
    app.getNavigationHelper().signOut();
  }
}
