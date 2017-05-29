package ru.stqa.pft.testOfg.generators;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.thoughtworks.xstream.XStream;
import ru.stqa.pft.testOfg.model.LegalAddressData;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

//Генератор тестовых данных
public class LegalAddressDataGenerator {

  @Parameter(names = "-c", description = "LegalAddress count")
  public int count;

  @Parameter(names = "-f", description = "Target file")
  public String file;

  @Parameter(names = "-d", description = "Data format")
  public String format;

  public static void main(String[] args) throws IOException {
    LegalAddressDataGenerator generator = new LegalAddressDataGenerator();
    JCommander jCommander = new JCommander(generator);
    try {
      jCommander.parse(args);
    } catch (ParameterException ex){
      jCommander.usage();
      return;
    }
    generator.run();
  }

  private void run() throws IOException {
    List<LegalAddressData> legalAddress = generateLegalAddress(count);
    if (format.equals("csv")){
      saveAsCsv(legalAddress, new File(file));
    } else if(format.equals("xml")){
      saveAsXml(legalAddress, new File(file));
    } else {
      System.out.println("Unrecognized format " + format);
    }

  }

  private void saveAsXml(List<LegalAddressData> legalAddress, File file) throws IOException {
    XStream xStream = new XStream();
    xStream.processAnnotations(LegalAddressData.class);
    String xml = xStream.toXML(legalAddress);
    try(Writer writer = new FileWriter(file)) {
      writer.write(xml);
    }
  }

  private void saveAsCsv(List<LegalAddressData> legalAddress, File file) throws IOException {
    try (Writer writer = new FileWriter(file)){
      for (LegalAddressData legalAddressData : legalAddress) {
        writer.write(String.format("%s;%s;%s;%s;%s;%s;%s\n",
                legalAddressData.getIndex(),
                legalAddressData.getRegion(),
                legalAddressData.getLocality(),
                legalAddressData.getStreet(),
                legalAddressData.getHouse(),
                legalAddressData.getBlock(),
                legalAddressData.getFlat()
        ));
      }
    }
  }

  //Генератор тест данных для MailingAddress
  private List<LegalAddressData> generateLegalAddress(int count) {
    List<LegalAddressData> legalAddress = new ArrayList<>();
    for (int i = 0; i < count; i++){
      legalAddress.add(new LegalAddressData()
              .withIndex(String.format("420095"))
              .withRegion(String.format("Свердловская область"))
              .withLocality(String.format("Казань"))
              .withStreet(String.format("ул Восход"))
              .withHouse(String.format("5"))
              .withBlock(String.format("3"))
              .withFlat(String.format("7"))
      );
    }
    return legalAddress;
  }
}

