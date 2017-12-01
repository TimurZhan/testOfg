package ru.stqa.pft.testOfg.tests.newUserRegistration.editingCustomerDataTests;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-85:Редактирование других полей в карточке
public class Front85EditWorkflow extends TestBase {

  @Test
  public void testEditWorkflow() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    //app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().goToProfileEdit();
    app.getNavigationHelper().selectWorkflow();
    app.getNavigationHelper().clickVAT();
    app.getNavigationHelper().signOut();
  }

}
