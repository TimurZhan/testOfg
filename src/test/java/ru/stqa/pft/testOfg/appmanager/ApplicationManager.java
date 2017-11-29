package ru.stqa.pft.testOfg.appmanager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  private final Properties properties;
  WebDriver wd;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private LegalAddressHelper legalAddressHelper;
  private MailingAddressHelper mailingAddressHelper;
  private CoincidenceLegalPostalAddressHelper coincidenceLegalPostalAddressHelper;
  private ClearInputFieldsHelper clearInputFieldsHelper;
  private PersonalInformationHelper personalInformationHelper;
  private PhoneInformationHelper phoneInformationHelper;
  private String browser;
  private MailHelper mailHelper;
  private JamesHelper jamesHelper;
  private DbHelper dbHelper;

  public ApplicationManager(String browser) {
    this.browser = browser;
    properties = new Properties();
  }

  public void init() throws IOException, SQLException, InterruptedException {
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));

    dbHelper = new DbHelper();

    if (Objects.equals(browser, BrowserType.FIREFOX)){
      wd = new FirefoxDriver();
    } else if (Objects.equals(browser, BrowserType.CHROME)){
      wd = new ChromeDriver();
      wd.manage().window().maximize();
    } else if (Objects.equals(browser, BrowserType.OPERA_BLINK)){
      wd = new OperaDriver();
  }

    wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    wd.get(properties.getProperty("web.baseUrl"));
    legalAddressHelper = new LegalAddressHelper(wd);
    mailingAddressHelper = new MailingAddressHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    coincidenceLegalPostalAddressHelper = new CoincidenceLegalPostalAddressHelper(wd);
    personalInformationHelper = new PersonalInformationHelper(wd);
    phoneInformationHelper = new PhoneInformationHelper(wd);
    clearInputFieldsHelper = new ClearInputFieldsHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login(properties.getProperty("web.adminLogin"), properties.getProperty("web.adminPassword"));
  }

  public void stop() {
    wd.quit();
  }

  public LegalAddressHelper getLegalAddressHelper() {
    return legalAddressHelper;
  }

  public MailingAddressHelper getMailingAddressHelper(){
    return mailingAddressHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public CoincidenceLegalPostalAddressHelper getCoincidenceLegalPostalAddressHelper(){
    return coincidenceLegalPostalAddressHelper;
  }

  public ClearInputFieldsHelper getClearInputFieldsHelper(){
    return clearInputFieldsHelper;
  }

  public PersonalInformationHelper getPersonalInformationHelper(){
    return personalInformationHelper;
  }

  public PhoneInformationHelper getPhoneInformationHelper(){
    return phoneInformationHelper;
  }

  public MailHelper mail(){
    if(mailHelper == null){
      mailHelper = new MailHelper(this);
    }
    return mailHelper;
  }

  //Тут иницииализируется класс JamesHelper
  public JamesHelper james(){
    if (jamesHelper == null){
      jamesHelper = new JamesHelper(this);
    }
    return jamesHelper;
  }

  public String getProperty(String key) {
    return properties.getProperty(key);
  }

  public DbHelper db(){
    return dbHelper;
  }

  //Данный метод отвечает за создание скриншотов
  public byte[] takeScreenshot(){
    return ((TakesScreenshot) wd).getScreenshotAs(OutputType.BYTES);
  }

}
