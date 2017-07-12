package ru.stqa.pft.testOfg.tests.newUserRegistration.addAdditionalUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-104:Личный кабинет доп.пользователя (доступ к папкам с кассами)
public class Front104AccessToFolders extends TestBase {

  @Test
  public void testAccessToFolders() throws InterruptedException {
    String email = "ofdru007@yopmail.com";
    String password = "123";

    //app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkAccessToFolders();
  }

}
