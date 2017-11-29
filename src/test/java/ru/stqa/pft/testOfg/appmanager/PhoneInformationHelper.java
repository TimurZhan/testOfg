package ru.stqa.pft.testOfg.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.testOfg.model.PersonalInformationUserData;

public class PhoneInformationHelper extends HelperBase {

  public PhoneInformationHelper(WebDriver wd) {
    super(wd);
  }

  public void editPhoneInformationHelper(PersonalInformationUserData personalInformationUserData){
    type1(By.name("phone"), personalInformationUserData.getPhone());
  }

}
