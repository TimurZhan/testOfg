package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-100:Данные пользователя (постоплатник)
public class Front100RegistrationPostoplatnik extends TestBase {

  @Test
  public void testRegistrationPostoplatnik() throws InterruptedException {
    String email = "userofd2@yopmail.com";
    String password = "12345";
    String inn = "7744001497";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkRegistrationPostoplatnik(inn);
  }

}
