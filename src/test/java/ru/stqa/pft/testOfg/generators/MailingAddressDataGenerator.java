package ru.stqa.pft.testOfg.generators;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.thoughtworks.xstream.XStream;
import ru.stqa.pft.testOfg.model.MailingAddressData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

//Генератор тестовых данных
public class MailingAddressDataGenerator {

  @Parameter(names = "-c", description = "MailingAddress count")
  public int count;

  @Parameter(names = "-f", description = "Target file")
  public String file;

  @Parameter(names = "-d", description = "Data format")
  public String format;

  public static void main(String[] args) throws IOException {
    MailingAddressDataGenerator generator = new MailingAddressDataGenerator();
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
    List<MailingAddressData> mailingAddress = generateMailingAddress(count);
    if (format.equals("csv")){
      saveAsCsv(mailingAddress, new File(file));
    } else if(format.equals("xml")){
      saveAsXml(mailingAddress, new File(file));
    } else {
      System.out.println("Unrecognized format " + format);
    }

  }

  private void saveAsXml(List<MailingAddressData> mailingAddress, File file) throws IOException {
    XStream xStream = new XStream();
    xStream.processAnnotations(MailingAddressData.class);
    String xml = xStream.toXML(mailingAddress);
    try(Writer writer = new FileWriter(file)) {
      writer.write(xml);
    }
  }

  private void saveAsCsv(List<MailingAddressData> mailingAddreses, File file) throws IOException {
    try (Writer writer = new FileWriter(file)){
      for (MailingAddressData mailingAddress : mailingAddreses){
        writer.write(String.format("%s;%s;%s;%s;%s;%s;%s\n",
                mailingAddress.getIndex(),
                mailingAddress.getRegion(),
                mailingAddress.getLocality(),
                mailingAddress.getStreet(),
                mailingAddress.getHouse(),
                mailingAddress.getBlock(),
                mailingAddress.getFlat()
                ));
      }
    }
  }

  //Генератор тест данных для MailingAddress
  private List<MailingAddressData> generateMailingAddress(int count) {
    List<MailingAddressData> mailingAddress = new ArrayList<>();
    for (int i = 0; i < count; i++){
      mailingAddress.add(new MailingAddressData()
              .withIndex(String.format("140095"))
              .withRegion(String.format("Тульская область"))
              .withLocality(String.format("Тула"))
              .withStreet(String.format("ул Восход"))
              .withHouse(String.format("67"))
              .withBlock(String.format("1"))
              .withFlat(String.format("94"))
      );
    }
    return mailingAddress;
  }
}
