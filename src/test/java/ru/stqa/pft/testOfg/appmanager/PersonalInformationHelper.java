package ru.stqa.pft.testOfg.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.testOfg.model.PersonalInformationUserData;

public class PersonalInformationHelper extends HelperBase {

  public PersonalInformationHelper(WebDriver wd) {
    super(wd);
  }

  public void editPersonalInformation(PersonalInformationUserData personalInformationUserData){
    type1(By.name("fio"), personalInformationUserData.getfullname());
  }

}
