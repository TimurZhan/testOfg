package ru.stqa.pft.testOfg.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.testOfg.model.LegalAddressData;

import java.util.concurrent.TimeUnit;

public class LegalAddressHelper extends HelperBase {

  public LegalAddressHelper(WebDriver wd) {
    super(wd);
  }


  public void editLegalAddress(LegalAddressData legalAddressData) throws InterruptedException {
    type(By.xpath("//input[@name='PostalCode']"), legalAddressData.getIndex());
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/div/div"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//*[text()='Республика Крым']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/div/div"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//*[text()='Республика Тыва']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.xpath("//input[@name='Locality']"), legalAddressData.getLocality());
    type(By.xpath("//input[@name='Street']"), legalAddressData.getStreet());
    type(By.xpath("//input[@name='House']"), legalAddressData.getHouse());
    type(By.xpath("//input[@name='Block']"), legalAddressData.getBlock());
    type(By.xpath("//input[@name='Flat']"), legalAddressData.getFlat());
  }

}
