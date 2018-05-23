package ru.stqa.pft.testOfg.tests.newUserRegistration.editingCustomerDataTests;

import com.thoughtworks.xstream.XStream;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.model.MailingAddressData;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

//Front-78:Редактирование блок "Почтовый адрес"
public class Front2_78EditMailingAddressTest extends TestBase {

  @DataProvider
  public Iterator<Object[]> validMailingAddress() throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/mailingAddresses.xml")));
    String xml = "";
    String line = reader.readLine();
    while (line != null){
      xml += line;
      line = reader.readLine();
    }
    XStream xStream = new XStream();
    xStream.processAnnotations(MailingAddressData.class);
    List<MailingAddressData> mailingAddress = (List<MailingAddressData>) xStream.fromXML(xml);
    return mailingAddress.stream().map((g) -> new Object[] {g}).collect(Collectors.toList()).iterator();
  }

  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException {
    String email = "user1527069419291@yopmail.com";
    String password = "123";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().goToProfileEdit();
    app.getNavigationHelper().goToEditMailingAddress();
  }

  @Test(dataProvider = "validMailingAddress")
  public void testEditMailingAddress(MailingAddressData mailingAddressData) throws InterruptedException {
    app.getMailingAddressHelper().editMailingAddressTest(mailingAddressData);
    app.getNavigationHelper().submit1();
    app.getNavigationHelper().submitFront78();
    app.getNavigationHelper().signOut();
  }

}