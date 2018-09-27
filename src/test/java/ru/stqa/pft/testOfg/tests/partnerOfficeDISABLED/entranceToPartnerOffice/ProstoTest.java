package ru.stqa.pft.testOfg.tests.partnerOfficeDISABLED.entranceToPartnerOffice;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//Front-15:Регистрация кассы excel- файл
public class ProstoTest extends TestBase {

  @Test(enabled = false)
  public void testCashregisterrr() throws InterruptedException, IOException {

    File cashregister = new File("src/test/resources/testCashRegister.xlsx");
    FileInputStream excelFile = new FileInputStream(cashregister);
    XSSFWorkbook workBook = new XSSFWorkbook(excelFile);
    XSSFSheet sheet1 = workBook.getSheetAt(0);
    String cashNumber = sheet1.getRow(0).getCell(2).getStringCellValue();
    System.out.println(cashNumber);
  }

}
