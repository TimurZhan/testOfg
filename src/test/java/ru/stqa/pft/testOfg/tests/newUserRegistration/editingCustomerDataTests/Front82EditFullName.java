package ru.stqa.pft.testOfg.tests.newUserRegistration.editingCustomerDataTests;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.model.PersonalInformationUserData;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-82:Редакция блока "ФИО"
public class Front82EditFullName extends TestBase {

  @Test
  public void testEditFullName() throws InterruptedException {
    String email = "user1527069419291@yopmail.com";
    String password = "123";
    PersonalInformationUserData personalInformationUserData = new PersonalInformationUserData().withFullname("Иванов Птр Птрович");

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().goToProfileEdit();
    app.getNavigationHelper().goToEditFullName();
    app.getPersonalInformationHelper().editPersonalInformation(personalInformationUserData);
    app.getNavigationHelper().submitFullName();
    app.getNavigationHelper().submitFront82();
    app.getNavigationHelper().signOut();
  }

}
