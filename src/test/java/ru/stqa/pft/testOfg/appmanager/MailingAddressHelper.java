package ru.stqa.pft.testOfg.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.testOfg.model.MailingAddressData;

import java.util.concurrent.TimeUnit;

public class MailingAddressHelper extends HelperBase {

  public MailingAddressHelper(WebDriver wd) {
    super(wd);
  }

  public void editMailingAddressTest(MailingAddressData mailingAddressData) throws InterruptedException {
    type(By.xpath("//input[@name='PostPostalCode']"), mailingAddressData.getIndex());
    click(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[4]/div[1]/div[2]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='Республика Карелия']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[4]/div[1]/div[2]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='Республика Коми']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.xpath("//input[@name='PostLocality']"), mailingAddressData.getLocality());
    type(By.xpath("//input[@name='PostStreet']"), mailingAddressData.getStreet());
    type(By.xpath("//input[@name='PostHouse']"), mailingAddressData.getHouse());
    type(By.xpath("//input[@name='PostBlock']"), mailingAddressData.getBlock());
    type(By.xpath("//input[@name='PostFlat']"), mailingAddressData.getFlat());
  }

}
