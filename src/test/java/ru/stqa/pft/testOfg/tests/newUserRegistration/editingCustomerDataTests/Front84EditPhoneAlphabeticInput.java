package ru.stqa.pft.testOfg.tests.newUserRegistration.editingCustomerDataTests;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.model.PersonalInformationUserData;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-84:Редакция блок Телефон (неверные значения)
public class Front84EditPhoneAlphabeticInput extends TestBase {

  @Test
  public void testEditPhoneAlphabeticInput() throws InterruptedException {
    String email = "user1527069419291@yopmail.com";
    String password = "123";
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
