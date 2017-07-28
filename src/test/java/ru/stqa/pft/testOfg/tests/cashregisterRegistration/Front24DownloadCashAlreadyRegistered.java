package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.awt.*;

//Front-24:Регистрация касс,которые уже были зарегистрированы (excel)
public class Front24DownloadCashAlreadyRegistered extends TestBase {

  @Test
  public void testDownloadCashAlreadyRegistered() throws AWTException, InterruptedException {
    String email = "ofdtestpartner@yopmail.com";
    String password = "12345";
    String pathToFile = "C:/testOfg/src/test/resources/testCashAlreadyRegistered.xlsx";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkDownloadCashAlreadyRegistered(pathToFile);
  }

}
