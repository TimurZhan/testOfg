package ru.stqa.pft.testOfg.tests.newUserRegistration.editingCustomerDataTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.model.LegalAddressData;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.util.concurrent.TimeUnit;

//Front-81:Редактирование адреса (не заполнено обязательное поле)
public class Front81NotFilledZipcode extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException {
    String email = "user1527069419291@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().goToProfileEdit();
    app.getNavigationHelper().goToEditLegalAddress();
  }

  @Test
  public void testNotFilledZipcode() throws InterruptedException {
    app.getClearInputFieldsHelper().editClearInputFieldsHelper(new LegalAddressData().withIndex("17"));
    TimeUnit.SECONDS.sleep(2);
    app.getNavigationHelper().checkAttribute();
    app.getNavigationHelper().signOut();
  }

}
