package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkingPersonalCabinet;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-65:Проверка формы регистрации нового клиента (Брать пользака для теста: getIdUser@binka.me пароль-12345)
public class Front65CheckingRegistrationForm extends TestBase {

  @Test
  public void testCheckingRegistrationForm() throws InterruptedException {
    String email = "user1499072034667@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkingItemsOnRegistrationPage();
  }

}