package ru.stqa.pft.testOfg.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.testOfg.model.LegalAddressData;

public class CoincidenceLegalPostalAddressHelper extends HelperBase {

  public CoincidenceLegalPostalAddressHelper(WebDriver wd) {
    super(wd);
  }

  public void editCoincidenceLegalPostalAddress(LegalAddressData legalAddressData) {
    type1(By.xpath("//input[@name='PostalCode']"), legalAddressData.getIndex());
    type1(By.xpath("//input[@name='Locality']"), legalAddressData.getLocality());
    type1(By.xpath("//input[@name='Street']"), legalAddressData.getStreet());
    type1(By.xpath("//input[@name='House']"), legalAddressData.getHouse());
    type1(By.xpath("//input[@name='Block']"), legalAddressData.getBlock());
    type1(By.xpath("//input[@name='Flat']"), legalAddressData.getFlat());
    click(By.xpath("//input[@type='checkbox']"));
  }

}
