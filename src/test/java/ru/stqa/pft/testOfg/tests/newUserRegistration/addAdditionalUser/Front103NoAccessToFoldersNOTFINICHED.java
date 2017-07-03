package ru.stqa.pft.testOfg.tests.newUserRegistration.addAdditionalUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-103:Вход в личный кабинет доп.пользователя (нет доступа к папкам)
public class Front103NoAccessToFoldersNOTFINICHED extends TestBase {

  @Test
  public void testNoAccessToFolders() throws InterruptedException {
    String email = "ofdru007@yopmail.com";
    String password = "123";
    app.getNavigationHelper().checkNoAccessToFolders();
  }

}
