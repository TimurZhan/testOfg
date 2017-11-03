package ru.stqa.pft.testOfg.tests.partnerOffice.fillingFormOfPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-95:Регистрация партнера (ИНН некорректная длина)
public class Front95CheckIncorrectINN extends TestBase {

  @Test
  public void testIncorrectINN() throws InterruptedException, SQLException {
    String email = "ofdru@yopmail.com";
    String password = "123";
    String inn = "75360434255";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().testIncorrectINNFront95(inn);
  }

}
