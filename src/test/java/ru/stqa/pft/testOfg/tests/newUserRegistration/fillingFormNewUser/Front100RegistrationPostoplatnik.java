package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-100:Данные пользователя (постоплатник)
public class Front100RegistrationPostoplatnik extends TestBase {

  @Test
  public void testRegistrationPostoplatnik() throws InterruptedException, SQLException {
    String email = "ofdinnispres@yopmail.com";
    String password = "123";
    String inn = "7719778113";
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkRegistrationPostoplatnik(inn);

  }

}
