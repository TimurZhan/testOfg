package ru.stqa.pft.testOfg.tests.newUserRegistration.registrationOnNewsTab;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-145:Регистрация клиента "Вход в ЛК"
public class Front145RegistrClient extends TestBase {

  @Test
  public void testRegistOnNewsTab() throws InterruptedException {
    String email = "testofff@ofd.ru";
    String password = "123";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().registOnNewsTab(email, password);
  }


}
