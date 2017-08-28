package ru.stqa.pft.testOfg.tests.newUserRegistration.fillingFormNewUser;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.sql.SQLException;

//Front-2:Регистрация ЮР -лица в OFD.RU и Front-30:Регистрация ЮР -лица в OFD.RU (адрес юр.лица)
public class Front2andFront30_RegistrationLegalEntity extends TestBase{

  @Test
  public void testRegistrationLegalEntity() throws InterruptedException, SQLException {
    String email = "ofd222111@yopmail.com";
    String password = "123";
    String inn ="6685133850";

    //app.getNavigationHelper().signOut(); //Включить, при отладке и запуске в случае отдельного пуска теста
    app.getNavigationHelper().loginAccount();
    app.getNavigationHelper().checkForFields(email, password);
    app.getNavigationHelper().enterValuesInputFieldsLegalEntity(inn);
    app.getNavigationHelper().signOut();
    app.db().deleteINN(inn);
    app.db().addUserInDB(email);
  }

}
