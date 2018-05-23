package ru.stqa.pft.testOfg.tests.newUserRegistration.addAdditionalUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-101:Доп.пользователь без доступов к папкам
public class Front101RemoveAccessFolders extends TestBase {

  @Test
  public void testRemoveAccessFolders() throws InterruptedException {
    String email = "user1527069419291@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkRemoveAccess();
  }

}
