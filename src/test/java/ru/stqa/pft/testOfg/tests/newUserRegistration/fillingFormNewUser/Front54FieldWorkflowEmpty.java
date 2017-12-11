package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-54:Регистрация клиента OFD.RU (не указан документооборот)
public class Front54FieldWorkflowEmpty extends TestBase {

  @Test
  public void testFieldWorkflowEmpty() throws InterruptedException {
    String email = "usercompany@yopmail.com";
    String password = "123";
    String inn = "2464114499";

    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().checkFieldWorkflowEmpty(inn);
  }

}
