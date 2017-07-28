package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.awt.*;

//Front-22:Регистрация кассы с неверными параметрами (excel)
public class Front22DownloadCashFromFileInvalidPar1 extends TestBase {

  @Test
  public void testDownloadCashInvalidPar1() throws InterruptedException, AWTException {
    String email = "ofdtestpartner@yopmail.com";
    String password = "12345";
    String pathToFile = "C:/testOfg/src/test/resources/testCashRegisterInvalidPar.xlsx";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkDownloadCashInvalidPar1(pathToFile);
  }

}
