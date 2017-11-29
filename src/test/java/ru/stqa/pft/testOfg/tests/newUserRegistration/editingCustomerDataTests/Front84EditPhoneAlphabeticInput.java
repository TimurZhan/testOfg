package ru.stqa.pft.testOfg.tests.newUserRegistration.editingCustomerDataTests;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.model.PersonalInformationUserData;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-84:Редакция блок Телефон (неверные значения)
public class Front84EditPhoneAlphabeticInput extends TestBase {

  @Test
  public void testEditPhoneAlphabeticInput() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";
    PersonalInformationUserData personalInformationUserData = new PersonalInformationUserData().withPhone("89cbvbc02r1bvbcb1122b55");

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().goToProfileEdit();
    app.getNavigationHelper().goToEditPhone();
    app.getPhoneInformationHelper().editPhoneInformationHelper(personalInformationUserData);
    app.getNavigationHelper().submitPhone();
    app.getNavigationHelper().submitFront83();
    app.getNavigationHelper().signOut();
  }

}
