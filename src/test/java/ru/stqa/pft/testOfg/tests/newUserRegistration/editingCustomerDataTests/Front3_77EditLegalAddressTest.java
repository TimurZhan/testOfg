package ru.stqa.pft.testOfg.tests.newUserRegistration.editingCustomerDataTests;

import com.thoughtworks.xstream.XStream;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.model.LegalAddressData;
import ru.stqa.pft.testOfg.tests.TestBase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

//Front-77:Редактирование юридического адреса
public class Front3_77EditLegalAddressTest extends TestBase {


  @DataProvider
  public Iterator<Object[]> validLegalAddress() throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/legalAddresses.xml")));
    String xml = "";
    String line = reader.readLine();
    while (line != null){
      xml += line;
      line = reader.readLine();
    }
    XStream xStream = new XStream();
    xStream.processAnnotations(LegalAddressData.class);
    List<LegalAddressData> legalAddressData = (List<LegalAddressData>) xStream.fromXML(xml);
    return legalAddressData.stream().map((g) -> new Object[] {g}).collect(Collectors.toList()).iterator();
  }

  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException {
    String email = "zhanchikov@ofd.ru";
    String password = "12345";

    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().goToProfileEdit();
    app.getNavigationHelper().goToEditLegalAddress();
  }

  @Test(dataProvider = "validLegalAddress")
  public void testEditLegalAddress(LegalAddressData legalAddress) throws InterruptedException {
    app.getLegalAddressHelper().editLegalAddress(legalAddress);
    app.getNavigationHelper().submit1();
    app.getNavigationHelper().submitFront77();
    app.getNavigationHelper().signOut();
  }

}