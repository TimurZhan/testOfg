package ru.stqa.pft.testOfg.tests.partnerOffice2.registrationPartner.editingPartnerInfo;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.IOException;
import java.sql.SQLException;

//Front-173:Сотрудники
public class Front173Employees extends TestBase {

  @Test
  public void testProfile () throws InterruptedException, IOException, SQLException {
    String email1 = "zhanchikov@ofd.ru";
    String password = "12345";

    long now = System.currentTimeMillis();
    String user = String.format("user%s", now);
    String email2 = String.format(user + "@yopmail.com");
    System.out.println(email2);

    app.getNavigationHelper().loginToSystem(email1, password);
    app.getNavigationHelper().checkProfileEmployees(email2);
    app.getNavigationHelper().confirmRegEmployee(email2);
    app.getNavigationHelper().loginToSystem(email1, password);
    app.getNavigationHelper().deleteNewEmployee();
    app.getNavigationHelper().signOutFromPK();
  }

}
