package ru.stqa.pft.testOfg.tests.newUserRegistration.editingCustomerDataTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.model.LegalAddressData;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-80:Редактирование адреса (нет адреса)
public class Front80EditNoAddress extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().goToProfileEdit();
    app.getNavigationHelper().goToEditLegalAddress();
  }

  @Test
  public void testEditNoAddress() throws InterruptedException {
    app.getClearInputFieldsHelper().editClearInputFieldsHelper(new LegalAddressData().withIndex("17"));
    app.getNavigationHelper().checkAttribute();
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
