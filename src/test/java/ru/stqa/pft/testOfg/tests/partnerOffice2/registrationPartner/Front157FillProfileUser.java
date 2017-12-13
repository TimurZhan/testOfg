package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-157:Заполнение данных профиля партнера и согласие с офертой
public class Front157FillProfileUser extends TestBase {

  @Test
  public void testFillProfileUser() throws InterruptedException, IOException, SQLException {
    String email = "user1513064996380@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().fillingInUserForm();

  }




}
