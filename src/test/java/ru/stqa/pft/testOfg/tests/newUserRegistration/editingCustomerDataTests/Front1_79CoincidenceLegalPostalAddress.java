package ru.stqa.pft.testOfg.tests.newUserRegistration.editingCustomerDataTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.model.LegalAddressData;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-79:Редактирование блока адрес (почта и юр адрес совпадают)
public class Front1_79CoincidenceLegalPostalAddress extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException {
    String email = "user1527069419291@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().goToProfileEdit();
    app.getNavigationHelper().goToEditLegalAddress();
  }

  @Test
  public void testCoincidenceLegalPostalAddress() throws InterruptedException {
    app.getCoincidenceLegalPostalAddressHelper().editCoincidenceLegalPostalAddress(new LegalAddressData()
            .withIndex("170005")
            .withLocality("Бежецк")
            .withStreet("школьная")
            .withHouse("85")
            .withBlock("1")
            .withFlat("1")
    );
    app.getNavigationHelper().submit1();
    app.getNavigationHelper().submitFront79();
    app.getNavigationHelper().signOut();
  }

}