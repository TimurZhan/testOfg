package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.awt.*;
import java.io.*;

//Front-15:Регистрация кассы excel- файл
public class Front15DownloadCashFromFileExcel extends TestBase {

  @Test
  public void testDownloadCashregister() throws InterruptedException, IOException, AWTException {
    String email = "ofdtestpartner@yopmail.com";
    String password = "12345";
    String pathToFile = "C:/testOfg/src/test/resources/testCashRegister.xlsx";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkDownloadCashregister(pathToFile);
  }

}