package ru.stqa.pft.testOfg.tests.partnerOffice.entranceToPartnerOffice;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-45:Вход в партнерский кабинет (не указываем пароль)
public class Front45EmptyPassword extends TestBase {

  @Test
  public void testEmptyPassword() throws InterruptedException {
    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().enterEmptyPassword();
  }

}