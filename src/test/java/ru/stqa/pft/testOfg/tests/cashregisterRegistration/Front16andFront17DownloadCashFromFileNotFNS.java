package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.awt.*;
import java.io.IOException;

//Front-16:Регистрация кассы excel- файл без фнс
public class Front16andFront17DownloadCashFromFileNotFNS extends TestBase {

  @Test
  public void testDownloadCashregisterNotFNS() throws InterruptedException, IOException, AWTException {
    String email = "ofdtestpartner@yopmail.com";
    String password = "12345";
    String pathToFile = "C:/testOfg/src/test/resources/testCashRegister.xlsx";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkDownloadCashregisterNotFNS(pathToFile);
}

}
