package ru.stqa.pft.testOfg.tests.newUserRegistration.addAdditionalUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-101:Доп.пользователь без доступов к папкам
public class Front101RemoveAccessFolders extends TestBase {

  @Test
  public void testRemoveAccessFolders() throws InterruptedException {
    app.getNavigationHelper().checkRemoveAccess();
  }

}
