package ru.stqa.pft.testOfg.tests.newUserRegistration.newRegistrationOnSite;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-5:Регистрация пользователя ( пустые значения поле номер телефона)
public class Front5PhoneEmptyFiled extends TestBase {

  @Test
  public void testEmailAlreadyRegistered() throws InterruptedException {
    app.getNavigationHelper().clickButtonConnect();
    app.getNavigationHelper().checkPhoneEmptyField();
  }

}
