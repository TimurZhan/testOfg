package ru.stqa.pft.testOfg.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  //Для черновой проверки тестов
  public void loginIparol() {
    type(By.xpath("//input[@name='Login']"), "partofd1@yopmail.com");
    type(By.xpath("//input[@name='Password']"), "12345");
    click(By.xpath("//button[@type='submit']"));
  }

  public void exitLK() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/div/a"));
  }

  public void goToEditMailingAddress() {
    click(By.xpath("//p[@class='font-size-14 color-info-light']/a[@class='link color-info-light']"));
  }

  public void goToEditFullName() {
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/p[2]/a"));
  }

  public void goToEditPhone() {
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/p[2]/a"));
  }

  public void goToEditLegalAddress() throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/p[2]/a"));
  }

  public void goToProfileEdit() throws InterruptedException {
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.xpath("//a[@href='/lk/profile']"));
  }

  public void submit1() {
    scrollToItem(By.xpath("//button[@type='submit']"));
    click(By.xpath("//button[@type='submit']"));
  }

  public void submitFullName() {
    click(By.xpath("//div[@class='profile__inline']/button[@type='submit']"));
  }

  public void submitPhone() {
    click(By.xpath("//div[@class='profile__inline']/button[@type='submit']"));
  }

  public void submitFront79() throws InterruptedException {
    TimeUnit.SECONDS.sleep(4);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/p[1]")).getText(),
            equalTo("170005, Бежецк, школьная, 85, корп/стр: 1, офис/кв: 1"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[2]/p[1]")).getText(),
            equalTo("170005, Бежецк, школьная, 85, корп/стр: 1, офис/кв: 1"));
  }

  public void submitFront77() {
    waitTheElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/p[1]"), "420095, Казань, ул Восход, 5, корп/стр: 3, офис/кв: 7");
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/p[1]")).getText(),
            equalTo("420095, Казань, ул Восход, 5, корп/стр: 3, офис/кв: 7"));
  }

  public void submitFront78() {

    waitTheElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[2]/p[1]"), "140095, Тула, ул Восход, 67, корп/стр: 1, офис/кв: 94");
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[2]/p[1]")).getText(),
            equalTo("140095, Тула, ул Восход, 67, корп/стр: 1, офис/кв: 94"));
  }

  public void submitFront82() throws InterruptedException {
    assertThat(wd.findElement(By.xpath("//div[@class='profile__col']/div/h2[@class='font-size-20 text text_title-h2 color-info']")).getText(),
            equalTo("Иванов Птр Птрович"));
  }

  public void submitFront83() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/h2")).getText(),
            equalTo("89021112255"));
  }

  public void signOut() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
    //wd.navigate().refresh();
  }

  public void signOutFromPK() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.linkText("Выход"));
    TimeUnit.SECONDS.sleep(2);
    //wd.navigate().refresh();
  }

  public void clickButtonConnect() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    //click(By.xpath("//div[@id='Modal-user-lk']//div[@class='close']"));
    //TimeUnit.SECONDS.sleep(2);
    click(By.cssSelector("div.middletext button.connect-button"));
  }

  public void selectWorkflow() throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div/div[1]/div/div"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//*[text()='Диадок']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div/div[1]/div/div/div[1]/div[1]/div[2]")).getText(),
            equalTo("Диадок"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div/div[1]/div/div"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void clickVAT() {

    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div/div[2]/div/div[1]/div"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div/div[2]/div/div[1]/div")).getCssValue("background-color"),
            equalTo("rgba(0, 190, 106, 1)"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div")).getCssValue("background-color"),
            equalTo("rgba(0, 190, 106, 1)"));
  }

  public void clickAddedCashMachine() {
    click(By.cssSelector("div.navbar-item a.btn-primary"));
  }

  public void clickMainLabel() throws InterruptedException {
    click(By.xpath("//a[@class='btn btn-border-fade pull-right']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkingFormDocuments() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.xpath("//a[@href='/lk/documents']"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='fw-col fw-col-11 ']/div[3]/span")).getText(),
            equalTo("Заключен от 24.05.2017"));
  }

  public void addCashRegister() {
    click(By.xpath("//a[@href='/lk/downloads']"));
  }

  public void clickCashMachinePage() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='font-size-14 font-weight-500']/a"));
  }

  public void checkingCashMachinePage() {
    assertThat(wd.findElement(By.cssSelector("div.fw-card-body h2.font-size-24")).getText(), equalTo("Договор с OFD.RU"));
    scrollToItem(By.xpath("//div[@class='fw-card-body']/h3"));
    assertThat(wd.findElement(By.xpath("//div[3]/div[@class='fw-card-body']/h3")).getText(), equalTo("Касса"));
    assertThat(wd.findElement(By.xpath("//div[3]/div[@class='fw-card-body']/div/div[1]/div[2]/div[1]")).getText(),
            equalTo("Заводской номер кассы"));
    assertThat(wd.findElement(By.xpath("//div[3]/div[@class='fw-card-body']/div/div[1]/div[3]/div[1]")).getText(),
            equalTo("Регистрационный номер кассы (РНМ)"));
    assertThat(wd.findElement(By.xpath("//div[3]/div[@class='fw-card-body']/div/div[1]/div[5]/div[1]")).getText(),
            equalTo("Заводской номер фискального накопителя"));
  }

  public void checkingCashRegister() {
    Assert.assertTrue(isElementPresent(By.xpath("//input[@maxlength='20']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@maxlength='16']")));
    Assert.assertTrue(isElementPresent(By.cssSelector("div.margin-bottom-25 i.vertical-align-middle")));
    Assert.assertTrue(isElementPresent(By.cssSelector("div.ofd-uploader__tpl a.ofd-button_sky")));
    Assert.assertTrue(isElementPresent(By.cssSelector("div.ofd-uploader__upload button.fw-btn-info-light")));
    Assert.assertTrue(isElementPresent(By.cssSelector("div.fw-col_40 button.fw-btn-primary")));
  }

  public void checkingItemsOnRegistrationPage() throws InterruptedException {
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Inn']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Employee']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Name']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Kpp']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Ogrn']")));
    Assert.assertTrue(isElementPresent(By.className("input-group")));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[1]/p/span"));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='PostalCode']")));
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='ofd-select']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Settlement']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Street']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='HouseNumber']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Building']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Office']")));
    scrollToItem(By.xpath("//a[@class='logo']"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void tabNavigation() throws InterruptedException {
    assertThat(wd.findElement(By.xpath("//div[@class='fw-card-body']/div/div[1]/div/h4")).getText(),
            equalTo("Отчет по сменам"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.xpath("//a[@href='/lk/documents']"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//span[@class='vertical-align-middle color-info']/span")).getText(),
            equalTo("Ваши закрывающие документы"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.xpath("//a[@href='/lk/users']"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/p/button/div/span")).getText(),
            equalTo("Добавить пользователя"));
    assertThat(wd.findElement(By.xpath("//div[@class='fd-text fd-text_xs fd-text_upper']")).getText(),
            equalTo("ФИО"));
  }

  public void goToEditAndAssertUpload() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@class='container margin-top-15']/div[2]/h3")).getText(),
            equalTo("Отчёты"));
    assertThat(wd.findElement(By.xpath("//div[@class='fw-card-body']/div/div[1]/div/h4")).getText(),
            equalTo("Отчет по сменам"));
    assertThat(wd.findElement(By.xpath("//div[@class='fw-card-body']/div/div[2]/div/h4")).getText(),
            equalTo("Сверка"));
    assertThat(wd.findElement(By.xpath("//div[@class='fw-card-body']/div/div[3]/div/h4")).getText(),
            equalTo("Мониторинг"));
    assertThat(wd.findElement(By.xpath("//div[@class='fw-card-body']/div/div[4]/div/h4")).getText(),
            equalTo("Статистика отправки чеков по sms и e-mail"));
    assertThat(wd.findElement(By.xpath("//div[@class='fw-card-body']/div/div[5]/div/h4")).getText(),
            equalTo("Аренда"));
    assertThat(wd.findElement(By.xpath("//div[@class='fw-card-body']/div/div[6]/h4")).getText(),
            equalTo("Создать шаблон отчёта"));
    assertThat(wd.findElement(By.xpath("//div[@class='container margin-top-15']/div[2]/div[2]/h3")).getText(),
            equalTo("Мои шаблоны"));
    click(By.xpath("//div[@class='fw-cols fw-cols-2']/div[2]/button[2]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='fd-table__header']/div/div[1]/div/div[1]/div/span")).getText(),
            equalTo("ДАТА"));
    assertThat(wd.findElement(By.xpath("//div[@class='fd-table__header']/div/div[1]/div/div[2]/div")).getText(),
            equalTo("ТИП ОТЧЕТА"));
    assertThat(wd.findElement(By.xpath("//div[@class='fd-table__header']/div/div[2]/div/div[1]/div")).getText(),
            equalTo("РАЗМЕР ФАЙЛА"));
    assertThat(wd.findElement(By.xpath("//div[@class='fd-table__header']/div/div[2]/div/div[2]/div")).getText(),
            equalTo("ПЕРИОД"));
    assertThat(wd.findElement(By.xpath("//div[@class='fd-table__header']/div/div[3]/div")).getText(),
            equalTo("СКАЧАТЬ ДО"));
  }

  public void checkingTabsMainPage() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    //click(By.xpath("//div[@id='jivo_close_button']"));
    click(By.xpath("//a[@class='btn btn-border-fade pull-right']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.cssSelector("button.connect-button div.fw-btn-content")).getText(), equalTo("Подключить OFD.RU"));
    click(By.linkText("Проверить чек"));
    Assert.assertTrue(isElementVisible(By.name("Fn")));
    Assert.assertTrue(isElementVisible(By.name("Kkt")));
    Assert.assertTrue(isElementVisible(By.name("Inn")));
    Assert.assertTrue(isElementVisible(By.name("Num")));
    Assert.assertTrue(isElementVisible(By.name("Sign")));
    assertThat(wd.findElement(By.xpath("//button[@type='submit']")).getText(), equalTo("НАЙТИ ЧЕК"));
    click(By.xpath("//a[@class='logo']"));
  }

  public void clickTabsMainPage() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@id='jivo_close_button']"));
    click(By.xpath("//a[@class='btn btn-border-fade pull-right']"));
    TimeUnit.SECONDS.sleep(1);
    Assert.assertTrue(isElementVisible(By.linkText("Проверить чек")));
    Assert.assertTrue(isElementVisible(By.linkText("Партнёрам")));
    Assert.assertTrue(isElementVisible(By.linkText("О компании")));
    Assert.assertTrue(isElementVisible(By.linkText("Новости")));
    Assert.assertTrue(isElementVisible(By.linkText("Ввести код активации или промокод")));
    Assert.assertTrue(isElementVisible(By.linkText("Пресс-центр")));
    Assert.assertTrue(isElementVisible(By.linkText("Разработчикам")));
    Assert.assertTrue(isElementVisible(By.linkText("Помощь")));
    Assert.assertTrue(isElementVisible(By.linkText("База знаний")));
    assertThat(wd.findElement(By.xpath("//nav[@class='text-left toggled']/div[4]/a")).getText(),
            equalTo("ЛИЧНЫЙ КАБИНЕТ"));
    assertThat(wd.findElement(By.xpath("//nav[@class='text-left toggled']/div[4]/button/div")).getText(),
            equalTo("Подключить OFD.RU"));

    click(By.linkText("Партнёрам"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='section__header text-left']/h1")).getText(),
            equalTo("Партнерам ОФД – подключиться просто, зарабатывать легко!"));
    click(By.xpath("//a[@class='btn btn-border-fade pull-right']"));
    TimeUnit.SECONDS.sleep(1);

    click(By.linkText("О компании"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='table-col']/h4")).getText(),
            equalTo("Карточка компании"));
    click(By.xpath("//a[@class='btn btn-border-fade pull-right']"));
    TimeUnit.SECONDS.sleep(1);

    click(By.linkText("Новости"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='section__header text-center']/h1")).getText(),
            equalTo("Новости OFD.RU"));
    click(By.xpath("//a[@class='btn btn-border-fade pull-right']"));
    TimeUnit.SECONDS.sleep(1);

    click(By.linkText("Пресс-центр"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='section__header']/h2")).getText(),
            equalTo("Уважаемые журналисты!"));
    click(By.xpath("//a[@class='btn btn-border-fade pull-right']"));
    TimeUnit.SECONDS.sleep(1);

    click(By.linkText("Разработчикам"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='section']/div[3]/h1")).getText(),
            equalTo("API для сверки с оператором фискальных данных OFD.RU"));
    click(By.xpath("//a[@class='btn btn-border-fade pull-right']"));
    TimeUnit.SECONDS.sleep(1);

    click(By.linkText("Помощь"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='container']/h1")).getText(),
            equalTo("Вопросы и ответы"));
    click(By.xpath("//a[@class='btn btn-border-fade pull-right']"));
    TimeUnit.SECONDS.sleep(1);

    click(By.linkText("База знаний"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='container']/h1")).getText(),
            equalTo("База знаний OFD.RU"));

    click(By.xpath("//a[@class='logo']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkDevelopersPage() throws InterruptedException {
    click(By.linkText("Разработчикам"));
    click(By.xpath("//a[@href='#v3-direct-link']"));
    click(By.xpath("//a[@href='#v3-info']"));
    scrollToItem(By.cssSelector("div.developers__content span.developers__label"));
    click(By.xpath("//a[@class='logo']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkInformationPage() throws InterruptedException {
    click(By.linkText("Пресс-центр"));
    Assert.assertTrue(isElementVisible(By.xpath("//div[@class='text-press_left']")));
    Assert.assertTrue(isElementVisible(By.xpath("//div[@class='press_contact']")));
    click(By.xpath("//a[@class='logo']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkInformationCompany() throws InterruptedException {
    click(By.linkText("О компании"));
    Assert.assertTrue(isElementVisible(By.id("about")));
    assertThat(wd.findElement(By.xpath("//div[@class='table-col']/h4")).getText(),
            equalTo("Карточка компании"));
    click(By.xpath("//a[@class='logo']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkPartnersPage() throws InterruptedException {
    click(By.linkText("Партнёрам"));
    assertThat(wd.findElement(By.cssSelector("button.partner-start div.fw-btn-content")).getText(),
            equalTo("СТАТЬ ПАРТНЕРОМ"));
    click(By.xpath("//a[@class='logo']"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void checkAttribute() {
    isElementVisible(By.xpath("//button[@disabled='']"));
  }

  public void checkNewsPage() throws InterruptedException {
    click(By.linkText("Новости"));
    assertThat(wd.findElement(By.xpath("//div[@class='section__header text-center']/h1")).getText(),
            equalTo("Новости OFD.RU"));
    click(By.xpath("//a[@class='logo']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkEmailWhenRegistering() throws InterruptedException {
    type1(By.id("Email"), "rt5b&de@mail.ru");
    click(By.xpath("//button[@class='btn btn-primary btn-shadow ofd-form__button analytics-regstep1']"));
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-reg']/div[2]/div/div[2]/form/div[1]/div/div[1]/div")).getText(), equalTo("Неверный формат E-Mail"));
    clear(By.id("Email"));
    type1(By.id("Email"), " ");
    click(By.xpath("//button[@class='btn btn-primary btn-shadow ofd-form__button analytics-regstep1']"));
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-reg']/div[2]/div/div[2]/form/div[1]/div/div[1]/div")).getText(), equalTo("Поле обязательно для заполнения"));
    clear(By.id("Email"));
    type1(By.id("Email"), "rt5b&demail.ru");
    click(By.xpath("//button[@class='btn btn-primary btn-shadow ofd-form__button analytics-regstep1']"));
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-reg']/div[2]/div/div[2]/form/div[1]/div/div[1]/div")).getText(), equalTo("Неверный формат E-Mail"));
    click(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkEmailRegistrationForm() throws InterruptedException {
    Assert.assertTrue(isElementPresent(By.name("Email")));
    Assert.assertTrue(isElementPresent(By.name("Phone")));
    Assert.assertTrue(isElementPresent(By.name("FullName")));
    Assert.assertTrue(isElementPresent(By.name("ExplicitPassword")));
    Assert.assertTrue(isElementPresent(By.xpath("//button[@type='submit']")));
    type1(By.id("Email"), "zhanchikov@ofd.ru");
    type1(By.id("Phone"), "3423423455");
    type1(By.id("FullName"), "Test");
    click(By.cssSelector("div.ofd-form__input-group i.material-icons"));
    type1(By.name("ExplicitPassword"), "12345");
    click(By.xpath("//button[@class='btn btn-primary btn-shadow ofd-form__button analytics-regstep1']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@data-form-error='Email']")).getText(), equalTo("Аккаунт с таким E-Mail уже существует"));
    click(By.cssSelector("div.close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkEmailEmptyField() throws InterruptedException {
    type1(By.id("Email"), "");
    type1(By.id("Phone"), "34234234");
    type1(By.id("FullName"), "Test");
    click(By.xpath("//div[@id='pass_view_reg']/i[1]"));
    type1(By.name("ExplicitPassword"), "12345");
    click(By.xpath("//button[@class='btn btn-primary btn-shadow ofd-form__button analytics-regstep1']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[1]/div")).getText(),
            equalTo("Поле обязательно для заполнения"));
    click(By.cssSelector("div.text-right div.close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkPhoneEmptyField() throws InterruptedException {
    type1(By.id("Email"), "getIdUser@mail.ru");
    type1(By.id("Phone"), "");
    type1(By.id("FullName"), "Test");
    click(By.xpath("//div[@id='pass_view_reg']/i[1]"));
    type1(By.name("ExplicitPassword"), "12345");
    click(By.xpath("//button[@class='btn btn-primary btn-shadow ofd-form__button analytics-regstep1']"));
    assertThat(wd.findElement(By.xpath("//div[@data-form-error='Phone']")).getText(),
            equalTo("Поле обязательно для заполнения"));
    click(By.cssSelector("div.text-right div.close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkChangePasswordEmailEmptyField() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@id='jivo_close_button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.linkText("Забыли пароль?"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.className("placeholder-center"), "f#fbfbdb@mail.ru");
    click(By.xpath("//button[@class='btn btn-shadow btn-primary btn-sm']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-change_pass']//div[@data-form-error='email']")).getText(),
            equalTo("Неверный формат E-Mail"));
    type1(By.className("placeholder-center"), "ffbfbdb@mail.ru");
    click(By.xpath("//button[@class='btn btn-shadow btn-primary btn-sm']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-change_pass']//div[@data-form-error='email']")).getText(),
            equalTo("Пользователя с таким E-Mail не существует"));
    type1(By.className("placeholder-center"), "");
    click(By.xpath("//button[@class='btn btn-shadow btn-primary btn-sm']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-change_pass']//div[@data-form-error='email']")).getText(),
            equalTo("Поле обязательно для заполнения"));
    click(By.xpath("//div[@id='Modal-user-change_pass']//div[@class='close']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void loginAccount() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    //click(By.id("jivo_close_button"));
    //TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//input[@name='Login']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void loginToSystem(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    //click(By.id("jivo_close_button"));
    //TimeUnit.SECONDS.sleep(1);
    type1(By.name("Login"), email);
    type1(By.name("Password"), password);
    click(By.cssSelector("button.analytics-loginstep1"));
    TimeUnit.SECONDS.sleep(5);
  }

  public void loginToSystemDemoSite(String email, String password) throws InterruptedException {
    wd.get("https://dev.ofd.ru/");
    click(By.cssSelector("div.pull-right a.analytics-login"));
    TimeUnit.SECONDS.sleep(1);
    type(By.name("Login"), email);
    type(By.name("Password"), password);
    click(By.cssSelector("button.analytics-loginstep1"));
  }

  public void checkUserNotRegister() throws InterruptedException {
    type1(By.name("Login"), "rtrteter@yopmail.com");
    type1(By.name("Password"), "123");
    click(By.cssSelector("button.analytics-loginstep1"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@data-form-error='Login']")).getText(),
            equalTo("Ошибка авторизации"));
    //click(By.cssSelector("div.close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkHomePage() throws InterruptedException {
    type1(By.name("Login"), "zhanchikov@ofd.ru");
    type1(By.name("Password"), "12345");
    click(By.cssSelector("button.analytics-loginstep1"));
    TimeUnit.SECONDS.sleep(7);
    assertThat(wd.findElement(By.xpath("//div[@class='fd-breadcrumbs']//span")).getText(),
            equalTo("Все кассы"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkAuthorizationIncorrectEmail() throws InterruptedException {
    type1(By.name("Login"), "testmail.ru");
    type1(By.name("Password"), "12345");
    click(By.cssSelector("button.analytics-loginstep1"));
    assertThat(wd.findElement(By.cssSelector("div.fx-input-error")).getText(), equalTo("Неверный формат E-Mail"));
    type1(By.name("Login"), "test@mailru");
    type1(By.name("Password"), "12345");
    click(By.cssSelector("button.analytics-loginstep1"));
    assertThat(wd.findElement(By.cssSelector("div.fx-input-error")).getText(), equalTo("Неверный формат E-Mail"));
    type1(By.name("Login"), "t&es#t@mail.ru");
    type1(By.name("Password"), "12345");
    click(By.cssSelector("button.analytics-loginstep1"));
    assertThat(wd.findElement(By.cssSelector("div.fx-input-error")).getText(), equalTo("Неверный формат E-Mail"));
    type1(By.name("Login"), "testТест@mail.ru");
    type1(By.name("Password"), "12345");
    click(By.cssSelector("button.analytics-loginstep1"));
    assertThat(wd.findElement(By.cssSelector("div.fx-input-error")).getText(), equalTo("Неверный формат E-Mail"));
    //click(By.cssSelector("div.close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkAuthorizationIncorrectPassword() throws InterruptedException {
    type1(By.name("Login"), "zhanchikov@ofd.ru");
    type1(By.name("Password"), "123456");
    click(By.cssSelector("button.analytics-loginstep1"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@data-form-error='Login']")).getText(), equalTo("Ошибка авторизации"));
    type1(By.name("Password"), "12346");
    click(By.cssSelector("button.analytics-loginstep1"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@data-form-error='Login']")).getText(), equalTo("Ошибка авторизации"));
    type1(By.name("Password"), "12%s345");
    click(By.cssSelector("button.analytics-loginstep1"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@data-form-error='Login']")).getText(), equalTo("Ошибка авторизации"));
    type1(By.name("Login"), "zhanchikovvvv@ofd.ru");
    type1(By.name("Password"), "1234");
    click(By.cssSelector("button.analytics-loginstep1"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@data-form-error='Login']")).getText(), equalTo("Ошибка авторизации"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkAuthorizationEmptyInput() throws InterruptedException {
    type1(By.name("Login"), "");
    click(By.cssSelector("button.analytics-loginstep1"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.cssSelector("div.fx-input-error")).getText(),
            equalTo("Поле обязательно для заполнения"));
    type1(By.name("Login"), "zhanchikov@ofd.ru");
    click(By.cssSelector("button.analytics-loginstep1"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@data-form-error='Password']")).getText(),
            equalTo("Поле обязательно для заполнения"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkMessagePasswordChange() throws InterruptedException {
    click(By.linkText("Забыли пароль?"));
    TimeUnit.SECONDS.sleep(1);
    type1(By.className("placeholder-center"), "ofdrinnispresent@yopmail.com");
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@id='Modal-user-change_pass']//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-change_pass']//p[@data-form-success='changepassword']")).getText(),
            equalTo("Мы отправили на почту письмо с инструкцией о смене пароля"));
    click(By.xpath("//div[@id='Modal-user-change_pass']//a[@href='/logout?login=true']"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void checkMessagePasswordChangeIncorrectEmail() throws InterruptedException {
    wd.navigate().refresh();
    TimeUnit.SECONDS.sleep(1);
    click(By.linkText("Забыли пароль?"));
    TimeUnit.SECONDS.sleep(1);
    type1(By.className("placeholder-center"), "ergeger@mail.ru");
    click(By.xpath("//div[@id='Modal-user-change_pass']//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-change_pass']//div[@data-form-error='email']")).getText(),
            equalTo("Пользователя с таким E-Mail не существует"));
    type1(By.className("placeholder-center"), "test@@binka.me");
    click(By.xpath("//div[@id='Modal-user-change_pass']//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-change_pass']//div[@data-form-error='email']")).getText(),
            equalTo("Неверный формат E-Mail"));
    type1(By.className("placeholder-center"), "testbinka.me");
    click(By.xpath("//div[@id='Modal-user-change_pass']//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-change_pass']//div[@data-form-error='email']")).getText(),
            equalTo("Неверный формат E-Mail"));
    type1(By.className("placeholder-center"), "test@binkame");
    click(By.xpath("//div[@id='Modal-user-change_pass']//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-change_pass']//div[@data-form-error='email']")).getText(),
            equalTo("Неверный формат E-Mail"));
    type1(By.className("placeholder-center"), "");
    click(By.xpath("//div[@id='Modal-user-change_pass']//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-change_pass']//div[@data-form-error='email']")).getText(),
            equalTo("Поле обязательно для заполнения"));
    type1(By.className("placeholder-center"), "tеst1@binka.Дe");
    click(By.xpath("//div[@id='Modal-user-change_pass']//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@id='Modal-user-change_pass']//div[@data-form-error='email']")).getText(),
            equalTo("Пользователя с таким E-Mail не существует"));
    click(By.xpath("//div[@id='Modal-user-change_pass']//div[@class='close']"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void newCustomerRegistration(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    //click(By.xpath("//div[@id='jivo_close_button']"));
    //TimeUnit.SECONDS.sleep(2);
    click(By.cssSelector("div.middletext button.connect-button"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("//div[@class='modal__content text-center']//input[@name='Email']"), email);
    type1(By.xpath("//div[@class='modal__content text-center']//input[@name='Phone']"), "9024951054");
    type1(By.xpath("//div[@class='modal__content text-center']//input[@name='FullName']"), "Test Test");
    click(By.cssSelector("div.ofd-form__input-group i.material-icons"));
    type1(By.name("ExplicitPassword"), password);
    click(By.xpath("//button[@class='btn btn-primary btn-shadow ofd-form__button analytics-regstep1']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[5]/div[2]/div/div[2]/div[2]/a"));
  }

  public void notConfirmEmailRegistration(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("//div[@class='modal__content text-center']//input[@name='Email']"), email);
    type1(By.xpath("//div[@class='modal__content text-center']//input[@name='Phone']"), "9024951054");
    type1(By.xpath("//div[@class='modal__content text-center']//input[@name='FullName']"), "Test Test");
    click(By.cssSelector("div.ofd-form__input-group i.material-icons"));
    type1(By.name("ExplicitPassword"), password);
    click(By.xpath("//button[@class='btn btn-primary btn-shadow ofd-form__button analytics-regstep1']"));
    TimeUnit.SECONDS.sleep(6);
    click(By.xpath("//a[@href='/logout?login=true']"));
  }

  public void finish(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='modal__body']//div[@type='button']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("Login"), email);
    type(By.name("Password"), password);
    click(By.cssSelector("button.analytics-loginstep1"));
    TimeUnit.SECONDS.sleep(7);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(), equalTo("Регистрация данных пользователя"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void registrationUserToYopmail(String user) {
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
  }

  public void confirmationRegistration(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    type(By.xpath("//input[@id='Login_ecp']"), email);
    type(By.xpath("//input[@id='Password_lk_modal']"), password);
    click(By.xpath("//div[@id='Modal-user-lk']//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(8);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(), equalTo("Регистрация данных пользователя"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void replaceForgotPassword(String email) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    //click(By.cssSelector("div.pull-right a.analytics-login"));
    click(By.linkText("Забыли пароль?"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("//input[@data-input-type='email']"), email);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//button[@class='btn btn-shadow btn-primary btn-sm']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@id='Modal-user-change_pass']//div[@class='close']"));
  }

   public void confirmForgotPassword(String email, String password2) throws InterruptedException {
     TimeUnit.SECONDS.sleep(1);
     //click(By.cssSelector("div.pull-right a.analytics-login"));
     TimeUnit.SECONDS.sleep(1);
     type(By.name("Login"), email);
     type(By.name("Password"), password2);
     click(By.cssSelector("button.analytics-loginstep1"));
     TimeUnit.SECONDS.sleep(2);
     assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(), equalTo("Регистрация данных пользователя"));
     click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
     TimeUnit.SECONDS.sleep(1);
     click(By.linkText("Выйти"));
     TimeUnit.SECONDS.sleep(1);
  }

  public void checkPasswordsNotMatch(String email, String password1, String password2) throws InterruptedException {
    TimeUnit.SECONDS.sleep(30);
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), email);
    click(By.cssSelector("input.sbut"));
    wd.switchTo().frame(wd.findElement(By.id("ifmail")));
    click(By.xpath("//p[@style='font-size:14px;line-height:22px;']//a"));
    wd.switchTo().defaultContent();
    TimeUnit.SECONDS.sleep(2);
    ArrayList tabs2 = new ArrayList(wd.getWindowHandles());//Получение списка открытых окон браузера
    wd.switchTo().window((String) tabs2.get(1));//Переключение на второй таб в браузере
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("//div[@id='modal-changepass']//input[@type='password']"), password1);
    type1(By.name("Password2"), password2);
    click(By.xpath("//div[@id='modal-changepass']//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@data-form-error='Password2']")).getText(),
            equalTo("Пароли должны совпадать"));
    click(By.xpath("//div[@id='modal-changepass']//div[@class='close']"));
    TimeUnit.SECONDS.sleep(1);
    wd.switchTo().window((String) tabs2.get(0));
    wd.get("http://test.ofd.ru");
    TimeUnit.SECONDS.sleep(2);
  }

  public void checkForFields(String email, String password) throws InterruptedException {
    type(By.xpath("//input[@name='Login']"), email);
    type(By.xpath("//input[@name='Password']"), password);
    click(By.cssSelector("button.analytics-loginstep1"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/label")).getText()
            , equalTo("ИНН компании"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[2]/div[2]/div[1]/div/div/label")).getText()
            , equalTo("Название организации"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[2]/div[1]/div[2]/div/div/label")).getText()
            , equalTo("ФИО руководителя и должность"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[2]/div[2]/div[2]/div/div/label")).getText()
            , equalTo("КПП"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[2]/div[1]/div[3]/div/div/label")).getText()
            , equalTo("ОГРН"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div/label")).getText()
            , equalTo("Электронный документооборот"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[3]/div[2]/div[1]/div/div/label")).getText()
            , equalTo("Индекс"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[3]/div[2]/div[2]/div/div/label")).getText()
            , equalTo("Регион"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[3]/div[2]/div[3]/div/div/label")).getText()
            , equalTo("Населённый пункт"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[3]/div[3]/div[1]/div/div/label")).getText()
            , equalTo("Улица"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/div/div/label")).getText()
            , equalTo("Дом"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[3]/div[3]/div[3]/div/div/label")).getText()
            , equalTo("Корпус/строение"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[3]/div[3]/div[4]/div/div/label")).getText()
            , equalTo("Офис/квартира"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div")).getText()
            , equalTo("Да"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div/div[1]/div[5]/div/div[2]/div")).getText()
            , equalTo("Нет"));
    assertThat(wd.findElement(By.xpath("//button[@type='submit']")).getText()
            , equalTo("Продолжить"));
  }

  public void checkCompanyRegistration(String inn) throws InterruptedException {
    type(By.name("Inn"), inn);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    type(By.name("Locality"),"Налпункт");
    type(By.name("House"),"46");
    assertThat(wd.findElement(By.xpath("//input[@name='Kpp']")).getAttribute("value"), equalTo("246401001"));
    click(By.cssSelector("div.customer__nds-inline div.fw-label_disabled"));
    scrollToItem(By.xpath("//button[@type='submit']"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/div/div/input"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(9);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-section__content color-info']/div[1]/h3")).getText(),
            equalTo("Как подключить кассу к OFD.RU?"));
  }

  public void checkFieldNdsEmpty(String inn) throws InterruptedException {
    type(By.name("Inn"), inn);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/div/div/input"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color"),
            equalTo("rgba(229, 233, 240, 1)"));
    scrollToItem(By.xpath("//img[@src='https://ofd.ru/Content/Images/logo_type1.svg']"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkFieldWorkflowEmpty(String inn) throws InterruptedException {
    type(By.name("Inn"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    type(By.name("PostalCode"), "342556");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[2]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='Республика Алтай']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("Settlement"),"Питеррр");
    type(By.name("Street"),"Ленина");
    type(By.name("HouseNumber"),"267");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/div/div/input"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@class='btn btn-primary btn-md']"));
    isElementVisible(By.xpath("//button[@disabled='']"));
    scrollToItem(By.xpath("//img[@src='https://ofd.ru/Content/Images/logo_type1.svg']"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkRegistrationPostoplatnik(String inn) throws InterruptedException {
    type(By.name("Inn"), inn);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.cssSelector("div.text-center h3.font-size-20"));
    click(By.cssSelector("div.customer__nds-inline div.fw-label_disabled"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/div/div/input"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Пользователь с таким ИНН уже зарегистрирован"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("//img[@src='https://ofd.ru/Content/Images/logo_type1.svg']"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkNoAgreementOffer(String inn) throws InterruptedException {
    type(By.name("Inn"), inn);
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='fw-card-body']/div[5]/div/div[1]/div"));
    TimeUnit.SECONDS.sleep(1);
    isElementVisible(By.xpath("//button[@disabled='']"));
    scrollToItem(By.xpath("//img[@src='https://ofd.ru/Content/Images/logo_type1.svg']"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkFieldLegalAddressEmpty(String inn) throws InterruptedException {
    type(By.name("Inn"), inn);
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    type1(By.name("Name"),"Test Company");
    type1(By.name("Employee"),"Testov User");
    type1(By.name("Kpp"),"143501001");
    type1(By.name("Ogrn"),"1037739263539");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    clear(By.xpath("//input[@name='PostalCode']"));
    clear(By.xpath("//input[@name='Settlement']"));
    clear(By.xpath("//input[@name='Street']"));
    clear(By.xpath("//input[@name='HouseNumber']"));
    click(By.xpath("//input[@name='Building']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[1]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[3]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[1]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/div/div/input"));
    TimeUnit.SECONDS.sleep(1);
    isElementVisible(By.xpath("//button[@disabled='']"));
    scrollToItem(By.xpath("//img[@src='https://ofd.ru/Content/Images/logo_type1.svg']"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void enterValuesInputFieldsLegalEntity(String inn) throws InterruptedException {
    type(By.name("Inn"), inn);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[2]/div/div/input"), "668501001");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.customer__nds-inline div.fw-label_disabled"));
    scrollToItem(By.xpath("//button[@type='submit']"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/div/div/input"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(15);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-section__content color-info']/div[1]/h3")).getText(),
            equalTo("Как подключить кассу к OFD.RU?"));
  }

  public void enterValuesInputFieldsIndividualEntrepreneur(String inn) throws InterruptedException {
    type(By.name("Inn"), inn);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    type(By.name("Street"), "Ленина");
    type(By.name("HouseNumber"), "36");
    click(By.cssSelector("div.customer__nds-inline div.analytics-regstep4"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/div/div/input"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(10);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-section__content color-info']/div[1]/h3")).getText(),
            equalTo("Как подключить кассу к OFD.RU?"));
  }

  public void checkInnNotFound(String inn) throws InterruptedException {
    type(By.name("Inn"), inn);
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Юридическое лицо с таким ИНН не найдено"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(),
            equalTo("Регистрация данных пользователя"));
    scrollToItem(By.xpath("//img[@src='https://ofd.ru/Content/Images/logo_type1.svg']"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkNotCorrectInn() throws InterruptedException {
    type(By.name("Inn"), "11133333333");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Неверный ИНН"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(),
            equalTo("Регистрация данных пользователя"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkInnDoesNotExist(String inn) throws InterruptedException {
    type(By.name("Inn"), inn);
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Юридическое лицо с таким ИНН не найдено"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/div/div/input"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(),
            equalTo("Регистрация данных пользователя"));
    scrollToItem(By.xpath("//img[@src='https://ofd.ru/Content/Images/logo_type1.svg']"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void clearLegalAddressFields() throws InterruptedException {
    type(By.name("Inn"), "6685133850");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[1]/div/div/input"));
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[3]/div/div/input"));
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[1]/div/div/input"));
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[3]/div/div/input"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[1]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[3]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[1]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/div/div/input"));
    TimeUnit.SECONDS.sleep(1);
    isElementPresent(By.xpath("//button[@disabled='']"));
    scrollToItem(By.xpath("//img[@src='https://ofd.ru/Content/Images/logo_type1.svg']"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void enterValuesCorrespAddress(String inn) throws InterruptedException {
    type1(By.name("Inn"), inn);
    type1(By.name("Kpp"), "668501001");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//input[@type='checkbox']"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[4]/div/label"));
    type1(By.name("PostPostalCode"), "6775591");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[1]/div[2]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='Республика Калмыкия']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/div/div/input"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(12);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/h3")).getText(),
            equalTo("Как подключить кассу к OFD.RU?"));
  }

  public void notFillCorresoAddressFields(String inn) throws InterruptedException {
    type(By.name("Inn"), inn);
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    type1(By.name("Name"),"Test Company");
    type1(By.name("Employee"),"Testov User");
    type1(By.name("Kpp"),"143501001");
    type1(By.name("Ogrn"),"1037739263539");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//input[@type='checkbox']"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[4]/div/label"));
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[1]/div[1]/div/div/input"));
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[1]/div[3]/div/div/input"));
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[2]/div[1]/div/div/input"));
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[2]/div[2]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[2]/div[3]/div/div/input"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[1]/div[1]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[1]/div[3]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[2]/div[1]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[2]/div[2]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[1]/div/div/input"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color"),
            equalTo("rgba(229, 233, 240, 1)"));
    scrollToItem(By.xpath("//img[@src='https://ofd.ru/Content/Images/logo_type1.svg']"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void enterBecomePartner() throws InterruptedException {
    wd.get("https://demo.ofd.ru/partnerskaya-programma");
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//section[1]/div/div/div[1]/p[2]/button"));
  }

  public void fillingRegistrationFieldsNewPartner(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("//*[@id='Email']"), email);
    type(By.id("Phone"), "89054001020");
    type(By.id("FullName"), "Test Testov");
    click(By.xpath("//div[@class='input-group-sm ofd-form__input-group ']/i"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/p[2]/a"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void fillingRegFieldsNewPartner(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    type1(By.xpath("//div[@id='Modal-partner']//input[@name='Email']"), email);
    type1(By.xpath("//div[@id='Modal-partner']//input[@name='Phone']"), "9054001020");
    type1(By.xpath("//div[@id='Modal-partner']//input[@name='FullName']"), "Test Testov");
    click(By.xpath("//div[@id='Modal-partner']//div[@id='pass_view_reg']/i[1]"));
    type1(By.xpath("//div[@id='Modal-partner']//input[@name='ExplicitPassword']"), password);
    click(By.xpath("//div[@id='Modal-partner']//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(4);
    click(By.xpath("//div[@id='Modal-partner']//a[@href='/logout?login=true']"));
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//div[@id='Modal-user-lk']//div[@class='close']"));
  }


  public void confirmationRegistrationMail(String user) throws InterruptedException {
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
    click(By.id("lrefr"));
    wd.switchTo().frame(wd.findElement(By.id("ifmail")));
    waitTheElement(By.xpath("/html/body/div/div[3]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/h1"), "Подтвердите регистрацию");
    click(By.xpath("//p[@style='font-size:14px;line-height:22px;']//a"));
    wd.switchTo().defaultContent();
    TimeUnit.SECONDS.sleep(8);
  }

  public void confirmationRegistrationOnSite1(String email, String password) throws InterruptedException {
    //ArrayList tabs2 = new ArrayList(wd.getWindowHandles());//Получение списка открытых окон браузера
    //wd.switchTo().window((String) tabs2.get(1));//Переключение на второй таб в браузере

    type(By.xpath("//input[@name='Login']"), email);
    type(By.xpath("//input[@name='Password']"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/h1")).getText(),
            equalTo("Анкета партнера"));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div"));
    click(By.xpath("//a[@href='http://test.ofd.ru/logout']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void confirmRegOnSite(String email, String password) throws InterruptedException {
    type(By.xpath("//div[@id='Modal-user-lk']//input[@name='Login']"), email);
    type(By.xpath("//div[@id='Modal-user-lk']//input[@name='Password']"), password);
    click(By.xpath("//div[@id='Modal-user-lk']//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(10);
    assertThat(wd.findElement(By.xpath("//span[@class='caption']")).getText(),
            equalTo("ЛИЧНЫЙ КАБИНЕТ ПАРТНЁРА"));
  }


  public void confirmationRegistrationOnSite2(String email, String password) throws InterruptedException {
    //ArrayList tabs2 = new ArrayList(wd.getWindowHandles());//Получение списка открытых окон браузера
    //wd.switchTo().window((String) tabs2.get(1));//Переключение на второй таб в браузере
    click(By.xpath("//a[@class='lk-button btn btn-border-fade pull-right analytics-loginhead font-h6 analytics-login']"));
    type(By.xpath("//input[@name='Login']"), email);
    type(By.xpath("//input[@name='Password']"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/h1")).getText(),
            equalTo("Анкета партнера"));
  }

  public void fillingRegistrationFieldsPartnerAlreadyExists(String email, String password) throws InterruptedException {
    type(By.id("Email"), email);
    type(By.id("Phone"), "89054001020");
    type(By.id("FullName"), "Test Testov");
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[1]/div")).getText()
            , equalTo("Аккаунт с таким E-Mail уже существует"));
    click(By.xpath("//div[@class='close']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void fillingRegistrationFieldsEmptyPhoneField(String email, String password) throws InterruptedException {
    type(By.id("Email"), email);
    type(By.id("FullName"), "Test Testov");
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[2]/div")).getText()
            , equalTo("Поле обязательно для заполнения"));
    click(By.xpath("//div[@class='close']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void fillingRegistrationFieldsEmptyPasswordField(String email) throws InterruptedException {
    type(By.id("Email"), email);
    type(By.id("Phone"), "89054001020");
    type(By.id("FullName"), "Test Testov");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/div")).getText()
            , equalTo("Поле обязательно для заполнения"));
    click(By.xpath("//div[@class='close']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void fillingRegistrationFieldsEmptyAllFields() throws InterruptedException {
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[1]/div")).getText()
            , equalTo("Поле обязательно для заполнения"));
    click(By.xpath("//div[@class='close']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void entranceToPartnerOffice() throws InterruptedException {
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]/div/ul/li/a")).getText()
            , equalTo("Клиенты и Кассы"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]/span/a/p")).getText()
            , equalTo("КАБИНЕТ ПАРТНЁРА"));
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.xpath("//a[@href='http://test.ofd.ru/logout']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void enterIncorrectEmail() throws InterruptedException {
    type(By.xpath("//input[@name='Login']"), "ofdtestpartne@yopmail.com");
    type(By.xpath("//input[@name='Password']"), "12345");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//span[@class='input-error']")).getText()
            , equalTo("Неверный Email или пароль"));
    type(By.xpath("//input[@name='Login']"), "ofdtestpartneryopmail.com");
    type(By.xpath("//input[@name='Password']"), "12345");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//span[@class='input-error']")).getText()
            , equalTo("Неверный Email или пароль"));
    type(By.xpath("//input[@name='Login']"), "ofdtestpartner@yopmailcom");
    type(By.xpath("//input[@name='Password']"), "12345");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//span[@class='input-error']")).getText()
            , equalTo("Неверный Email или пароль"));
    click(By.xpath("//div[@class='close']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void enterUnregisteredUser() throws InterruptedException {
    type(By.xpath("//input[@name='Login']"), "ofdtestNonpartner@yopmail.com");
    type(By.xpath("//input[@name='Password']"), "12345");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//span[@class='input-error']")).getText()
            , equalTo("Неверный Email или пароль"));
    click(By.xpath("//div[@class='close']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void enterEmptyPassword() throws InterruptedException {
    type(By.xpath("//input[@name='Login']"), "ofdtestpartner@yopmail.com");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//span[@class='input-error']")).getText()
            , equalTo("Поле обязательно для заполнения"));
    click(By.xpath("//div[@class='close']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void makePasswordChange(String email) throws InterruptedException {

    click(By.xpath("//a[@href='#']"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("//div[@class='input-group']/input[@name='email']"), email);
    click(By.xpath("//button[@type='submit']"));
    click(By.xpath("//div[@class='close']"));
    TimeUnit.SECONDS.sleep(30);
  }

  public void passwordConfirmation(String user, String password) throws InterruptedException {
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
    click(By.id("lrefr"));
    wd.switchTo().frame(wd.findElement(By.id("ifmail")));
    click(By.xpath("//p[@style='font-size:14px;line-height:22px;']//a"));
    wd.switchTo().defaultContent();
    ArrayList tabs2 = new ArrayList(wd.getWindowHandles());//Получение списка открытых окон браузера
    wd.switchTo().window((String) tabs2.get(1));//Переключение на второй таб в браузере
    TimeUnit.SECONDS.sleep(4);
    click(By.xpath("/html/body/div[1]/div/div/div[6]/div[2]/div/div[2]/form/div[2]/i"));
    type(By.id("Password"), password);
    click(By.xpath("/html/body/div/div/div[1]/div[6]/div[2]/div/div[2]/form/div[3]/i"));
    type(By.id("ConfirmPassword"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]/div/ul/li/a")).getText()
            , equalTo("Клиенты и Кассы"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]/span/a/p")).getText()
            , equalTo("КАБИНЕТ ПАРТНЁРА"));
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.xpath("//a[@href='http://test.ofd.ru/logout']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void fillingCustomerForm(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.xpath("//input[@name='Locality']"), "Тестовый город");
    type(By.xpath("//input[@name='House']"), "34");
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    type(By.xpath("//input[@name='Bik']"), "041403633");
    type(By.id("BankCheckingAccount"), "30101810100000000633");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]/label/div[1]"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(4);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/h2/span[1]")).getText(),
            equalTo("Договор №"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/ul/li[1]/a")).getText(),
            equalTo("Финансовые условия и порядок расчётов"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/ul/li[1]/a"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/h3/b")).getText(),
            equalTo("3. ФИНАНСОВЫЕ УСЛОВИЯ И ПОРЯДОК РАСЧЕТОВ"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/ul/li[2]/a")).getText(),
            equalTo("Ответственность сторон"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/ul/li[2]/a"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/h3[1]/b")).getText(),
            equalTo("4. ОТВЕТСТВЕННОСТЬ СТОРОН"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/ul/li[3]/a")).getText(),
            equalTo("Конфиденциальная информация"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/ul/li[3]/a"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/h3/b")).getText(),
            equalTo("8. КОНФИДЕНЦИАЛЬНАЯ ИНФОРМАЦИЯ"));
    scrollToItem(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("//button[@type='submit']")).getText(), equalTo("Подписать с ЭЦП"));
    scrollToItem(By.xpath("//a[@href='/pk/register-pos']"));
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.xpath("//a[@class='fd-text fd-text_m fd-decoration_none']"));
  }

  public void fillingCustomerFormInnNotBD(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[2]/div/button"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[1]/input"), "Тестовая");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[1]/div[3]/input"), "Тест директор");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[3]/input"), "Устав");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[2]/input"), "Тестов Тест Юзерович");
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[1]/div[4]/label"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[1]/div[4]/input"), "1077847452143");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[2]/div[1]/p/span"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/input"), "117420");
    click(By.xpath("//div[@class='fw-col fw-col-3 ']//div[@class='ofd-select']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='Республика Алтай']"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[2]/div[2]/div[3]/div/div/input"), "Город");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/input"), "Ленина");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[2]/div[3]/div[2]/div/div/input"), "4");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/h2"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div/input"), "041403633");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[2]/div[1]/input"), "30101810100000000633");
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/h2"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h1")).getText(),
            equalTo("Прочтите и подпишите договор с OFD.RU"));
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("//a[@href='/pk/register-pos']"));
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void testRegLegalEntity(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.xpath("//input[@name='Locality']"), "Тестовый город");
    type(By.xpath("//input[@name='House']"), "34");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/h2"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div/input"), "041403633");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[2]/div[1]/input"), "30101810100000000633");
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/h2"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h1")).getText(),
            equalTo("Прочтите и подпишите договор с OFD.RU"));
    scrollToItem(By.xpath("//a[@href='/pk/register-pos']"));
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.xpath("//a[@class='fd-text fd-text_m fd-decoration_none']"));
  }

  public void testIncorrectINNFront95(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type1(By.name("Inn"), inn);
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Неверный ИНН"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkContractNotSigned1(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    click(By.xpath("//button[@class='fw-btn fw-btn_md fw-btn-gray-outline']"));
    TimeUnit.SECONDS.sleep(1);
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("Locality"), "Test City");
    type(By.name("House"), "65");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/h2"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div/input"), "044525411");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[2]/div[1]/input"), "30101810100000000633");
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/h2"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[3]/div[2]/button"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h1")).getText(),
            equalTo("Прочтите и подпишите договор с OFD.RU"));
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void checkContractNotSigned2(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    type(By.name("Locality"), "Test City");
    type(By.name("House"), "65");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/h2"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div/input"), "044525411");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[2]/div[1]/input"), "30101810100000000633");
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/h2"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]"));
    click(By.xpath("//button[@type='submit']"));
  }

  public void checkContractAvailable() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h1")).getText(),
            equalTo("Прочтите и подпишите договор с OFD.RU"));
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    wd.get("http://test.ofd.ru/");
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkTabCustomersAndCash() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h1")).getText(),
            equalTo("Прочтите и подпишите договор с OFD.RU"));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]/div/ul"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/a/button/div")).getText(),
            equalTo("Скачать кассы"));
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void checkVerificationSignature(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.xpath("//input[@name='Locality']"), "Тестовый город");
    type(By.xpath("//input[@name='House']"), "34");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/h2"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div/input"), "041403633");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[2]/div[1]/input"), "30101810100000000633");
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/h2"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[3]/div[2]/button"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h1")).getText(),
            equalTo("Прочтите и подпишите договор с OFD.RU"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[4]/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div/h3")).getText(),
            equalTo("Не установлен плагин"));
    click(By.xpath("//span[@class='close-button']"));
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("//a[@href='/pk/register-pos']"));
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void checkInvalidContractNumber(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.xpath("//input[@name='Locality']"), "Тестовый город");
    type(By.xpath("//input[@name='House']"), "34");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/h2"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div/input"), "041403633");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[2]/div[1]/input"), "30101810100000000633");
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/h2"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h1")).getText(),
            equalTo("Прочтите и подпишите договор с OFD.RU"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div/input"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[3]/div/input"), "345354345636456");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[4]/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Не найдена информация о договоре, подписанного «на бумаге»"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("//a[@href='/pk/register-pos']"));
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void checkRegistrationPostpaid(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    click(By.xpath("//button[@class='fw-btn fw-btn_md fw-btn-gray-outline']"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("Locality"), "Test City");
    type(By.name("House"), "65");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/h2"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div/input"), "041403633");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[2]/div[1]/input"), "30101810100000000633");
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/h2"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[3]/div[2]/button"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h1")).getText(),
            equalTo("Прочтите и подпишите договор с OFD.RU"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/ul/li[1]/a"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/h3/b")).getText(),
            equalTo("3. ФИНАНСОВЫЕ УСЛОВИЯ И ПОРЯДОК РАСЧЕТОВ"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/ul/li[2]/a"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/h3[1]/b")).getText(),
            equalTo("4. ОТВЕТСТВЕННОСТЬ СТОРОН"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/ul/li[3]/a"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/h3/b")).getText(),
            equalTo("8. КОНФИДЕНЦИАЛЬНАЯ ИНФОРМАЦИЯ"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[4]"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[4]/button"));
    scrollToItem(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void checkInnAlreadyExists(String inn) throws InterruptedException {
    click(By.xpath("//button[@class='fw-btn fw-btn_md fw-btn-gray-outline']"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("Locality"), "Test City");
    type(By.name("House"), "65");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/h2"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div/input"), "041403633");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[2]/div[1]/input"), "30101810100000000633");
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/h2"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/h3")).getText(),
            equalTo("Не удалось зарегистрировать партнера"));
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Пользователь с таким ИНН уже зарегистрирован"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void createMailbox(String user) throws InterruptedException {
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void addAdditionalUser(String email) throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//a[@href='/lk/users']"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/p/button"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/input"), email);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/input"), "89995551122");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/div/input"), "Боган Тестович Метресе");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[4]/div[1]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[4]/div[2]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[4]/div[3]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[4]/div/div/button"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[2]/div/i"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[4]/div/div/button"));
    TimeUnit.SECONDS.sleep(6);
  }

  public void checkVerificationEmail(String user) throws InterruptedException {
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    TimeUnit.SECONDS.sleep(35);
    click(By.cssSelector("input.sbut"));
    wd.switchTo().frame(wd.findElement(By.id("ifmail")));
    click(By.xpath("//p[@style='font-size:14px;line-height:22px;']//a"));
    wd.switchTo().defaultContent();
    TimeUnit.SECONDS.sleep(5);
  }

  public void checkUserConfirmation(String email) throws InterruptedException {
    wd.navigate().refresh();
    //ArrayList tabs2 = new ArrayList(wd.getWindowHandles());//Получение списка открытых окон браузера
    //wd.switchTo().window((String) tabs2.get(1));//Переключение на второй таб в браузере
    //click(By.xpath("//a[@href='/lk/users']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div")).getText(),
            equalTo(email));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void addAdditionalUser2(String email) throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//a[@href='/lk/users']"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/p/button"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/input"), email);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/input"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/input")).
                    getCssValue("color"), equalTo("rgba(134, 171, 193, 1)"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/div/input")).
                    getCssValue("color"), equalTo("rgba(134, 171, 193, 1)"));
    click(By.xpath("//button[@class='fw-btn fw-btn_sm fw-btn-primary fw-btn-shadow']"));
    assertThat(wd.findElement(By.xpath("//button[@class='fw-btn fw-btn_sm fw-btn-primary fw-btn-shadow']/div[@class='fw-btn-content']")).getText(),
            equalTo("Обновить"));
    click(By.cssSelector("div.users__dialog-close i.material-icons"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void checkRemoveAccess() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//a[@href='/lk/users']"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div[6]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[1]/i"));
    TimeUnit.SECONDS.sleep(1);
    new WebDriverWait(wd, 1).
            until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[3]/div/div/div/div[6]/div/div[3]/div/i")));
    new WebDriverWait(wd, 1).
            until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[3]/div/div/div/div[6]/div/div[4]/div/i")));
    new WebDriverWait(wd, 1).
            until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[3]/div/div/div/div[6]/div/div[5]/div/i")));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//a[@href='/lk/users']"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div[6]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[1]/i"));
    new WebDriverWait(wd, 1).
            until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div[6]/div/div[3]/div/i")));
    new WebDriverWait(wd, 1).
            until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div[6]/div/div[4]/div/i")));
    new WebDriverWait(wd, 1).
            until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div[6]/div/div[5]/div/i")));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkAccessUserAccount() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    if (isElementPresent(By.xpath("//div[@class='fw-notification-close']"))){
      click(By.xpath("//div[@class='fw-notification-close']"));
    } else {
      TimeUnit.SECONDS.sleep(1);
      assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[@href='/lk/']")).getText(),
              equalTo("Мои кассы"));
      assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[@href='/lk/downloads']")).getText(),
              equalTo("Отчёты"));
      assertThat(wd.findElement(By.xpath("//a[@href='/fnsreg']")).getText(),
              equalTo("Заявки в ФНС"));
      click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
      TimeUnit.SECONDS.sleep(1);
      assertThat(wd.findElement(By.xpath("//a[@href='/lk/documents']")).getText(),
              equalTo("Документы"));
      assertThat(wd.findElement(By.xpath("//a[@href='/lk/profile']")).getText(),
              equalTo("Профиль"));
      click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
      TimeUnit.SECONDS.sleep(1);
      click(By.xpath("//a[@href='/lk/downloads']"));
      TimeUnit.SECONDS.sleep(1);
      assertThat(wd.findElement(By.xpath("//div[@id='content']//div[1]/div/h4[@class='report-type-title']")).getText(),
              equalTo("Отчет по сменам"));
      click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
      TimeUnit.SECONDS.sleep(1);
      click(By.xpath("//a[@href='/lk/documents']"));
      TimeUnit.SECONDS.sleep(1);
      click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
      TimeUnit.SECONDS.sleep(1);
      isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]"));
      isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]"));
      isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]"));
      click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
      click(By.linkText("Выйти"));
      TimeUnit.SECONDS.sleep(1);
    }
  }

  public void checkNoAccessToFolders() throws InterruptedException {
    //TimeUnit.SECONDS.sleep(3);
    //click(By.xpath("//i[@class='fw-notification-close material-icons']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div/h3")).getText(), equalTo("Как подключить кассу к OFD.RU?"));
    assertThat(wd.findElement(By.xpath("//a[@href='/lk/']")).getText(), equalTo("Мои кассы"));
    assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[@href='/lk/downloads']")).getText(),
            equalTo("Отчёты"));
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//a[@href='/lk/documents']")).getText(),
            equalTo("Документы"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkAccessToFolders() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    if (isElementPresent(By.xpath("//div[@class='fw-notification-close']"))){
      click(By.xpath("//div[@class='fw-notification-close']"));
    } else {
      assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[@href='/lk/']")).getText(),
              equalTo("Мои кассы"));
      assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[@href='/lk/downloads']")).getText(),
              equalTo("Отчёты"));
      assertThat(wd.findElement(By.xpath("//a[@href='/fnsreg']")).getText(),
              equalTo("Заявки в ФНС"));
      click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
      TimeUnit.SECONDS.sleep(1);
      assertThat(wd.findElement(By.xpath("//a[@href='/lk/documents']")).getText(),
              equalTo("Документы"));
      assertThat(wd.findElement(By.xpath("//a[@href='/lk/profile']")).getText(),
              equalTo("Профиль"));
      click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
      TimeUnit.SECONDS.sleep(1);
      click(By.xpath("//a[@href='/lk/downloads']"));
      assertThat(wd.findElement(By.xpath("//div[@class='fw-card-body']/div/div[1]/div/h4")).getText(),
              equalTo("Отчет по сменам"));
      click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
      TimeUnit.SECONDS.sleep(1);
      click(By.xpath("//a[@href='/lk/documents']"));
      click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
      TimeUnit.SECONDS.sleep(1);
      isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]"));
      isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]"));
      isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]"));
      click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
      click(By.linkText("Выйти"));
      TimeUnit.SECONDS.sleep(1);
    }
  }

  public void checkFillingRegistrationData(int arbitrarily1, String arbitrarily2) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.xpath("//a[@href='/pk/register-pos/6be17d76-0194-4615-a89e-c681ac888a85/']"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily1));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[2]/div/div/input"), arbitrarily2);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(5);
    assertThat(wd.findElement(By.xpath("//h2[@class='text text_title-h2 text_center margin-bottom-21']")).getText(),
            equalTo("Выберите, каким способом клиент заключит договоры с OFD.RU:"));
    assertThat(wd.findElement(By.xpath("//table/tbody/tr[1]/th[2]")).getText(),
            equalTo("Список договоров"));
    assertThat(wd.findElement(By.xpath("//table/tbody/tr[1]/th[3]")).getText(),
            equalTo("Стоимость, руб."));
    assertThat(wd.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText(),
            equalTo("Итого к оплате:"));
    scrollToItem(By.xpath("//h2[@class='text text_title-h2 text_center margin-bottom-21']"));
    click(By.xpath("//label[@class='text radio__first']"));
    assertThat(wd.findElement(By.xpath("//button[@class='button button_custom button_custom-s button_inline button_smoke']")).getCssValue("background-color"),
            equalTo("rgba(229, 233, 240, 1)"));
    click(By.xpath("//label[@class='text radio__last']"));
    assertThat(wd.findElement(By.xpath("//a[@class='button button_custom button_custom-s button_inline button_smoke']")).getCssValue("background-color"),
            equalTo("transparent"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.cssSelector("div.reg-4__content h1.text_title")).getText(),
            equalTo("Сформирован счёт для клиента за услуги OFD.RU"));
    click(By.xpath("//div[@class='reg-4__toggle-title']"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[4]/div/div/div/span/span[2]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.cssSelector("span.fade")).getText(),
            equalTo("Банк получателя"));
    assertThat(wd.findElement(By.xpath("//div[4]/div/table/tbody/tr[1]/td[2]")).getText(),
            equalTo("БИК"));
    assertThat(wd.findElement(By.xpath("//td[@style='border-left:none;']/span[1]")).getText(),
            equalTo("Корр."));
    assertThat(wd.findElement(By.xpath("//div[4]/div/table/tbody/tr[3]/td[5]/span[1]")).getText(),
            equalTo("Рас."));
    assertThat(wd.findElement(By.xpath("//div[4]/div/table/tbody/tr[3]/td[1]")).getText(),
            equalTo("ИНН"));
    assertThat(wd.findElement(By.xpath("//div[4]/div/table/tbody/tr[3]/td[3]")).getText(),
            equalTo("КПП"));
    assertThat(wd.findElement(By.xpath("//h2[@class='text text_title-h2 reg-4__bill-info margin-bottom-16']/span[1]")).getText(),
            equalTo("Счёт на оплату"));
    assertThat(wd.findElement(By.xpath("//div[2]/div/table/tbody/tr[1]/th[2]")).getText(),
            equalTo("Список договоров"));
    assertThat(wd.findElement(By.xpath("//div[2]/div/table/tbody/tr[1]/th[3]")).getText(),
            equalTo("Стоимость, руб."));
    scrollToItem(By.cssSelector("div.reg-4__bill-table h2.reg-4__bill-info"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.reg-5__content h1.text_title")).getText(),
            equalTo("Выберите способ регистрации касс в ФНС"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[1]/h2")).getText(),
            equalTo("Бумажное заявление"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/h2")).getText(),
            equalTo("Электронно на сайте ФНС"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[3]/h2")).getText(),
            equalTo("Электронно на OFD.RU"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.section__content h1.text_center")).getText(),
            equalTo("Подключите кассы к OFD.RU"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[1]/p[1]")).getText(),
            equalTo("Адрес сервера"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/p[1]")).getText(),
            equalTo("Порт сервера"));
    click(By.xpath("//a[@href='/pk/']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//a[@href='/pk/bills']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.cssSelector("div.billslist__bill-number-info p.billslist__bill-title")).getText(),
            equalTo("ООО \"НОРДРЕГИОНПРОДУКТ\""));
    assertThat(wd.findElement(By.xpath("//span[@class='billslist__footer-results-num text font-weight_bold valign-middle text_upper']/span[2]")).getText(),
            equalTo("3 000.00"));
    click(By.xpath("//span[@class='clear cursor-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@class='fw-btn fw-btn_md fw-btn-primary margin-left-5']"));
    TimeUnit.SECONDS.sleep(2);
    wd.navigate().refresh();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkSeveralCashRegisters(int arbitrarily1, String arbitrarily2, int arbitrarily3, String arbitrarily4) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.xpath("//a[@href='/pk/register-pos/6be17d76-0194-4615-a89e-c681ac888a85/']"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily1));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[2]/div/div/input"), arbitrarily2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[2]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily3));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[2]/div/div/div[2]/div[2]/div/input"), arbitrarily4);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(4);
    assertThat(wd.findElement(By.xpath("//h2[@class='text text_title-h2 text_center margin-bottom-21']")).getText(),
            equalTo("Выберите, каким способом клиент заключит договоры с OFD.RU:"));
    assertThat(wd.findElement(By.xpath("//table/tbody/tr[1]/th[2]")).getText(),
            equalTo("Список договоров"));
    assertThat(wd.findElement(By.xpath("//table/tbody/tr[1]/th[3]")).getText(),
            equalTo("Стоимость, руб."));
    isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[2]"));
    isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[3]"));
    assertThat(wd.findElement(By.xpath("//td[@class='last__all']")).getText(),
            equalTo("6 000.00"));
    scrollToItem(By.xpath("//h2[@class='text text_title-h2 text_center margin-bottom-21']"));
    click(By.xpath("//label[@class='text radio__first']"));
    assertThat(wd.findElement(By.xpath("//button[@class='button button_custom button_custom-s button_inline button_smoke']")).getCssValue("background-color"),
            equalTo("rgba(229, 233, 240, 1)"));
    click(By.xpath("//label[@class='text radio__last']"));
    assertThat(wd.findElement(By.xpath("//a[@class='button button_custom button_custom-s button_inline button_smoke']")).getCssValue("background-color"),
            equalTo("transparent"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.cssSelector("div.reg-4__content h1.text_title")).getText(),
            equalTo("Сформирован счёт для клиента за услуги OFD.RU"));
    click(By.xpath("//div[@class='reg-4__toggle-title']"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[4]/div/div/div/span/span[2]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.cssSelector("span.fade")).getText(),
            equalTo("Банк получателя"));
    assertThat(wd.findElement(By.xpath("//div[4]/div/table/tbody/tr[1]/td[2]")).getText(),
            equalTo("БИК"));
    assertThat(wd.findElement(By.xpath("//td[@style='border-left:none;']/span[1]")).getText(),
            equalTo("Корр."));
    assertThat(wd.findElement(By.xpath("//div[4]/div/table/tbody/tr[3]/td[5]/span[1]")).getText(),
            equalTo("Рас."));
    assertThat(wd.findElement(By.xpath("//div[4]/div/table/tbody/tr[3]/td[1]")).getText(),
            equalTo("ИНН"));
    assertThat(wd.findElement(By.xpath("//div[4]/div/table/tbody/tr[3]/td[3]")).getText(),
            equalTo("КПП"));
    assertThat(wd.findElement(By.xpath("//h2[@class='text text_title-h2 reg-4__bill-info margin-bottom-16']/span[1]")).getText(),
            equalTo("Счёт на оплату"));
    assertThat(wd.findElement(By.xpath("//div[2]/div/table/tbody/tr[1]/th[2]")).getText(),
            equalTo("Список договоров"));
    assertThat(wd.findElement(By.xpath("//div[2]/div/table/tbody/tr[1]/th[3]")).getText(),
            equalTo("Стоимость, руб."));
    assertThat(wd.findElement(By.xpath("//div[2]/div/table/tbody/tr[4]/td[3]")).getText(),
            equalTo("6 000.00"));
    scrollToItem(By.xpath("//p[@class='text text_m text_color-fade reg-4__bill-provider margin-bottom-14']"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.reg-5__content h1.text_title")).getText(),
            equalTo("Выберите способ регистрации касс в ФНС"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[1]/h2")).getText(),
            equalTo("Бумажное заявление"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/h2")).getText(),
            equalTo("Электронно на сайте ФНС"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[3]/h2")).getText(),
            equalTo("Электронно на OFD.RU"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.section__content h1.text_center")).getText(),
            equalTo("Подключите кассы к OFD.RU"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[1]/p[1]")).getText(),
            equalTo("Адрес сервера"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/p[1]")).getText(),
            equalTo("Порт сервера"));
    click(By.xpath("//a[@href='/pk/']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//a[@href='/pk/bills']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.cssSelector("div.billslist__bill-number-info p.billslist__bill-title")).getText(),
            equalTo("ООО \"НОРДРЕГИОНПРОДУКТ\""));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div/div[2]/span/span[2]")).getText(),
            equalTo("6 000.00"));
    click(By.xpath("//span[@class='clear cursor-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@class='fw-btn fw-btn_md fw-btn-primary margin-left-5']"));
    TimeUnit.SECONDS.sleep(2);
    wd.navigate().refresh();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkPreactivationCashRegister(String arbitrarily1, String arbitrarily2) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.xpath("//a[@href='/pk/register-pos/6be17d76-0194-4615-a89e-c681ac888a85/']"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily1));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[2]/div/div/input"), arbitrarily2);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(6);
    assertThat(wd.findElement(By.xpath("//h2[@class='text text_title-h2 text_center margin-bottom-21']")).getText(),
            equalTo("Выберите, каким способом клиент заключит договоры с OFD.RU:"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.cssSelector("div.reg-4__content h1.text_title")).getText(),
            equalTo("Все кассы предоплачены, счёт не нужен"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/table/tbody/tr[2]/td[3]")).getText(),
            equalTo("-"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.reg-5__content h1.text_title")).getText(),
            equalTo("Выберите способ регистрации касс в ФНС"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.section__content h1.text_center")).getText(),
            equalTo("Подключите кассы к OFD.RU"));
    click(By.xpath("//a[@href='/pk/']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@class='cashBoxRow-regNumber']")).getText(),
            equalTo(arbitrarily1));
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkRegularAndPreactivationCash(String arbitrarily1, String arbitrarily2, int arbitrarily3, String arbitrarily4) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.xpath("//a[@href='/pk/register-pos/6be17d76-0194-4615-a89e-c681ac888a85/']"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily1));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[2]/div/div/input"), arbitrarily2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[2]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily3));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[2]/div/div/div[2]/div[2]/div/input"), arbitrarily4);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(5);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[2]/td[3]")).getText(),
            equalTo("3000"));
    assertThat(wd.findElement(By.xpath("//tbody/tr[3]/td[3]/span[@class='color-fade']")).getText(),
            equalTo("Касса предоплачена"));
    click(By.xpath("//label[@class='text radio__last']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.cssSelector("div.reg-4__content h1.text_title")).getText(),
            equalTo("Сформирован счёт для клиента за услуги OFD.RU"));
    click(By.xpath("//div[@class='reg-4__toggle-title']"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[4]/div/div/div/span/span[2]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.reg-5__content h1.text_title")).getText(),
            equalTo("Выберите способ регистрации касс в ФНС"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.section__content h1.text_center")).getText(),
            equalTo("Подключите кассы к OFD.RU"));
    click(By.xpath("//a[@href='/pk/']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//a[@href='/pk/bills']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.cssSelector("div.billslist__bill-number-info p.billslist__bill-title")).getText(),
            equalTo("ООО \"НОРДРЕГИОНПРОДУКТ\""));
    click(By.xpath("//span[@class='clear cursor-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@class='fw-btn fw-btn_md fw-btn-primary margin-left-5']"));
    TimeUnit.SECONDS.sleep(2);
    wd.navigate().refresh();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkDownloadCashregister(String pathToFile) throws InterruptedException, AWTException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.xpath("//a[@href='/pk/register-pos/6be17d76-0194-4615-a89e-c681ac888a85/']"));
    TimeUnit.SECONDS.sleep(2);
    attach(By.xpath("//button[@class='fw-btn fw-btn_18 fw-btn-info-light']"), pathToFile);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(4);
    assertThat(wd.findElement(By.xpath("//h2[@class='text text_title-h2 text_center margin-bottom-21']")).getText(),
            equalTo("Выберите, каким способом клиент заключит договоры с OFD.RU:"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.cssSelector("div.reg-4__content h1.text_title")).getText(),
            equalTo("Сформирован счёт для клиента за услуги OFD.RU"));
    scrollToItem(By.xpath("//p[@class='text text_m text_color-fade reg-4__bill-provider margin-bottom-14']"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.reg-5__content h1.text_title")).getText(),
            equalTo("Выберите способ регистрации касс в ФНС"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.section__content h1.text_center")).getText(),
            equalTo("Подключите кассы к OFD.RU"));
    click(By.xpath("//a[@href='/pk/']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//a[@href='/pk/bills']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.cssSelector("div.billslist__bill-number-info p.billslist__bill-title")).getText(),
            equalTo("ООО \"НОРДРЕГИОНПРОДУКТ\""));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div/div[2]/span/span[2]")).getText(),
            equalTo("3 000.00"));
    click(By.xpath("//span[@class='clear cursor-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@class='fw-btn fw-btn_md fw-btn-primary margin-left-5']"));
    TimeUnit.SECONDS.sleep(2);
    wd.navigate().refresh();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkDownloadCashregisterNotFNS(String pathToFile) throws InterruptedException, AWTException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.xpath("//a[@href='/pk/register-pos/6be17d76-0194-4615-a89e-c681ac888a85/']"));
    TimeUnit.SECONDS.sleep(2);
    attach(By.xpath("//button[@class='fw-btn fw-btn_18 fw-btn-info-light']"), pathToFile);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(4);
    assertThat(wd.findElement(By.xpath("//h2[@class='text text_title-h2 text_center margin-bottom-21']")).getText(),
            equalTo("Выберите, каким способом клиент заключит договоры с OFD.RU:"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.cssSelector("div.reg-4__content h1.text_title")).getText(),
            equalTo("Сформирован счёт для клиента за услуги OFD.RU"));
    scrollToItem(By.xpath("//p[@class='text text_m text_color-fade reg-4__bill-provider margin-bottom-14']"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.reg-5__content h1.text_title")).getText(),
            equalTo("Выберите способ регистрации касс в ФНС"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.section__content h1.text_center")).getText(),
            equalTo("Подключите кассы к OFD.RU"));
    click(By.xpath("//a[@href='/pk/']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//a[@href='/pk/bills']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.cssSelector("div.billslist__bill-number-info p.billslist__bill-title")).getText(),
            equalTo("ООО \"НОРДРЕГИОНПРОДУКТ\""));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div/div[2]/span/span[2]")).getText(),
            equalTo("3 000.00"));
    click(By.xpath("//span[@class='clear cursor-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@class='fw-btn fw-btn_md fw-btn-primary margin-left-5']"));
    TimeUnit.SECONDS.sleep(2);
    wd.navigate().refresh();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkDownloadCashInvalidPar1(String pathToFile) throws InterruptedException, AWTException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.cssSelector("p.reg-client__select-name a.i-block"));
    TimeUnit.SECONDS.sleep(2);
    attach(By.xpath("//button[@class='fw-btn fw-btn_18 fw-btn-info-light']"), pathToFile);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-input__item ofd-input__item_left ofd-input__item_error']//span[@class='ofd-default-input__error']")).getText(),
            equalTo("Неверный формат заводского номера кассы"));
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-input__item ofd-input__item_right ofd-input__item_error']//span[@class='ofd-default-input__error']")).getText(),
            equalTo("Неверный формат номера фискального накопителя"));
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkDownloadCashInvalidPar2(String pathToFile) throws InterruptedException, AWTException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.cssSelector("p.reg-client__select-name a.i-block"));
    TimeUnit.SECONDS.sleep(2);
    attach(By.xpath("//button[@class='fw-btn fw-btn_18 fw-btn-info-light']"), pathToFile);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-input__item ofd-input__item_left ofd-input__item_error']//span[@class='ofd-default-input__error']")).getText(),
            equalTo("Неверный формат заводского номера кассы"));
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-input__item ofd-input__item_right ofd-input__item_error']//span[@class='ofd-default-input__error']")).getText(),
            equalTo("Неверный формат номера фискального накопителя"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[1]/div[2]/div/input"), "2354");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[2]/div/div/input"), "2342342342345");
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-input__item ofd-input__item_left ofd-input__item_error']//span[@class='ofd-default-input__error']")).getText(),
            equalTo("Поле должно содержать от 5 до 20 символов"));
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-input__item ofd-input__item_right ofd-input__item_error']//span[@class='ofd-default-input__error']")).getText(),
            equalTo("Поле должно состоять из 16 символов"));
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkDownloadCashAlreadyRegistered(String pathToFile) throws InterruptedException, AWTException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.cssSelector("p.reg-client__select-name a.i-block"));
    TimeUnit.SECONDS.sleep(2);
    attach(By.xpath("//button[@class='fw-btn fw-btn_18 fw-btn-info-light']"), pathToFile);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Данные по кассам не прошли проверку"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkIncorrectFiscalNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.cssSelector("p.reg-client__select-name a.i-block"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[1]/div[2]/div/input"), "34566788");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[2]/div/div/input"), "535555555555555");
    TimeUnit.SECONDS.sleep(1);
    isElementVisible(By.xpath("//button[@disabled='']"));
    assertThat(wd.findElement(By.xpath("//span[@class='ofd-default-input__error']")).getText(),
            equalTo("Поле должно состоять из 16 символов"));
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkIncorrectCashRegisterNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.cssSelector("p.reg-client__select-name a.i-block"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[1]/div[2]/div/input"), "3456");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[2]/div/div/input"), "5435345353453534");
    TimeUnit.SECONDS.sleep(1);
    isElementVisible(By.xpath("//button[@disabled='']"));
    assertThat(wd.findElement(By.xpath("//span[@class='ofd-default-input__error']")).getText(),
            equalTo("Поле должно содержать от 5 до 20 символов"));
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkIncorrectFiscalAndCashNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.cssSelector("p.reg-client__select-name a.i-block"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[1]/div[2]/div/input"), "3456");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[2]/div/div/input"), "54353453534535");
    TimeUnit.SECONDS.sleep(1);
    isElementVisible(By.xpath("//button[@disabled='']"));
    assertThat(wd.findElement(By.xpath("//span[@class='ofd-default-input__error']")).getText(),
            equalTo("Поле должно содержать от 5 до 20 символов"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[2]/div[2]/span")).getText(),
            equalTo("Поле должно состоять из 16 символов"));
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkCashNumberAlreadyExists() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.cssSelector("p.reg-client__select-name a.i-block"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[1]/div[2]/div/input"), "663585");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[2]/div/div/input"), "7607169430000000");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Эта касса уже зарегистрированна"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkRegistrationWithFNS(int arbitrarily1, String arbitrarily2) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.header__col-item div.header__add"));
    click(By.cssSelector("p.reg-client__select-name a.i-block"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily1));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/div/div[2]/div/div/input"), arbitrarily2);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(4);
    assertThat(wd.findElement(By.xpath("//h2[@class='text text_title-h2 text_center margin-bottom-21']")).getText(),
            equalTo("Выберите, каким способом клиент заключит договоры с OFD.RU:"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.cssSelector("div.reg-4__content h1.text_title")).getText(),
            equalTo("Сформирован счёт для клиента за услуги OFD.RU"));
    scrollToItem(By.xpath("//p[@class='text text_m text_color-fade reg-4__bill-provider margin-bottom-14']"));
    click(By.xpath("//a[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.reg-5__content h1.text_title")).getText(),
            equalTo("Выберите способ регистрации касс в ФНС"));
    click(By.xpath("//a[@class='button button_custom-s button_empty button_inline']"));
    TimeUnit.SECONDS.sleep(3);
    isElementPresent(By.name("register_cashier_type"));
    assertThat(wd.findElement(By.xpath("//div[@class='kkt-reg-section']/h3")).getText(),
            equalTo("Сведения о регистрируемой кассе"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[2]/div[2]/div/input")).getAttribute("value"),
            equalTo(String.valueOf(arbitrarily1)));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[2]/div[3]/div/input")).getAttribute("value"),
            equalTo(arbitrarily2));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[2]/h3"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[2]/div[1]/div[1]/div/div[1]/input"), "Tes56-1П");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[2]/div[1]/div[2]/div/div[1]/input"), "Testdfg666gf");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[2]/div[1]/div[3]/div/input"), "Test54f");
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[3]/h3"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[3]/div/div[1]/div/div/div/input"), "Москва Тестовая ул 45");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[3]/div/div[2]/div/div/input"), "524");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[4]/div[1]/div/input"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[5]/h3"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[5]/div[2]/div/input"), "Тестов");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[5]/div[3]/div/input"), "Тест");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/form/div[5]/div[4]/div/input"), "Тестович");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);

    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/h2"));
    isElementVisible(By.cssSelector("ul.kkt-form-list li.filled"));
    TimeUnit.SECONDS.sleep(2);

    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.linkText("Выйти"));
  }

  public void checkIncorrectDataFNS(int arbitrarily1, String arbitrarily2) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[1]/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily1));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/div[2]/div/input"), arbitrarily2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(3);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[1]/a[1]/span"));
    isElementVisible(By.xpath("//a[@target='_blank']"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[1]/a[2]/i"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/button[1]"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/button[2]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/button[2]"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/table/tbody/tr/td[2]/strong/span[1]")).getText(),
            equalTo("Услуги оператора фискальных данных по договору №"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/span"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[3]/td[1]")).getText(),
            equalTo("ИНН"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[3]/td[3]")).getText(),
            equalTo("КПП"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[3]/td[5]/span[2]")).getText(),
            equalTo("Сч. №"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[2]")).getText(),
            equalTo("БИК"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]")).getText(),
            equalTo("Сч. №"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/span/span[1]")).getText(),
            equalTo("Общество с ограниченной ответственностью \"ПЕТЕР-СЕРВИС Спецтехнологии\""));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div[2]/button"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h2")).getText(),
            equalTo("Выберите способ регистрации касс в ФНС"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/a"));
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/h3"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[1]/div/div[1]/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[2]/div/div[1]/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[3]/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[2]/div/div[1]/input"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[1]/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[2]/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[3]/span")).getText(),
            equalTo("Обязательно для заполнения"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[4]/span"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[4]/div[2]/div/input"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[5]/h3"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[5]/div[1]/div[1]/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[5]/div[2]/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[5]/div[3]/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[5]/div[4]/div/input"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[5]/div[2]/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[5]/div[3]/span")).getText(),
            equalTo("Обязательно для заполнения"));
    isElementVisible(By.xpath("//button[@disabled='']"));
  }

  public void checkReregistrationCash(int arbitrarily1, String arbitrarily2) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[1]/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily1));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/div[2]/div/input"), arbitrarily2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(3);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[1]/a[1]/span"));
    isElementVisible(By.xpath("//a[@target='_blank']"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[1]/a[2]/i"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/button[1]"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/button[2]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/button[2]"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/table/tbody/tr/td[2]/strong/span[1]")).getText(),
            equalTo("Услуги оператора фискальных данных по договору №"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/span"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[3]/td[1]")).getText(),
            equalTo("ИНН"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[3]/td[3]")).getText(),
            equalTo("КПП"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[3]/td[5]/span[2]")).getText(),
            equalTo("Сч. №"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[2]")).getText(),
            equalTo("БИК"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]")).getText(),
            equalTo("Сч. №"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/span/span[1]")).getText(),
            equalTo("Общество с ограниченной ответственностью \"ПЕТЕР-СЕРВИС Спецтехнологии\""));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div[2]/button"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h2")).getText(),
            equalTo("Выберите способ регистрации касс в ФНС"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/a"));
    TimeUnit.SECONDS.sleep(2);
    isElementVisible(By.cssSelector("ul.kkt-form-list li.active"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[1]/div[1]/div[2]/input"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[1]/div[2]/span"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[1]/div[2]/div[3]/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[1]/div[2]/div[5]/div/input"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/h3"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[1]/div/div[1]/input"), "Test56-1П");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[2]/div/div[1]/input"), "Testdfg626gf");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[3]/div/input"), "Test54g");
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[3]/h3"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[3]/div/div[1]/div/div/div/input"), "Москва Тестовая ул 41");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[3]/div/div[2]/div/div/input"), "424");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[4]/div[2]/div/input"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[5]/h3"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[5]/div[2]/div/input"), "Тестов");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[5]/div[3]/div/input"), "Тест");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[5]/div[4]/div/input"), "Тестович");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[6]/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/h2"));
    isElementVisible(By.cssSelector("ul.kkt-form-list li.filled"));
  }

  public void changingEmail(String email1, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    type(By.name("Login"), email1);
    type(By.name("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    //click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[1]/span/span[1]"));
    //click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[2]/div[3]/span"));
    //TimeUnit.SECONDS.sleep(2);
    //scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/p/a"));
    //click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/p/a"));
    //type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[1]/div/div/input"), password);
    //type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/input"), email2);
    //click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[3]/button"));
    //TimeUnit.SECONDS.sleep(1);
    //click(By.xpath("/html/body/div[4]/div/div[1]/button"));
  }

  public void changingPasswordOnLK() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.xpath("//a[@href='/lk/profile']"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("//p[@class='text text_m font-size-14 color-fade margin-bottom-5']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[@class='vertical-align-middle']"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void changeEmail(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.xpath("//a[@href='/lk/profile']"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("//p[@class='text text_m font-size-14 color-fade margin-bottom-5']"));
    click(By.xpath("//div[@class='fw-card-body']/div[5]/div/p/a"));
    TimeUnit.SECONDS.sleep(1);
    type(By.name("Password"), password);
    type(By.name("Email"), email);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(5);
  }

  public void confirmChangeEmail(String email, String password, String link) throws InterruptedException {
    TimeUnit.SECONDS.sleep(4);
    wd.get(link);
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//td[@align='center']/table/tbody/tr[3]/td/a"));
    TimeUnit.SECONDS.sleep(5);
    ArrayList tabs2 = new ArrayList(wd.getWindowHandles());//Получение списка открытых окон браузера
    wd.switchTo().window((String) tabs2.get(0));//Переключение на второй таб в браузере
    wd.close();
    wd.switchTo().window((String) tabs2.get(1));//Переключение на второй таб в браузере
    TimeUnit.SECONDS.sleep(2);
    type(By.name("Login"), email);
    type(By.name("Password"), password);
    click(By.xpath("//section[1]/div[2]/div/div[2]/form/button"));
    TimeUnit.SECONDS.sleep(5);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-section__content color-info']/div[1]/h3")).getText(),
            equalTo("Как подключить кассу к OFD.RU?"));
    assertThat(wd.findElement(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']/div[1]/div/span/span[1]")).getText(),
            equalTo(email));
  }

  public void authUnderModifMail() throws InterruptedException {
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(3);
    //wd.navigate().refresh();
  }

  public void checkEmailAlreadyExists(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.xpath("//a[@href='/lk/profile']"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("//p[@class='font-size-14 color-info-light margin-top-10']/a[@class='link color-info-light']"));
    click(By.xpath("//p[@class='font-size-14 color-info-light margin-top-10']/a[@class='link color-info-light']"));
    type1(By.name("Password"), password);
    type1(By.name("Email"), email);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Данный e-mail уже используется"));
    click(By.xpath("//button[@type='button']"));
  }

  public void checkEmailIncoretPassword(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.xpath("//a[@href='/lk/profile']"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("//p[@class='font-size-14 color-info-light margin-top-10']/a[@class='link color-info-light']"));
    click(By.xpath("//p[@class='font-size-14 color-info-light margin-top-10']/a[@class='link color-info-light']"));
    type1(By.name("Password"), password);
    type1(By.name("Email"), email);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Неверный пароль"));
    click(By.xpath("//button[@type='button']"));
  }

  public void checkEmailIncoretEmail(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.xpath("//a[@href='/lk/profile']"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("//p[@class='font-size-14 color-info-light margin-top-10']/a[@class='link color-info-light']"));
    click(By.xpath("//p[@class='font-size-14 color-info-light margin-top-10']/a[@class='link color-info-light']"));
    type1(By.name("Password"), password);
    type1(By.name("Email"), email);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Что-то пошло не так"));
    click(By.xpath("//button[@type='button']"));
  }

  public void authAccountManager(String email, String password) throws InterruptedException {
    wd.get("http://test.ofd.ru/mk/login");
    TimeUnit.SECONDS.sleep(6);
    type1(By.id("Login"), email);
    type1(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(7);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/h1/span")).getText(),
            equalTo("Список всех касс"));
    click(By.xpath("//a[@class='ofd-link ofd-link_none']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void authIncorrectEmail(String email, String password) throws InterruptedException {
    wd.get("http://test.ofd.ru/mk/login");
    TimeUnit.SECONDS.sleep(6);
    type1(By.id("Login"), email);
    type1(By.id("Password"), password);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div/form/div[3]/div/button"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/notifications/div/div/span")).getText(),
            equalTo("У вас нет прав доступа"));
  }

  public void authIncorrectPassword(String email, String password) throws InterruptedException {
    wd.get("http://test.ofd.ru/mk/login");
    TimeUnit.SECONDS.sleep(6);
    type1(By.id("Login"), email);
    type1(By.id("Password"), password);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div/form/div[3]/div/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/notifications/div/div/span")).getText(),
            equalTo("У вас нет прав доступа"));
  }

  public void authIncorrectUser(String email, String password) throws InterruptedException {
    wd.get("http://test.ofd.ru/mk/login");
    TimeUnit.SECONDS.sleep(6);
    type1(By.id("Login"), email);
    type1(By.id("Password"), password);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div/form/div[3]/div/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/notifications/div/div/span")).getText(),
            equalTo("У вас нет прав доступа"));
  }

  public void fieldFilterByINN() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(5);
    type1(By.xpath("//input[@id='Inn']"), "7724261610");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);

    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/div[1]/div[2]/div[1]")).getText(),
            equalTo("7724261610\nФЕДЕРАЛЬНОЕ ГОСУДАРСТВЕННОЕ УНИТАРНОЕ ПРЕДПРИЯТИЕ \"ПОЧТА РОССИИ\""));
    click(By.cssSelector("div.ofd-input__clear i.material-icons"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.cssSelector("div.ofd-input div.ofd-input__clear"));
  }

  public void fieldFilterByINNPartner() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(8);
    type1(By.xpath("//input[@id='PartnerInn']"), "5403341203");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertTrue(isElementPresent(By.xpath("//div[@title='ООО \"НОРДРЕГИОНПРОДУКТ\"']")));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[1]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[1]/div/div/i"));
  }

  public void fieldFilterByFN() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(8);
    type1(By.xpath("//input[@id='FnNumber']"), "0000099990789199");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    isElementVisible(By.xpath("//div[@title='Измеритель']"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/div[1]/div[2]/div[3]")).getText(),
            equalTo("0204240006025953"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/div[1]/div[2]/div[4]")).getText(),
            equalTo("0000099990789199"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[3]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[3]/div/div/i"));
  }

  public void fieldFilterIncorrectFN() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(8);
    type1(By.xpath("//input[@id='FnNumber']"), "0030099990789199");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertFalse(isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]")));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[3]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[3]/div/div/i"));
  }

  public void fieldFilterCashNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(8);
    type1(By.xpath("//input[@id='KktSerialNumber']"), "0493006104");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/div[1]/div[2]/div[3]")).getText(),
            equalTo("0493006104"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/div[1]/div[2]/div[4]")).getText(),
            equalTo("8710000100158682"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[4]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[4]/div/div/i"));
  }

  public void fieldFilterIncorrectCashNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(8);
    type1(By.xpath("//input[@id='KktSerialNumber']"), "0493556104");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertFalse(isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]")));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[4]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[4]/div/div"));
  }

  public void fieldFilterRegnumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(8);
    type1(By.xpath("//input[@id='KktRegNumber']"), "6125313683395011");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/div[1]/div[2]/div[2]")).getText(),
            equalTo("6125313683395011"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/div[1]/div[2]/div[4]")).getText(),
            equalTo("2999173844164911"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[5]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[5]/div/div"));
  }

  public void fieldFilterInvoiceNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(8);
    type1(By.xpath("//input[@id='BillNumber']"), "071002580603-23");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/div[1]/div[2]/div[1]")).getText(),
            equalTo("071002580603\nИндивидуальный предприниматель Курданов Караби Шамильевич"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[6]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/pos-filter/div/form/custom-input[6]/div/div"));
  }

  public void checkCheckSidebar() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//ng-component/div/div/div[3]/div[1]/div[5]/div[11]/a"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-tab-group/mat-tab-header/div[2]/div/div/div[1]/div")).getText(),
            equalTo("Информация"));
    assertThat(wd.findElement(By.xpath("//mat-tab-group/div/mat-tab-body[1]/div/single-pos-info/div/div[2]/h4[1]")).getText(),
            equalTo("Последний документ"));
    assertThat(wd.findElement(By.xpath("//mat-tab-group/div/mat-tab-body[1]/div/single-pos-info/div/div[2]/h4[2]")).getText(),
            equalTo("Последняя ошибка"));
    assertThat(wd.findElement(By.xpath("//mat-tab-group/div/mat-tab-body[1]/div/single-pos-info/div/div[2]/h4[3]")).getText(),
            equalTo("Просмотреть документ"));
    assertThat(wd.findElement(By.xpath("//mat-tab-group/div/mat-tab-body[1]/div/single-pos-info/div/div[2]/a[1]")).getText(),
            equalTo("Аудит по кассе"));
    click(By.xpath("//div[@class='pos-info']/div[2]/a[1]"));
    TimeUnit.SECONDS.sleep(7);
    ArrayList tabs2 = new ArrayList(wd.getWindowHandles());//Получение списка открытых окон браузера
    wd.switchTo().window((String) tabs2.get(1));//Переключение на второй таб в браузере
    assertThat(wd.findElement(By.xpath("//ng-component/div/div/div[2]/div[1]/div[1]/div[2]")).getText(),
            equalTo("Событие"));
    assertThat(wd.findElement(By.xpath("//ng-component/div/div/div[2]/div[1]/div[1]/div[1]")).getText(),
            equalTo("Дата"));
    assertThat(wd.findElement(By.xpath("//ng-component/div/div/div[2]/div[1]/div[1]/div[3]")).getText(),
            equalTo("Пользователь"));
    assertThat(wd.findElement(By.xpath("//ng-component/div/div/div[2]/div[1]/div[1]/div[4]")).getText(),
            equalTo("IP-адрес"));
    assertThat(wd.findElement(By.xpath("//ng-component/div/div/div[2]/div[1]/div[1]/div[5]")).getText(),
            equalTo("Сообщение"));
    assertThat(wd.findElement(By.xpath("//ng-component/div/div/div[2]/div[1]/div[1]/div[6]")).getText(),
            equalTo("Результат"));
    wd.close();//Закрытие активной вкладки браузера
    TimeUnit.SECONDS.sleep(2);
  }

  public void checkSectionActions() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(8);
    type1(By.id("FnNumber"), "6365864135553052");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//ng-component/div/div/div[3]/div[1]/div[2]/div[11]/a"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//ng-component/div/div[1]/div[2]/div[1]/button[1]/span")).getText(),
            equalTo("aspect_ratioПроверить регномер"));
    assertThat(wd.findElement(By.xpath("//ng-component/div/div[1]/div[2]/div[1]/button[2]/span")).getText(),
            equalTo("removeПеренести оплату на договор"));
    assertThat(wd.findElement(By.xpath("//ng-component/div/div[1]/div[2]/div[1]/button[3]/span")).getText(),
            equalTo("power_settings_newВключить приём чеков"));
    assertThat(wd.findElement(By.xpath("//ng-component/div/div[1]/div[2]/div[2]/button[1]/span")).getText(),
            equalTo("blockПрекратить обслуживание кассы"));
    assertThat(wd.findElement(By.xpath("//ng-component/div/div[1]/div[2]/div[2]/button[2]/span")).getText(),
            equalTo("delete_foreverУдалить кассу"));
    assertThat(wd.findElement(By.xpath("//ng-component/div/div[1]/div[2]/div[2]/button[3]/span")).getText(),
            equalTo("mode_editОтредактировать ЗН и ФН"));
    click(By.xpath("//ng-component/div/div[1]/div[2]/div[1]/button[1]"));
    type1(By.id("modalKktRegNumber"), "42324234");
    assertThat(wd.findElement(By.xpath("//check-reg-number/div/div[3]/button")).getCssValue("background-color"),
            equalTo("rgba(0, 190, 106, 1)"));
    click(By.xpath("//div[@class='ofd-modal__header-close ofd-pointer ofd-text_right ofd-text_fade ofd-text_h2']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//ng-component/div/div[1]/div[2]/div[2]/button[2]")).getText(),
            equalTo("delete_foreverУдалить кассу"));
    click(By.xpath("//ng-component/div/div[1]/div[2]/div[2]/button[3]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//h4[@class='ofd-text ofd-text_center ofd-text_h4 ofd-margin-top-10 ofd-margin-bottom-20']")).getText(),
            equalTo("Редактирование ЗН и ФН"));
    type1(By.id("posCopy?.KktSerialNumber"), "34234234");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//ng-component/modal/div/div[1]/div[2]/div/kkt-fn-change/div/div[4]/button")).getCssValue("background-color"),
            equalTo("rgba(0, 190, 106, 1)"));
    click(By.xpath("//div[@class='ofd-modal__header-close ofd-pointer ofd-text_right ofd-text_fade ofd-text_h2']"));
  }

  public void checkSectionDocIncorrectDoc() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(8);
    type1(By.id("KktSerialNumber"), "0493006104");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//ng-component/div/div/div[3]/div[1]/div[2]/div[11]/a"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.id("documentNumber"), "533977777777777");
    click(By.cssSelector("div.ofd-col_fit-right button.ofd-button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='pos__document']/div[1]/div[1]")).getText(),
            equalTo("Документ tab"));
    assertThat(wd.findElement(By.xpath("//div[@class='pos__document']/div[1]/div[2]")).getText(),
            equalTo("JSON tab"));
    assertThat(wd.findElement(By.xpath("//div[@class='pos__document']/div[1]/div[3]")).getText(),
            equalTo("TLV tab"));
    assertThat(wd.findElement(By.cssSelector("div.pos__document-doc p.ofd-text_center")).getText(),
            equalTo("Нет данных для отображения"));
    click(By.xpath("//div[@class='ofd-text_center']/div[2]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[2]/div/p")).getText(),
            equalTo("Нет данных для отображения"));
    click(By.xpath("//div[@class='ofd-text_center']/div[3]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[2]/div/p")).getText(),
            equalTo("Нет данных для отображения"));
    click(By.cssSelector("div.ofd-modal__header div.ofd-modal__header-close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkSectionDocWhereDocIsNull() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    //wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(8);
    type1(By.id("KktSerialNumber"), "0493006104");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//ng-component/div/div/div[3]/div[1]/div[2]/div[11]/a"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.id("documentNumber"), "554");
    click(By.cssSelector("div.ofd-col_fit-right button.ofd-button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='pos__document']/div[1]/div[1]")).getText(),
            equalTo("Документ tab"));
    assertThat(wd.findElement(By.xpath("//div[@class='pos__document']/div[1]/div[2]")).getText(),
            equalTo("JSON tab"));
    assertThat(wd.findElement(By.xpath("//div[@class='pos__document']/div[1]/div[3]")).getText(),
            equalTo("TLV tab"));
    assertThat(wd.findElement(By.cssSelector("div.pos__document-doc p.ofd-text_center")).getText(),
            equalTo("Нет данных для отображения"));
    click(By.xpath("//div[@class='ofd-text_center']/div[2]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.cssSelector("div.pos__document-json div.ofd-text_orange")).getText(),
            equalTo("DocumentNotFound"));
    click(By.xpath("//div[@class='ofd-text_center']/div[3]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.cssSelector("div.pos__document-json div.ofd-text_orange")).getText(),
            equalTo("DocumentNotFound"));
    click(By.cssSelector("div.ofd-modal__header div.ofd-modal__header-close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkClientsTab() throws InterruptedException {
    wd.get("http://test.ofd.ru/mk/clients");
    //wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("/html/body/app/div/header/div/div/div[1]/a[3]"));
    TimeUnit.SECONDS.sleep(4);
    type1(By.id("filter"), "ООО \"ДЕЛЬТА\"\n");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.cssSelector("div.ofd-table__row_none div.ofd-text_upper")).getText(),
            equalTo("ООО \"ДЕЛЬТА\""));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/form/custom-input/div/div/i"));
    isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[2]"));
    isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[3]"));
    isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[4]"));
    isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[5]"));
    click(By.xpath("//div[2]/default-select/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[3]/default-option[2]/div"));
    TimeUnit.SECONDS.sleep(5);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-table']/div[2]/div[8]/div")).getText(),
            equalTo("Рам."));
    click(By.xpath("//div[2]/default-select/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[3]/default-option[3]/div"));
    TimeUnit.SECONDS.sleep(5);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-table']/div[2]/div[8]/div")).getText(),
            equalTo("Тип."));
  }

  public void checkAddNewUserIndividMerch(String email, String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk/clients");
    //wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(8);
    click(By.cssSelector("div.ofd-col-4 button.ofd-button"));
    type1(By.id("Inn"), inn);
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.suggest__inn-helper div.ofd-pointer"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//default-select[@formcontrolname='ElectronicInvoicingType']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//default-select[@formcontrolname='ElectronicInvoicingType']/div/div/div[3]/default-option[2]"));
    type1(By.id("Settlement"), "Test sitiii");
    type1(By.id("Street"), "Lenina");
    type1(By.id("HouseNumber"), "64");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[3]/div[1]/div/label"));
    scrollToItem(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[6]/span"));
    type1(By.id("FullName"), "Testik Test");
    type1(By.id("Phone"), "89034567766");
    type1(By.id("Email"), email);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(10);
    type1(By.id("filter"), "503111739928\n");
    TimeUnit.SECONDS.sleep(4);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-table']/div[2]/div[5]")).getText(),
            equalTo(inn));
  }

  public void checkAddNewUserlegalEntity(String email, String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/clients");
    //wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(8);
    click(By.cssSelector("div.ofd-col-4 button.ofd-button"));
    type1(By.id("Inn"), inn);
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.suggest__inn-helper div.ofd-pointer"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//default-select[@formcontrolname='ElectronicInvoicingType']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//default-select[@formcontrolname='ElectronicInvoicingType']/div/div/div[3]/default-option[2]"));
    type1(By.id("Settlement"), "Москва");
    type1(By.id("HouseNumber"), "34");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[3]/div[1]/div/label"));
    scrollToItem(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[6]/span"));
    type1(By.id("FullName"), "Testik Test");
    type1(By.id("Phone"), "89034567766");
    type1(By.id("Email"), email);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(12);
    type1(By.id("filter"), "7906006886\n");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-table']/div[2]/div[5]")).getText(),
            equalTo(inn));
  }

  public void checkAddNewUserIncorrectINN(String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/clients?PageCount=100");
    //wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(8);
    click(By.cssSelector("div.ofd-col-4 button.ofd-button"));
    type1(By.id("Inn"), inn);
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.id("Inn")).getAttribute("value"),
            equalTo("123456789012"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[1]/div"));
  }

  public void checkAddNewUserCorrectINN(String email, String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/clients");
    //wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(10);
    click(By.cssSelector("div.ofd-col-4 button.ofd-button"));
    type1(By.id("Inn"), inn);
    type1(By.id("Kpp"), "7841432905836");
    TimeUnit.SECONDS.sleep(1);
    type1(By.id("CompanyName"), "Тестовая организация");
    type1(By.id("Name"), "Testеее Testеее");
    type1(By.id("Ogrn"), "2342354351903");
    click(By.xpath("//default-select[@formcontrolname='ElectronicInvoicingType']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//default-select[@formcontrolname='ElectronicInvoicingType']/div/div/div[3]/default-option[2]"));
    TimeUnit.SECONDS.sleep(1);
    type1(By.id("Position"), "Тест должность");
    scrollToItem(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/h4[1]"));
    type1(By.id("PostalCode"), "127300");
    click(By.xpath("//default-select[@formcontrolname='RegionCode']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//default-select[@formcontrolname='RegionCode']/div/div/div[3]/default-option[2]"));
    type1(By.id("Settlement"), "Test sitiii");
    type1(By.id("Street"), "Lenina");
    type1(By.id("HouseNumber"), "64");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[3]/div[1]/div/label"));
    scrollToItem(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[6]/span"));
    type1(By.id("FullName"), "Testik Test");
    type1(By.id("Phone"), "89034567766");
    type1(By.id("Email"), email);
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color"),
            equalTo("rgba(0, 190, 106, 1)"));
    click(By.cssSelector("div.ofd-modal__header div.ofd-modal__header-close"));
  }

  public void checkAddNewUserIncorrectZipcode(String email, String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk/clients?");
    //wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(5);
    click(By.cssSelector("div.ofd-col-4 button.ofd-button"));
    type1(By.id("Inn"), inn);
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.suggest__inn-helper div.ofd-pointer"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//default-select[@formcontrolname='ElectronicInvoicingType']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//default-select[@formcontrolname='ElectronicInvoicingType']/div/div/div[3]/default-option[2]"));
    type1(By.id("Settlement"), "Москва");
    type1(By.id("HouseNumber"), "34");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[3]/div[1]/div/label"));
    scrollToItem(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[6]/span"));
    type1(By.id("FullName"), "Testik Test");
    type1(By.id("Phone"), "89034567766");
    type1(By.id("Email"), email);
    assertThat(wd.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color"),
            equalTo("rgba(229, 233, 240, 1)"));
    click(By.cssSelector("div.ofd-modal__header div.ofd-modal__header-close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkUserAlreadyExists(String email, String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk/clients?");
    //wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(5);
    click(By.cssSelector("div.ofd-col-4 button.ofd-button"));
    type1(By.id("Inn"), inn);
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.suggest__inn-helper div.ofd-pointer"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//default-select[@formcontrolname='ElectronicInvoicingType']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//default-select[@formcontrolname='ElectronicInvoicingType']/div/div/div[3]/default-option[2]"));
    type1(By.id("Settlement"), "Москва");
    type1(By.id("Street"), "Test street");
    type1(By.id("HouseNumber"), "34");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[3]/div[1]/div/label"));
    scrollToItem(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[6]/span"));
    type1(By.id("FullName"), "Testik Test");
    type1(By.id("Phone"), "89034567766");
    type1(By.id("Email"), email);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/notifications/div/div/span")).getText(),
            equalTo("Данный клиент уже существует"));
    click(By.xpath("/html/body/app/div/notifications/div/div/i[2]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.ofd-modal__header div.ofd-modal__header-close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkAdditionConditions(String conNum) throws InterruptedException {
    TimeUnit.SECONDS.sleep(6);
    wd.get("http://test.ofd.ru/mk/clients");
    //wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(10);
    type1(By.id("filter"), "dsf@sdsdg.ru\n");
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//a[@class='ofd-col ofd-col_extra-1 ofd-col_middle ofd-pointer']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='mat-tab-labels']/div[3]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='ng-star-inserted']/button[@class='mat-raised-button']"));
    TimeUnit.SECONDS.sleep(1);
    type1(By.id("Number"), conNum);
    click(By.cssSelector("div.mydp div.selectiongroup"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@class='headertodaybtn headertodaybtnenabled ng-star-inserted']"));
    TimeUnit.SECONDS.sleep(1);
    type1(By.id("ContractDuration"), "5");
    type1(By.id("ContractSum"), "4500");
    click(By.xpath("//default-select[@formcontrolname='IsPostPay']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[6]/default-select/div/div/div[3]/default-option[1]/div"));
    TimeUnit.SECONDS.sleep(1);
    type1(By.id("PayPeriod"), "1");
    click(By.xpath("//default-select[@formcontrolname='FramePayPeriod']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[8]/default-select/div/div/div[3]/default-option[1]/div"));
    TimeUnit.SECONDS.sleep(1);
    type1(By.id("DaysToInvoicing"), "546465");
    type1(By.id("DaysToPay"), "1");
    type1(By.id("ResponsibleManager"), "Menegersss Testttt");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(5);
  }

  public void removeConditions() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='mat-tab-labels']/div[3]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//h3[@class='ofd-text ofd-text_h4']")).getText(),
            equalTo("Рамочные условия"));
    click(By.xpath("//div[@class='special-controls ng-star-inserted']/button[@class='mat-raised-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[@class='ofd-text ofd-text_m ofd-text_orange ofd-margin-right-10 ofd-pointer']"));
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk/clients");
    TimeUnit.SECONDS.sleep(10);
    type1(By.id("filter"), "dsf@sdsdg.ru\n");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//ng-component/div/div/div[5]/div[1]/div[2]/div[8]/div")).getText(),
            equalTo("Тип."));
  }

  public void registOnNewsTab(String email,String password) throws InterruptedException {
    //wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/news");
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='post-list']/article[1]//h2"));
    TimeUnit.SECONDS.sleep(2);
    type(By.id("Email"), email);
    type(By.id("Phone"), "89044561212");
    type(By.id("FullName"), "Юер Течт");
    click(By.xpath("//i[@class='material-icons']"));
    type(By.name("ExplicitPassword"), password);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/section/div/aside/div/div/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(7);
    assertThat(wd.findElement(By.xpath("//h4[@class='description user-reg__title']")).getText(),
            equalTo("Подтвердите регистрацию"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void registInvalidEmail(String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/news");
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/article[1]/div/div/div[1]/h2/a"));
    TimeUnit.SECONDS.sleep(1);
    type(By.id("Email"), "testofff@ofdru");
    type(By.id("Phone"), "89044561212");
    type(By.id("FullName"), "Юер Течт");
    click(By.xpath("//i[@class='material-icons']"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-form__input-group-error']")).getText(),
            equalTo("Некорректный E-Mail"));
    type(By.id("Email"), "testofffofd.ru");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-form__input-group-error']")).getText(),
            equalTo("Некорректный E-Mail"));
    type(By.id("Email"), "34636456");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-form__input-group-error']")).getText(),
            equalTo("Некорректный E-Mail"));
    type(By.id("Email"), "testofff@ofd.");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-form__input-group-error']")).getText(),
            equalTo("Некорректный E-Mail"));
  }

  public void registInvalidNumber(String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/news");
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/article[1]/div/div/div[1]/h2/a"));
    TimeUnit.SECONDS.sleep(1);
    type(By.id("Email"), "testofff@yopmail.com");
    type(By.id("FullName"), "Юер Течт");
    click(By.xpath("//i[@class='material-icons']"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-form__input-group-error']")).getText(),
            equalTo("Поле обязательно для заполнения"));
  }

  public void registInvalidPassword() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/news");
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/article[1]/div/div/div[1]/h2/a"));
    TimeUnit.SECONDS.sleep(1);
    type(By.id("Email"), "testofff@yopmail.com");
    type(By.id("Phone"), "89044561212");
    type(By.id("FullName"), "Юер Течт");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-form__input-group-error']")).getText(),
            equalTo("Поле обязательно для заполнения"));
  }

  public void registRusEmail(String email,String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/news");
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/article[1]/div/div/div[1]/h2/a"));
    TimeUnit.SECONDS.sleep(1);
    type(By.id("Email"), email);
    type(By.id("Phone"), "89044561212");
    type(By.id("FullName"), "Юер Течт");
    click(By.xpath("//i[@class='material-icons']"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(8);
    assertThat(wd.findElement(By.xpath("//h4[@class='description user-reg__title']")).getText(),
            equalTo("Подтвердите регистрацию"));
    click(By.xpath("//a[@href='/logout']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkBuySmsNotMoney() throws InterruptedException {
    click(By.xpath("//a[@href='/lk/balance']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@class='fw-btn fw-btn_xs fw-btn-primary getbalance']"));
    assertThat(wd.findElement(By.xpath("//h2[@class='fd-text fd-text_h4 fd-margin-top-55 fd-margin-bottom-20']")).getText(),
            equalTo("Способ оплаты"));
    click(By.xpath("//a[@href='/lk/balance']"));
    click(By.xpath("//button[@class='fw-btn fw-btn_xs fw-btn-primary buysms']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//h2[@class='color-info margin-bottom-40 font-size-26 line-height-26 text-center margin-bottom-60']")).getText(),
            equalTo("Выберите пакет сообщений"));
    click(By.xpath("/html/body/div[6]/div/div[2]/div/div[1]/div[2]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='Свой, от 1000 чеков по 1.65р за чек']"));
    click(By.xpath("/html/body/div[6]/div/div[2]/div/div[1]/div[2]"));
    TimeUnit.SECONDS.sleep(1);
    type(By.xpath("//input[@class='fd-input__field  ']"), "3424234");
    click(By.xpath("//button[@class='fw-btn fw-btn_sm fw-btn-primary']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//h1[@class='fd-text fd-text_h1 fd-text_center fd-margin-top-70 fd-margin-bottom-35']")).getText(),
            equalTo("Пополнение баланса"));
  }

  public void checkBuySmsEnoughMoney() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/lk/balance']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@class='fw-btn fw-btn_xs fw-btn-primary getbalance']"));
    assertThat(wd.findElement(By.xpath("//h2[@class='fd-text fd-text_h4 fd-margin-top-55 fd-margin-bottom-20']")).getText(),
            equalTo("Способ оплаты"));
    click(By.xpath("//a[@href='/lk/balance']"));
    click(By.xpath("//button[@class='fw-btn fw-btn_xs fw-btn-primary buysms']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//h2[@class='color-info margin-bottom-40 font-size-26 line-height-26 text-center margin-bottom-60']")).getText(),
            equalTo("Выберите пакет сообщений"));
    click(By.xpath("/html/body/div[6]/div/div[2]/div/div[1]/div[2]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='Минимальный (100 чеков) за 200 \u20BD']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@class='fw-btn fw-btn_sm fw-btn-primary']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("//div[@class='margin-top-35 margin-bottom-40 color-fade']/span[1]")).getText(),
            equalTo("С вашего баланса списано"));
    click(By.xpath("//button[@class='fw-btn fw-btn_md fw-btn-primary']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void fillingInUserForm() throws InterruptedException {
    TimeUnit.SECONDS.sleep(4);
    type(By.xpath("//input[@formcontrolname='inn']"), "2465122693");
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@role='listbox']"));
    TimeUnit.SECONDS.sleep(1);
    type(By.xpath("//input[@formcontrolname='PostalCode']"), "127288");
    click(By.xpath("//app-address/div/div[1]/table/tbody/tr[1]/td[2]/mat-form-field/div/div[1]/div"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='mat-select-content ng-trigger ng-trigger-fadeInContent']/mat-option[2]"));
    TimeUnit.SECONDS.sleep(1);
    type(By.xpath("//input[@formcontrolname='FullAddress']"), "Тестовый город Тестовая улица");
    click(By.xpath("//label[@class='mat-checkbox-layout']"));
    click(By.xpath("//app-registration//mat-card/form/table[2]/tbody/tr/td[2]/mat-form-field/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='mat-select-content ng-trigger ng-trigger-fadeInContent']/mat-option[2]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(10);
    assertThat(wd.findElement(By.xpath("//app-registration-agreement/div/mat-card/div[1]/div/h3[1]/strong")).getText(),
            equalTo("ОФЕРТА НА ЗАКЛЮЧЕНИЕ ДОГОВОРА\nКОММЕРЧЕСКОГО ПРЕДСТАВИТЕЛЬСТВА"));
    click(By.xpath("//label[@class='mat-checkbox-layout']"));
    click(By.xpath("//button[@class='mat-raised-button mat-primary']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("//app-registration/div/div[2]/div[1]/mat-card/div[1]/h2")).getText(),
            equalTo("Спасибо за регистрацию!"));
  }

  public void dashboardPageCheck() throws InterruptedException {
    wd.get("http://pk-test.ofd.ru/");
    TimeUnit.SECONDS.sleep(10);
    actions(By.xpath("//app-dashboard/div/div/div[1]/app-widget-summary/widget/div/div[2]/div/a[2]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//app-dashboard/div/div/div[1]/app-widget-summary/widget/div/div[2]/div/a[2]"));
    //assertThat(wd.findElement(By.xpath("//div[@class='pie-chart']/svg/g/text")).getText(), equalTo("57%"));
    assertThat(wd.findElement(By.xpath("//mat-table/mat-expansion-panel[5]/mat-expansion-panel-header/span/mat-row/mat-cell[3]")).getText(),
            equalTo("ИрискаПро"));
    click(By.xpath("//a[@href='/balance']"));
    click(By.xpath("//widget-actions[@class='widget-actions widget-actions-align-between']/button[1]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//app-deposit/app-deposit-content/div/div/div/h2")).getText(),
            equalTo("Пополнение баланса"));
    wd.navigate().refresh();
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//a[@href='/codes']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-tab-group/mat-tab-header/div[2]/div/div/div[1]")).getText(),
            equalTo("КОДЫ АКТИВАЦИИ"));
    click(By.xpath("//button[@class='_codes__header-select mat-raised-button mat-primary']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='mat-menu-content ng-trigger ng-trigger-fadeInItems']/button[1]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//app-create-code/div/div/div/h1")).getText(),
            equalTo("Создание кода активации"));
    click(By.xpath("//button[@class='mat-icon-button']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-tab-group/mat-tab-header/div[2]/div/div/div[1]")).getText(),
            equalTo("КОДЫ АКТИВАЦИИ"));
    click(By.xpath("//a[@href='']"));
  }

  public void balanceCheck() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/balance']"));
    scrollToItem(By.xpath("//app-balance/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]"));
    click(By.xpath("//app-balance-history/div/mat-table/mat-header-row/mat-header-cell[1]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//app-balance-history/div/mat-table/mat-row[1]/mat-cell[1]")).getText(),
            equalTo("17.11.2017"));
    click(By.xpath("//app-balance-history/div/mat-table/mat-header-row/mat-header-cell[1]"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//app-balance-history/div/mat-table/mat-header-row/mat-header-cell[2]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//app-balance-history/div/mat-table/mat-row[1]/mat-cell[2]")).getText(),
            equalTo("Агентское вознаграждение за Ноябрь 2017 г."));
    click(By.xpath("//app-balance-history/div/mat-table/mat-header-row/mat-header-cell[2]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//app-balance-history/div/mat-table/mat-row[1]/mat-cell[2]")).getText(),
            equalTo("Продажа ФН партнеру"));
    click(By.xpath("//app-balance-history/div/mat-table/mat-header-row/mat-header-cell[3]"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//widget-actions[@class='widget-actions widget-actions-align-between']/button[1]/span"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//mat-radio-button[@value='noncash']/label"));
    assertThat(wd.findElement(By.xpath("//button[@type='submit']/span[@class='mat-button-wrapper']/span")).getText(),
            equalTo("ВЫСТАВИТЬ СЧЕТ"));
    click(By.xpath("//mat-radio-button[@value='card']/label"));
    assertThat(wd.findElement(By.xpath("//button[@type='submit']/span[@class='mat-button-wrapper']/span")).getText(),
            equalTo("ПЕРЕЙТИ К ОПЛАТЕ"));
    type(By.name("amount"), "111");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(4);
    wd.switchTo().frame(wd.findElement(By.xpath("//iframe[@id='sbrf_frame']")));
    assertTrue(isElementPresent(By.xpath("//img[@src='img/sberbank.svg']")));
    assertThat(wd.findElement(By.xpath("//div[@class='sb_sbersafe-email-auth__descr']")).getText(),
            equalTo("По указанному адресу мы вышлем чек."));
    wd.switchTo().defaultContent();
    //wd.navigate().refresh();
    click(By.xpath("//div[@class='clear']//button[@class='mat-icon-button']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//div[@class='mat-tab-labels']/div[2]"));
    assertThat(wd.findElement(By.xpath("//app-cash-days/app-empty-page/div/div[2]/div")).getText(),
            equalTo("Список бонус-дней пуст"));
  }

  public void generalPageCheck() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/clients']"));
    type(By.name("searchString"), "631810\n");
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("//span[@class='companyname']")).getText(),
            equalTo("ЗАО \"РИКОН\""));
    type(By.name("searchString"), "рога\n");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//span[@class='companyname']")).getText(),
            equalTo("РОга и КОпыта"));
    type(By.name("searchString"), "впвапвак\n");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//app-clients-list/app-empty-page/div/div[2]/div")).getText(),
            equalTo("Список клиентов пуст"));
    wd.navigate().refresh();
    TimeUnit.SECONDS.sleep(4);
    click(By.xpath("//app-clients-list/div/mat-table/mat-header-row/mat-header-cell[1]/app-sort-header/div"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-row[1]/mat-cell[1]/span")).getText(),
            equalTo("Sweet Iris"));
    click(By.xpath("//app-clients-list/div/mat-table/mat-header-row/mat-header-cell[2]/app-sort-header/div"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-row[1]/mat-cell[2]")).getText(),
            equalTo("0326492005"));
    click(By.xpath("//app-clients-list/div/mat-table/mat-header-row/mat-header-cell[3]/app-sort-header/div"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-row[1]/mat-cell[3]")).getText(),
            equalTo("0"));
    click(By.xpath("//mat-table/mat-row[1]/mat-cell[1]"));
    TimeUnit.SECONDS.sleep(5);
    assertThat(wd.findElement(By.xpath("//mat-sidenav-container/mat-sidenav/div/div/h3")).getText(),
            equalTo("Фильтры"));
    assertThat(wd.findElement(By.xpath("//app-cashbox-list/div/app-content/div/div[2]" +
                    "/mat-sidenav-container/mat-sidenav/div/app-filter/div/div[1]/div/mat-form-field/div/div[1]/div/input")).getAttribute("value"), equalTo("Sweet Iris"));
    click(By.xpath("//a[@href='/clients']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//a[@class='mat-icon-button']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//app-page-content[1]/app-client-card-header/div/div/h2")).getText(),
            equalTo("ЗАКРЫТОЕ АКЦИОНЕРНОЕ ОБЩЕСТВО \"АЙКО\""));
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-info-block-body']/p[1]")).getText(),
            equalTo("ИНН 1655166016"));
  }

  public void createNewUser(String email, String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/clients']"));
    click(By.xpath("//a[@href='/clients/add']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.xpath("//input[@formcontrolname='email']"), email);
    type(By.xpath("//input[@formcontrolname='phone']"), "89041234465");
    type(By.xpath("//input[@formcontrolname='fullName']"), "Test user");
    type(By.xpath("//input[@formcontrolname='inn']"), inn);
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.autocomplete-inn mat-option.mat-option"));
    TimeUnit.SECONDS.sleep(1);
    type(By.xpath("//input[@formcontrolname='PostalCode']"), "127289");
    click(By.xpath("//app-address/div/div[1]/table/tbody/tr[1]/td[2]/mat-form-field/div/div[1]"));
    TimeUnit.SECONDS.sleep(2);

    click(By.xpath("//div[@class='cdk-overlay-container']//mat-option[2]"));
    TimeUnit.SECONDS.sleep(1);
    type(By.xpath("//input[@formcontrolname='FullAddress']"), "Москва");
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//div[@class='cdk-overlay-container']//mat-option[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//label[@class='mat-checkbox-layout']"));
    click(By.xpath("//mat-card/form/table[3]/tbody/tr/td/mat-form-field/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='cdk-overlay-container']//mat-option[3]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(10);
    assertThat(wd.findElement(By.xpath("//app-clients-add/div/div[2]/div/mat-card/div[1]/h2")).getText(),
            equalTo("Ваш новый клиент ООО \"ТАЙЛЕКС\"\nуспешно зарегистрирован"));
    click(By.xpath("//a[@class='mat-raised-button mat-primary']"));
    TimeUnit.SECONDS.sleep(3);
    type(By.name("searchString"), inn + "\n");
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("//app-clients-list/div/mat-table/mat-row/mat-cell[2]")).getText(),
            equalTo(inn));
    click(By.xpath("//app-clients-list/div/mat-table/mat-row/mat-cell[4]/a/span/mat-icon"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//app-client-card-information/mat-card/div[1]/div[2]/div[2]/p[1]")).getText(),
            equalTo("127289, Москва"));
    assertThat(wd.findElement(By.xpath("//app-client-card-information/mat-card/div[1]/div[1]/div[2]/p[1]")).getText(),
            equalTo("ИНН " + inn));
    assertThat(wd.findElement(By.xpath("//app-client-card-information/mat-card/div[2]/div[1]/div[2]/p[1]/a")).getText(),
            equalTo(email));
  }

  public void checkCashTab() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/kkt']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//app-list-table/div/div/mat-accordion/mat-table/mat-header-row/mat-header-cell[1]"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[3]")).getText(),
            equalTo("ИрискаПро"));
    click(By.xpath("//app-list-table/div/div/mat-accordion/mat-table/mat-header-row/mat-header-cell[2]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[2]/span[2]")).getText(),
            equalTo("Касса не готова к работе"));
    click(By.xpath("//app-list-table/div/div/mat-accordion/mat-table/mat-header-row/mat-header-cell[2]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[2]/span[2]")).getText(),
            equalTo("Прекращено обслуживание"));
    click(By.xpath("//app-list-table/div/div/mat-accordion/mat-table/mat-header-row/mat-header-cell[3]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[3]")).getText(),
            equalTo("Sweet Iris"));
    click(By.xpath("//app-list-table/div/div/mat-accordion/mat-table/mat-header-row/mat-header-cell[3]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[3]")).getText(),
            equalTo("РОга и КОпыта"));
  }

  public void checkSearchCash() throws InterruptedException {
    type(By.name("search"), "9999000052527474\n");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[3]")).getText(),
            equalTo("Ириска"));
    type(By.name("search"), "00000000381007313068\n");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[3]")).getText(),
            equalTo("ИрискаПро"));
    type(By.name("search"), "34534\n");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//app-list-table/app-empty-page/div/div[2]/div")).getText(),
            equalTo("У ваших клиентов нет зарегистрированных касс"));
    click(By.xpath("//a[@href='/clients']"));
    click(By.xpath("//a[@href='/kkt']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("mat-icon._cashbox-list__header-options-tune"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//mat-sidenav/div/app-filter/div/div[2]/div[1]/div[4]/div[1]/mat-checkbox"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[2]/span[2]")).getText(),
            equalTo("Прекращено обслуживание"));
    click(By.xpath("//mat-sidenav/div/app-filter/div/div[2]/div[1]/div[4]/div[1]/mat-checkbox"));
    click(By.xpath("//mat-sidenav/div/app-filter/div/div[2]/div[1]/div[2]/div[1]/mat-checkbox"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[2]/span[2]")).getText(),
            equalTo("Касса не готова к работе"));
  }

  public void checkAddCash() throws InterruptedException {
    click(By.cssSelector("button.mat-raised-button"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("KktSerialNumber"), "6783451218");
    type(By.name("FnSerialNumber"), "0001112423734441");
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//app-create-kkt/div/div[1]/form/div[4]/div[2]/button"));
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//mat-tab-group/mat-tab-header/div[2]/div/div/div[2]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-table/mat-row[1]/mat-cell[1]/div/span")).getText(),
            equalTo("6783451218"));
    actions(By.xpath("//app-booking-table/div/div/mat-table/mat-row[1]/mat-cell[3]/div/span[3]"));
    click(By.xpath("//app-booking-table/div/div/mat-table/mat-row[1]/mat-cell[3]/div/span[3]/mat-icon"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//app-booking-table/div/div/mat-table/mat-row[1]/mat-cell[3]/div/span[2]/button[1]"));
    TimeUnit.SECONDS.sleep(2);
    click(By.cssSelector("button.mat-raised-button"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("KktSerialNumber"), "44444444444467785856");
    type(By.name("FnSerialNumber"), "5475475756856956");
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//app-create-kkt/div/div[1]/form/div[4]/div[2]/button"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("//snack-bar-container/simple-snack-bar")).getText(),
            equalTo("ККТ уже зарегистрирована\nзакрыть"));
    click(By.xpath("//snack-bar-container/simple-snack-bar/button"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//app-fs-dialog-container/div/div[1]/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void checkActivationCode() throws InterruptedException {
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//mat-tab-group/mat-tab-header/div[2]/div/div/div[1]"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='_expansion__activation-check ofd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    type(By.xpath("//input[@placeholder='Код активации']"), "fgdg435345f");
    click(By.xpath("//app-activate-kkt/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//app-fs-dialog-container/div/div[1]/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]/div/div/div/div[6]/div[1]/span[3]")).getText(),
            equalTo("оплачена до —"));
  }

  public void checkActivationCodeTab() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/codes']"));
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//mat-accordion/mat-table/mat-header-row/mat-header-cell[1]/app-sort-header"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[1]")).getText(),
            equalTo("21.11.2017"));
    click(By.xpath("//mat-accordion/mat-table/mat-header-row/mat-header-cell[2]/app-sort-header"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[2]")).getText(),
            equalTo("26HHKN62"));
    click(By.xpath("//mat-accordion/mat-table/mat-header-row/mat-header-cell[3]/app-sort-header"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[3]")).getText(),
            equalTo("1 кассо-дней"));
    click(By.xpath("//mat-accordion/mat-table/mat-header-row/mat-header-cell[4]/app-sort-header"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[4]")).getText(),
            equalTo("Доступен"));
  }

  public void checkFilterCode() throws InterruptedException {
    click(By.xpath("//app-codes/div/app-content/div/div[1]/div/div[2]/div[3]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//mat-sidenav/div/div[2]/mat-radio-group/div[2]/mat-radio-button/label"));
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//mat-table[@class='mat-table']/mat-header-row/mat-header-cell[4]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-table/mat-expansion-panel[1]//mat-cell[4]/span/span")).getText(),
            equalTo("Использован 12.04.2018"));
    click(By.xpath("//mat-sidenav/div/div[2]/mat-radio-group/div[3]/mat-radio-button/label"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("//mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[4]/span")).getText(),
            equalTo("Доступен"));
  }

  public void checkPageCode() throws InterruptedException {
    click(By.xpath("//app-codes/div/app-content/div/div[1]/div/div[2]/div[1]/button"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='cdk-overlay-container']/div[2]/div/div/button[1]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//app-create-code/div/div/div/h1")).getText(),
            equalTo("Создание кода активации"));
    click(By.xpath("//button[@class='mat-icon-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//app-codes/div/app-content/div/div[1]/div/div[2]/div[1]/button"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='cdk-overlay-container']/div[2]/div/div/button[2]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//app-create-discount/div/form/h1")).getText(),
            equalTo("Создание кода на скидку"));
    click(By.xpath("//button[@class='mat-icon-button']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkDiscountCodeTab() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/codes']"));
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//mat-tab-group/mat-tab-header/div[2]/div/div/div[2]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//mat-accordion/mat-table/mat-header-row/mat-header-cell[1]/app-sort-header"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[1]")).getText(),
            equalTo("27.11.2017"));
    click(By.xpath("//mat-accordion/mat-table/mat-header-row/mat-header-cell[2]/app-sort-header"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[2]")).getText(),
            equalTo("IM2K9OCW"));
    click(By.xpath("//mat-accordion/mat-table/mat-header-row/mat-header-cell[3]/app-sort-header"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[3]")).getText(),
            equalTo("4%"));
    actions(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/div[1]/i[2]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//mat-table/mat-expansion-panel[1]/div/div/div/p/span")).getText(),
            equalTo("СОХРАНИТЬ"));
  }

  public void checkPageDiscountCode() throws InterruptedException {
    click(By.xpath("//app-codes/div/app-content/div/div[1]/div/div[2]/div[1]/button"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='cdk-overlay-container']/div[2]/div/div/button[2]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//app-create-discount/div/form/h1")).getText(),
            equalTo("Создание кода на скидку"));
    click(By.xpath("//button[@class='mat-icon-button']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkHelpOldUser()throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//*[text()='yaschenko@ofd.ru']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[1]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//*[text()='yaschenko@ofd.ru']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-links']/li[3]"));
    TimeUnit.SECONDS.sleep(4);
    assertThat(wd.findElement(By.xpath("//div[@id='doc-page']/div[1]//span")).getText(),
              equalTo("Ваши закрывающие документы"));
    click(By.xpath("//div[@id='doc-page']/div[13]/div[1]/a"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@class='fw-card-body']/div[1]/span[1]")).getText(),
              equalTo("В личном кабинете для вас доступны закрывающие документы за прошедшие периоды."));
    click(By.xpath("//*[text()='Понятно']"));
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("//div[@class='fd-select']/div[1]/div/div[1]/span[1]"));
    click(By.xpath("//div[@id='doc-page']/div[13]/div[3]/span[2]"));
    assertThat(wd.findElement(By.xpath("//div[@id='doc-page']/div[13]/div[3]/p")).getText(),
            equalTo("Вам необходимо зайти во вкладку «Документы». Копии закрывающих документов размещаются в " +
                    "данной вкладке в течение 15 дней с даты окончания месяца, в котором денежные средства были зачислены на Лицевой счет."));
    click(By.xpath("//div[@id='doc-page']/div[13]/div[4]/span[2]"));
    assertThat(wd.findElement(By.xpath("//div[@id='doc-page']/div[13]/div[4]/p")).getText(),
              equalTo("Копии закрывающих документов появляются во вкладке «Документы» в течение 15 дней с даты окончания месяца, " +
                      "в котором денежные средства были зачислены на Лицевой счет. " +
                      "Если по истечении 15 дней документы не появились, " +
                      "напишите, пожалуйста, на электронную почту feedback@ofd.ru"));
    click(By.xpath("//div[@id='doc-page']/div[13]/div[5]/span[2]"));
    assertThat(wd.findElement(By.xpath("//div[@id='doc-page']/div[13]/div[5]/p")).getText(),
              equalTo("Для исправления закрывающих документов, напишите, пожалуйста, на электронную почту feedback@ofd.ru, письмо с описанием ошибки."));
    click(By.xpath("//div[@id='doc-page']/div[13]/div[6]/span[2]"));
    assertThat(wd.findElement(By.xpath("//div[@id='doc-page']/div[13]/div[6]/p")).getText(),
              equalTo("Чтобы получить оригиналы документов, напишите, пожалуйста, нам письмо на электронную почту feedback@ofd.ru " +
                      "с темой «Получить документы», укажите название и ИНН вашей организации, период и тип документов, которые вам нужны. " +
                      "Срок обработки запроса – 3 недели. Перед запросом просим вас проверить правильность выставленных документов" +
                      " в вашем личном кабинете. Оригиналы документов в бумажном виде отправляются Почтой России по запросу " +
                      "не чаще одного раза в квартал."));
  }

  public void checkHelpNewUser()throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-links']/li[3]"));
    TimeUnit.SECONDS.sleep(4);
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[4]/div[1]/a"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[1]/span[1]")).getText(),
            equalTo("В личном кабинете для вас доступны закрывающие документы за прошедшие периоды."));
    click(By.xpath("/html/body/div[6]/div/div[3]/div/a"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[4]/div[3]/span[2]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[4]/div[3]/p")).getText(),
            equalTo("Вам необходимо зайти во вкладку «Документы». " +
                    "Копии закрывающих документов размещаются в данной вкладке в течение 15 дней с даты окончания месяца, " +
                    "в котором денежные средства были зачислены на Лицевой счет."));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[4]/div[4]/span[2]"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[4]/div[4]/p")).getText(),
            equalTo("Копии закрывающих документов появляются во вкладке «Документы» в течение 15 дней с даты окончания месяца, " +
                    "в котором денежные средства были зачислены на Лицевой счет. " +
                    "Если по истечении 15 дней документы не появились, " +
                    "напишите, пожалуйста, на электронную почту feedback@ofd.ru"));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[4]/div[5]/span[2]"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[4]/div[5]/p")).getText(),
            equalTo("Для исправления закрывающих документов, напишите, пожалуйста, на электронную почту feedback@ofd.ru, письмо с описанием ошибки."));
    click(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[4]/div[6]/span[2]"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[4]/div[6]/p")).getText(),
            equalTo("Чтобы получить оригиналы документов, напишите, пожалуйста, нам письмо на электронную почту feedback@ofd.ru " +
                    "с темой «Получить документы», укажите название и ИНН вашей организации, период и тип документов, которые вам нужны. " +
                    "Срок обработки запроса – 3 недели. Перед запросом просим вас проверить правильность выставленных документов" +
                    " в вашем личном кабинете. Оригиналы документов в бумажном виде отправляются Почтой России по запросу " +
                    "не чаще одного раза в квартал."));

  }

  public void checkPurchaseCode() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/codes']"));
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//app-codes/div/app-content/div/div[1]/div/div[2]/div[1]/button"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='cdk-overlay-container']/div[2]/div/div/button[1]"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("numberOfDays"), "500");
    type(By.name("numberOfCodes"), "100");
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//app-create-code/div/div/div/div[5]/button/span/span")).getText(),
            equalTo("ОПЛАТИТЬ"));
    type(By.name("numberOfDays"), "5");
    type(By.name("numberOfCodes"), "1");
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//button[@class='text-upper mat-button mat-primary']"));
    TimeUnit.SECONDS.sleep(6);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[3]")).getText(),
            equalTo("5 кассо-дней"));
  }

  public void checkPurchaseDiscountCode() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/codes']"));
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//app-codes/div/app-content/div/div[1]/div/div[2]/div[1]/button"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='cdk-overlay-container']/div[2]/div/div/button[2]"));
    TimeUnit.SECONDS.sleep(2);
    type(By.xpath("//input[@formcontrolname='MaxNumberOfUses']"), "2");
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//mat-tab-group/mat-tab-header/div[2]/div/div/div[2]"));
    assertThat(wd.findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-row/mat-cell[3]/span[1]")).getText(),
            equalTo("1%"));
    actions(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[1]/mat-expansion-panel-header/span/div[1]/i[1]"));
    TimeUnit.SECONDS.sleep(3);
  }

  public void checkBookingCash() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/kkt']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("button.mat-raised-button"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("KktSerialNumber"), "6783451218");
    type(By.name("FnSerialNumber"), "0001112423734441");
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//app-create-kkt/div/div[1]/form/div[4]/div[2]/button"));
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//mat-tab-group/mat-tab-header/div[2]/div/div/div[2]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-table/mat-row[1]/mat-cell[1]/div/span")).getText(),
            equalTo("6783451218"));
    actions(By.xpath("//app-booking-table/div/div/mat-table/mat-row[1]/mat-cell[3]/div/span[3]"));
    click(By.xpath("//app-booking-table/div/div/mat-table/mat-row[1]/mat-cell[3]/div/span[3]/mat-icon"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//app-booking-table/div/div/mat-table/mat-row[1]/mat-cell[3]/div/span[2]/button[1]"));
    TimeUnit.SECONDS.sleep(2);
    click(By.cssSelector("button.mat-raised-button"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("KktSerialNumber"), "44444444444467785856");
    type(By.name("FnSerialNumber"), "5475475756856956");
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//app-create-kkt/div/div[1]/form/div[4]/div[2]/button"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("//snack-bar-container/simple-snack-bar")).getText(),
            equalTo("ККТ уже зарегистрирована\nзакрыть"));
    click(By.xpath("//snack-bar-container/simple-snack-bar/button"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//app-fs-dialog-container/div/div[1]/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void checkDocsPage() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/docs']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-tab-group/mat-tab-header/div[2]/div/div/div[1]")).getText(),
            equalTo("ЗАКРЫВАЮЩИЕ ДОКУМЕНТЫ"));
    click(By.xpath("//mat-tab-group/mat-tab-header/div[2]/div/div/div[2]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//mat-card[@class='mat-card']/div[@class='doc-header']")).getText(),
            equalTo("Оферта партнера"));
  }

  public void checkHelpPage() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//a[@href='/help']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@class='mat-tab-body-wrapper']//span")).getText(),
            equalTo("OFD_PK_short_manual_v2.0beta.pdf"));
    click(By.xpath("//div[@class='mat-tab-labels']/div[2]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-container _instructions']//span")).getText(),
            equalTo("Интернет-баннер. Формат: 400х240 px"));
  }

  public void checkProfile() throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get("https://pk-demo.ofd.ru/");
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//ul[@class='header-profile-nav-accounts']/li[19]"));
    TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='mat-toolbar-layout']//button[@class='mat-button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//a[@href='/profile']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//a[@href='/profile/edit']"));
    TimeUnit.SECONDS.sleep(2);
    type(By.xpath("//input[@formcontrolname='bankIdentifierCode']"), "0445625225");
    type(By.xpath("//input[@formcontrolname='bankName']"), "Test Bank");
    type(By.xpath("//input[@formcontrolname='accountNumber']"), "34534534547657856546");
    type(By.xpath("//input[@formcontrolname='bankCorrespondentAccount']"), "70497458793879403967");
    click(By.xpath("//app-address//table/tbody/tr[3]/td/mat-checkbox/label"));
    TimeUnit.SECONDS.sleep(1);
    invisibleElement(By.xpath("//app-address/div/div[2]/table/thead/tr/td"));
    clear(By.xpath("//input[@formcontrolname='Name']"));
    TimeUnit.SECONDS.sleep(1);
    clear(By.xpath("//input[@formcontrolname='Position']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//mat-card/form/table[3]/tbody/tr[2]/td/div[2]/mat-radio-group/mat-radio-button[2]/label"));
    click(By.xpath("//mat-card/form/table[3]/tbody/tr[2]/td/div[2]/mat-radio-group/mat-radio-button[1]/label"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("//mat-card/form/table[3]/tbody/tr[1]/td[1]/mat-form-field/div/div[3]/div/mat-error")).getText(),
            equalTo("Поле обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("//mat-card/form/table[3]/tbody/tr[1]/td[2]/mat-form-field/div/div[3]/div/mat-error")).getText(),
            equalTo("Поле обязательно для заполнения"));
    type(By.xpath("//input[@formcontrolname='Name']"), "Козлюк Ольга Сергеевна");
    type(By.xpath("//input[@formcontrolname='Position']"), "Генеральный директор");
    click(By.xpath("//tbody/tr[2]/td/div[2]/mat-radio-group/mat-radio-button[2]/label"));
  }

  public void checkProfileEmployees(String email2) throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("https://pk-demo.ofd.ru/employees");
    TimeUnit.SECONDS.sleep(7);
    click(By.cssSelector("div._employees__header-options button.mat-raised-button"));
    TimeUnit.SECONDS.sleep(2);

    type(By.xpath("//input[@placeholder = 'Телефон']"), "89781231212");
    type(By.xpath("//input[@placeholder = 'Фамилия Имя']"), "Test Name Epta");
    click(By.xpath("//div[@class='_employeer__access-section']/div[1]/div/mat-checkbox/label"));
    assertThat(wd.findElement(By.xpath("//button[@class='mat-raised-button mat-primary']")).getCssValue("background-color"),
            equalTo("rgba(0, 0, 0, 0.12)"));

    type(By.xpath("//input[@placeholder = 'E-mail']"), "testmail@mailru");
    type(By.xpath("//input[@placeholder = 'Телефон']"), "89781231212");
    type(By.xpath("//input[@placeholder = 'Фамилия Имя']"), "Test Name Epta");
    click(By.xpath("//div[@class='_employeer__access-section']/div[1]/div/mat-checkbox/label"));
    click(By.xpath("//button[@class='mat-raised-button mat-primary']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//simple-snack-bar[@class='mat-simple-snackbar']")).getText(),
            equalTo("The Email field is not a valid e-mail address.\nзакрыть"));
    click(By.xpath("//button[@class='mat-simple-snackbar-action']"));

    type(By.xpath("//input[@placeholder = 'E-mail']"), "testemployee11@yopmail.com");
    type(By.xpath("//input[@placeholder = 'Телефон']"), "82751231112");
    type(By.xpath("//input[@placeholder = 'Фамилия Имя']"), "Tert Bame Epta");
    click(By.xpath("//button[@class='mat-raised-button mat-primary']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//simple-snack-bar[@class='mat-simple-snackbar']")).getText(),
            equalTo("EmailAlreadyRegistered\nзакрыть"));
    click(By.xpath("//button[@class='mat-simple-snackbar-action']"));

    type(By.xpath("//input[@placeholder = 'E-mail']"), email2);
    type(By.xpath("//input[@placeholder = 'Телефон']"), "82751231112");
    type(By.xpath("//input[@placeholder = 'Фамилия Имя']"), "Tert Bame Epta");
    click(By.xpath("//div[@class='_employeer__access-section']/div[1]/div/mat-checkbox/label"));
    click(By.xpath("//div[@class='_employeer__access-section']/div[3]/div/mat-checkbox/label"));
    click(By.xpath("//button[@class='mat-raised-button mat-primary']"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("//mat-expansion-panel[2]//mat-cell[3]")).getText(),
            equalTo(email2));
    click(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[2]/mat-expansion-panel-header"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//div[@class='_subtable__access']/div[1]/div[1]/div/mat-checkbox/label/div/div[3]")).getCssValue("background-color"),
            equalTo("rgba(0, 190, 106, 1)"));
    assertThat(wd.findElement(By.xpath("//div[@class='_subtable__access']/div[4]/div[3]/div/mat-checkbox/label/div/div[3]")).getCssValue("background-color"),
            equalTo("rgba(0, 190, 106, 1)"));
  }

  public void confirmRegEmployee(String email, String link) throws InterruptedException {
    TimeUnit.SECONDS.sleep(5);
    wd.get(link);
    TimeUnit.SECONDS.sleep(2);
    String password1 =
            wd.findElement(By.xpath("//td[@align='center']/table/tbody/tr[2]/td/p/span[2]")).getText();
    click(By.xpath("//td[@align='center']/table/tbody/tr[3]/td/a"));
    TimeUnit.SECONDS.sleep(5);
    ArrayList tabs2 = new ArrayList(wd.getWindowHandles());//Получение списка открытых окон браузера
    wd.switchTo().window((String) tabs2.get(0));//Переключение на второй таб в браузере
    wd.close();
    wd.switchTo().window((String) tabs2.get(1));//Переключение на второй таб в браузере
    TimeUnit.SECONDS.sleep(5);
    //type(By.name("Login"), email);
    //type(By.name("Password"), password1);
    //click(By.xpath("//section[1]/div[2]/div/div[2]/form/button"));
    //TimeUnit.SECONDS.sleep(5);
    click(By.xpath("//div[@class='navbar-item header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
    type(By.name("Login"), email);
    type(By.name("Password"), password1);
    click(By.xpath("//section[1]/div[2]/div/div[2]/form/button"));
    TimeUnit.SECONDS.sleep(10);
    assertThat(wd.findElement(By.xpath("//button[@class='mat-button']/span/span")).getText(),
            equalTo(email));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//button[@class='mat-button']"));
    click(By.linkText("Выход"));
  }

  public void deleteNewEmployee() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("https://pk-demo.ofd.ru/employees");
    TimeUnit.SECONDS.sleep(7);
    click(By.xpath("//mat-accordion/mat-table/mat-expansion-panel[2]/mat-expansion-panel-header"));
    click(By.xpath("//mat-table/mat-expansion-panel[2]/div/div/div/div[2]/div/span"));
    TimeUnit.SECONDS.sleep(2);
    click(By.cssSelector("div._employeer__footer div.ofd-pointer"));
    TimeUnit.SECONDS.sleep(2);
  }

}
