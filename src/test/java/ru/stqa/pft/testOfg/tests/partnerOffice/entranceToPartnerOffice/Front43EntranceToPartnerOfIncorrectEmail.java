package ru.stqa.pft.testOfg.tests.partnerOffice.entranceToPartnerOffice;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-43:Вход в партнерский кабинет (некорректный e-mail)
public class Front43EntranceToPartnerOfIncorrectEmail extends TestBase {

  @Test
  public void testIncorrectEmail() throws InterruptedException {
    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().enterIncorrectEmail();
  }

}
