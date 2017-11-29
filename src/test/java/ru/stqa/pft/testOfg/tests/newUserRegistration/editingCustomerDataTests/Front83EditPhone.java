package ru.stqa.pft.testOfg.tests.newUserRegistration.editingCustomerDataTests;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.model.PersonalInformationUserData;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-82:Редакция блока "Телефон"
public class Front83EditPhone extends TestBase {

  @Test
  public void testEditPhone() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";
    PersonalInformationUserData personalInformationUserData = new PersonalInformationUserData().withPhone("89021112255");
    PersonalInformationUserData personalInformationUserData2 = new PersonalInformationUserData().withPhone("89664441188");

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().goToProfileEdit();
    app.getNavigationHelper().goToEditPhone();
    app.getPhoneInformationHelper().editPhoneInformationHelper(personalInformationUserData);
    app.getNavigationHelper().submitPhone();
    app.getNavigationHelper().submitFront83();

    app.getNavigationHelper().goToEditPhone();
    app.getPhoneInformationHelper().editPhoneInformationHelper(personalInformationUserData2);
    app.getNavigationHelper().submitPhone();

    app.getNavigationHelper().signOut();
  }

}
