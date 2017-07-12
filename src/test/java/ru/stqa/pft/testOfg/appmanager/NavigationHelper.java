package ru.stqa.pft.testOfg.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertFalse;


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
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/p[2]/a"));
  }

  public void goToEditPhone() {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/p[2]/a"));
  }

  public void goToEditLegalAddress() {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/p[2]/a"));
  }

  public void goToProfileEdit() {
    click(By.xpath("//span[@class='org fd-text_va-middle fd-padding-right-5']/span[1]"));
    click(By.xpath("//div[@class='header-toggle__inner-line fd-text fd-text_m']/span"));
    assertThat(wd.findElement(By.xpath("//p[@class='text text_m font-size-14 color-fade margin-bottom-5']"))
            .getText(), equalTo("Является ли организация плательщиком НДС?"));
  }

  public void submit1() {
    click(By.xpath("//div[@class='fd-text_right']//button[.='Сохранить']"));
  }

  public void submitFullName() {
    click(By.xpath("//div[@class='profile__inline']/button[@type='submit']"));
  }

  public void submitPhone() {
    click(By.xpath("//div[@class='profile__inline']/button[@type='submit']"));
  }

  public void submitFront79() {
    waitTheElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/p[1]"), "170005, Бежецк, школьная, 85, корп/стр: 1, офис/кв: 1");
    waitTheElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/p[1]"), "170005, Бежецк, школьная, 85, корп/стр: 1, офис/кв: 1");
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/p[1]")).getText(),
            equalTo("170005, Бежецк, школьная, 85, корп/стр: 1, офис/кв: 1"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/p[1]")).getText(),
            equalTo("170005, Бежецк, школьная, 85, корп/стр: 1, офис/кв: 1"));
  }

  public void submitFront77() {
    waitTheElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/p[1]"), "420095, Казань, ул Восход, 5, корп/стр: 3, офис/кв: 7");
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/p[1]")).getText(),
            equalTo("420095, Казань, ул Восход, 5, корп/стр: 3, офис/кв: 7"));
  }

  public void submitFront78() {
    waitTheElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/p[1]"), "140095, Тула, ул Восход, 67, корп/стр: 1, офис/кв: 94");
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/p[1]")).getText(),
            equalTo("140095, Тула, ул Восход, 67, корп/стр: 1, офис/кв: 94"));
  }

  public void submitFront82() throws InterruptedException {
    assertThat(wd.findElement(By.xpath("//div[@class='profile__col']/div/h2[@class='font-size-20 text text_title-h2 color-info']")).getText(),
            equalTo("Иванов Птр Птрович"));
  }

  public void submitFront83() {
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/h2")).getText(),
            equalTo("89021112244"));
  }

  public void signOut() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("//span[@class='org fd-text_va-middle fd-padding-right-5']/span[1]"));
    click(By.xpath("//a[@class='fd-text fd-text_m']"));
    TimeUnit.SECONDS.sleep(1);
    //wd.navigate().refresh();
  }

  public void clickButtonConnect() {
    click(By.cssSelector("div.fw-cols-2 a.analytics-registration"));
  }

  public void selectWorkflow() throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[3]/div/div[1]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='Диадок']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[3]/div/div[1]/div/div/div[1]/div[1]/div[2]")).getText(),
            equalTo("Диадок"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[3]/div/div[1]/div/div"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void clickVAT() {
    click(By.xpath("//div[@data-reactid='.0.1.1.1.0.1.$0.2.0.1.1.1.0']"));
    Assert.assertTrue(isElementVisible(By.xpath("//div[@class='fw-label fw-label_success fw-label_size-static ']")));
    click(By.xpath("//div[@data-reactid='.0.1.1.1.0.1.$0.2.0.1.1.0.0']"));
    Assert.assertTrue(isElementVisible(By.xpath("//div[@class='fw-label fw-label_success fw-label_size-static ']")));
  }

  public void clickAddedCashMachine() {
    click(By.cssSelector("div.navbar-item a.btn-primary"));
  }

  public void clickMainLabel() {
    click(By.cssSelector("a.logo"));
  }

  public void checkingFormDocuments() {
    click(By.xpath("//a[@href='/lk/documents']"));
    Assert.assertTrue(isElementPresent(By.cssSelector("div.fw-col-11 span.vertical-align-middle"))
            && isElementPresent(By.cssSelector("div.fw-col-11 span.color-fade")));

  }

  public void addCashRegister() {
    click(By.xpath("//a[@href='/lk/downloads']"));
  }

  public void clickCashMachinePage() {
    click(By.xpath("//div[1]/a[2]"));
    click(By.xpath("//div[2]/div/div[1]/div/a/span"));
  }

  public void checkingCashMachinePage() {
    assertThat(wd.findElement(By.cssSelector("div.fw-card-body h2.font-size-24")).getText(), equalTo("Договор с OFD.RU"));
    scrollToItem(By.xpath("//div[@class='fw-card-body']/h3"));
    assertThat(wd.findElement(By.xpath("//div[@class='fw-card-body']/h3")).getText(), equalTo("Касса"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div[1]")).getText(),
            equalTo("Заводской номер кассы"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div[2]/div[3]/div/div/div[1]/div[3]/div[1]")).getText(),
            equalTo("Регистрационный номер кассы (РНМ)"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div[2]/div[3]/div/div/div[1]/div[5]/div[1]")).getText(),
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
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Locality']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Street']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='House']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Block']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Flat']")));
    click(By.xpath("//a[@href='http://test.ofd.ru/logout']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void tabNavigation() {
    click(By.xpath("//a[@href='/lk/downloads']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]")).getText(),
            equalTo("Список выгрузок пуст"));
    click(By.xpath("//a[@href='/lk/documents']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/h3")).getText(),
            equalTo("Скоро здесь появятся документы"));
  }

  public void goToEditAndAssertUpload() {
    click(By.xpath("//a[@href='/lk/downloads']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]")).getText(),
            equalTo("Список выгрузок пуст"));
    /*
    click(By.xpath("//a[@data-reactid='.0.1.0.1.1.1.0']"));
    Assert.assertTrue(isElementVisible(By.xpath("//h2[@data-reactid='.0.1.1.0.1.$0.0.1']")));
    click(By.xpath("//input[@value='KktReport']"));
    click(By.xpath("//input[@value='CloseShiftReport']"));
    click(By.xpath("//input[@value='ReceiptReport']"));
    click(By.xpath("//input[@value='FiscalDocumentReport']"));
    Assert.assertTrue(isElementVisible(By.xpath("//h2[@data-reactid='.0.1.1.0.1.$0.1.0']")));
    click(By.xpath("//div[@data-reactid='.0.1.1.0.1.$0.1.1.0.0']"));
    click(By.xpath("//div[@data-reactid='.0.1.1.0.1.$0.1.1.1.0']"));
    click(By.xpath("//div[@data-reactid='.0.1.1.0.1.$0.1.1.2.0']"));
    Assert.assertTrue(isElementVisible(By.xpath("//h2[@data-reactid='.0.1.1.0.1.$0.2.0']")));
    click(By.xpath("//input[@value='1']"));
    click(By.xpath("//input[@value='2']"));
    Assert.assertTrue(isElementVisible(By.xpath("//div[@data-reactid='.0.1.1.0.1.$1.0']")));
    */
  }

  public void checkingTabsMainPage() {
    Assert.assertTrue(isElementVisible(By.linkText("Проверить чек")));
    Assert.assertTrue(isElementVisible(By.linkText("Партнёрам")));
    Assert.assertTrue(isElementVisible(By.linkText("О компании")));
    Assert.assertTrue(isElementVisible(By.linkText("Новости")));
    Assert.assertTrue(isElementVisible(By.linkText("Информация")));
    Assert.assertTrue(isElementVisible(By.linkText("Разработчикам")));
    Assert.assertTrue(isElementVisible(By.linkText("Войти")));
    Assert.assertTrue(isElementVisible(By.cssSelector("a.btn-primary")));
    Assert.assertTrue(isElementVisible(By.cssSelector("a.btn-border-primary")));
    Assert.assertTrue(isElementVisible(By.className("material-icons")));
    Assert.assertTrue(isElementVisible(By.className("pull-right")));
  }

  public void clickTabsMainPage() {
    click(By.linkText("Проверить чек"));
    Assert.assertTrue(isElementVisible(By.className("till")));
    click(By.linkText("Партнёрам"));
    Assert.assertTrue(isElementVisible(By.className("table-col")));
    click(By.linkText("О компании"));
    Assert.assertTrue(isElementVisible(By.id("about")));
    click(By.linkText("Новости"));
    Assert.assertTrue(isElementVisible(By.id("news-page")));
    click(By.linkText("Информация"));
    Assert.assertTrue(isElementVisible(By.id("news-page")));
    click(By.linkText("Разработчикам"));
    Assert.assertTrue(isElementVisible(By.className("developers__content")));
  }

  public void checkDevelopersPage() {
    click(By.linkText("Разработчикам"));
    click(By.xpath("//a[@href='#v2-info']"));
    click(By.xpath("//a[@href='#v2-check-list']"));
    scrollToItem(By.cssSelector("div.developers__content span.developers__label"));
  }

  public void checkInformationPage() {
    click(By.linkText("Информация"));
    Assert.assertTrue(isElementVisible(By.id("news-page")));
  }

  public void checkInformationCompany() {
    click(By.linkText("О компании"));
    Assert.assertTrue(isElementVisible(By.id("about")));
    //Позже дополнить проверкой юр.информации о компании
  }

  public void checkPartnersPage() {
    click(By.linkText("Партнёрам"));
    Assert.assertTrue(isElementVisible(By.cssSelector("p.text_m")));
    assertThat(wd.findElement(By.cssSelector("div.container a.btn")).getText(), equalTo("СТАТЬ ПАРТНЕРОМ"));
    click(By.cssSelector("div.container a.btn"));

  }

  public void checkAttribute() {
    isElementVisible(By.xpath("//button[@disabled='']"));
  }

  public void checkNewsPage() {
    click(By.linkText("Новости"));
    Assert.assertTrue(isElementVisible(By.id("news-page")));
  }

  public void checkEmailWhenRegistering() throws InterruptedException {
    type(By.id("Email"), "rt5b&de@mail.ru");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.className("ofd-form__input-group-error")).getText(), equalTo("Некорректный E-Mail"));
    clear(By.id("Email"));
    type(By.id("Email"), " ");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.className("ofd-form__input-group-error")).getText(), equalTo("Некорректный E-Mail"));
    clear(By.id("Email"));
    type(By.id("Email"), "rt5b&demail.ru");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.className("ofd-form__input-group-error")).getText(), equalTo("Некорректный E-Mail"));
    click(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkEmailRegistrationForm() throws InterruptedException {
    Assert.assertTrue(isElementPresent(By.id("Email")));
    Assert.assertTrue(isElementPresent(By.id("Phone")));
    Assert.assertTrue(isElementPresent(By.id("FullName")));
    Assert.assertTrue(isElementPresent(By.id("Password")));
    Assert.assertTrue(isElementPresent(By.xpath("//button[@type='submit']")));
    type(By.id("Email"), "zhanchikov@ofd.ru");
    type(By.id("Phone"), "34234234");
    type(By.id("FullName"), "Test");
    click(By.cssSelector("div.ofd-form__input-group i.material-icons"));
    type(By.id("Password"), "12345");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.className("ofd-form__input-group-error")).getText(), equalTo("Аккаунт с таким E-Mail уже существует"));
    click(By.cssSelector("div.close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkEmailEmptyField() throws InterruptedException {
    type(By.id("Email"), "");
    type(By.id("Phone"), "34234234");
    type(By.id("FullName"), "Test");
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), "12345");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[1]/div")).getText(),
            equalTo("Поле обязательно для заполнения"));
    click(By.cssSelector("div.text-right div.close"));
    TimeUnit.SECONDS.sleep(1);

  }

  public void checkPhoneEmptyField() throws InterruptedException {
    type(By.id("Email"), "getIdUser@mail.ru");
    type(By.id("Phone"), "");
    type(By.id("FullName"), "Test");
    click(By.cssSelector("div.ofd-form__input-group i.material-icons"));
    type(By.id("Password"), "12345");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("div.ofd-form__input-group-error")).getText(),
            equalTo("Поле обязательно для заполнения"));
    click(By.cssSelector("div.text-right div.close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkChangePasswordEmailEmptyField() throws InterruptedException {
    click(By.cssSelector("div.pull-right a.analytics-login"));
    click(By.linkText("Забыли пароль?"));
    type(By.className("placeholder-center"), "f#fbfbdb@mail.ru");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.className("input-error")).getText(), equalTo("Некорректный E-Mail"));
    type(By.className("placeholder-center"), "ffbfbdb@mail.ru");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.className("input-error")).getText(), equalTo("Аккаунт с таким логином не найден"));
    type(By.className("placeholder-center"), "");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.className("input-error")).getText(), equalTo("Поле обязательно для заполнения"));
    click(By.cssSelector("div.close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void loginAccount() throws InterruptedException {
    click(By.cssSelector("div.pull-right a.analytics-login"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void loginToSystem(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.cssSelector("div.pull-right a.analytics-login"));
    type(By.name("Login"), email);
    type(By.name("Password"), password);
    click(By.xpath("//button[@type='submit']"));
  }

  public void loginToSystemDemoSite(String email, String password) {
    wd.get("https://demo.ofd.ru/");
    click(By.linkText("Войти"));
    type(By.name("Login"), email);
    type(By.name("Password"), password);
    click(By.xpath("//button[@type='submit']"));
  }

  public void checkUserNotRegister() throws InterruptedException {
    type(By.name("Login"), "rtrteter@yopmail.com");
    type(By.name("Password"), "123");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("span.input-error")).getText(),
            equalTo("Неверный Email или пароль"));
    click(By.cssSelector("div.close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkHomePage() throws InterruptedException {
    type(By.name("Login"), "zhanchikov@ofd.ru");
    type(By.name("Password"), "12345");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div/span")).getText(),
            equalTo("Все кассы"));
    click(By.xpath("//span[@class='org fd-text_va-middle fd-padding-right-5']/span"));
    click(By.xpath("//a[@href='http://test.ofd.ru/logout']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkAuthorizationIncorrectEmail() throws InterruptedException {
    type(By.name("Login"), "testmail.ru");
    type(By.name("Password"), "12345");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("span.input-error")).getText(), equalTo("Неверный Email или пароль"));
    type(By.name("Login"), "test@mailru");
    type(By.name("Password"), "12345");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("span.input-error")).getText(), equalTo("Неверный Email или пароль"));
    type(By.name("Login"), "testТест@mail.ru");
    type(By.name("Password"), "12345");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("span.input-error")).getText(), equalTo("Неверный Email или пароль"));
    type(By.name("Login"), "t&es#t@mail.ru");
    type(By.name("Password"), "12345");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("span.input-error")).getText(), equalTo("Неверный Email или пароль"));
    click(By.cssSelector("div.close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkAuthorizationIncorrectPassword() throws InterruptedException {
    type(By.name("Login"), "zhanchikovvvv@ofd.ru");
    type(By.name("Password"), "1234");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("span.input-error")).getText(), equalTo("Неверный Email или пароль"));
    type(By.name("Login"), "zhanchikov@ofd.ru");
    type(By.name("Password"), "123456");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("span.input-error")).getText(), equalTo("Неверный Email или пароль"));
    type(By.name("Password"), "12346");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("span.input-error")).getText(), equalTo("Неверный Email или пароль"));
    type(By.name("Password"), "12%s345");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("span.input-error")).getText(), equalTo("Неверный Email или пароль"));
    click(By.cssSelector("div.close"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkAuthorizationEmptyInput() throws InterruptedException {
    type1(By.name("Login"), "");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/form/div[1]/span[2]")).getText(),
            equalTo("Поле обязательно для заполнения"));
    type(By.name("Login"), "zhanchikov@ofd.ru");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/form/div[2]/span[2]")).getText(),
            equalTo("Поле обязательно для заполнения"));
    click(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div/div[1]/div"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkMessagePasswordChange() throws InterruptedException {
    click(By.cssSelector("div.pull-right a.analytics-login"));
    click(By.linkText("Забыли пароль?"));
    type(By.className("placeholder-center"), "ofdrinnispresent@yopmail.com");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]/p")).getText(),
            equalTo("Мы отправили на почту письмо с инструкцией о смене пароля"));
    click(By.cssSelector("div.modal__body div.close"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void checkMessagePasswordChangeIncorrectEmail() throws InterruptedException {
    wd.navigate().refresh();
    click(By.cssSelector("div.pull-right a.analytics-login"));
    TimeUnit.SECONDS.sleep(1);
    click(By.linkText("Забыли пароль?"));
    TimeUnit.SECONDS.sleep(1);
    type(By.className("placeholder-center"), "ergeger@mail.ru");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("div.input-group span.input-error")).getText(),
            equalTo("Аккаунт с таким логином не найден"));
    type(By.className("placeholder-center"), "test@@binka.me");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("div.input-group span.input-error")).getText(),
            equalTo("Некорректный E-Mail"));
    type(By.className("placeholder-center"), "testbinka.me");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("div.input-group span.input-error")).getText(),
            equalTo("Некорректный E-Mail"));
    type(By.className("placeholder-center"), "test@binkame");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("div.input-group span.input-error")).getText(),
            equalTo("Некорректный E-Mail"));
    type(By.className("placeholder-center"), "");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("div.input-group span.input-error")).getText(),
            equalTo("Поле обязательно для заполнения"));
    type(By.className("placeholder-center"), "tеst1@binka.Дe");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.cssSelector("div.input-group span.input-error")).getText(),
            equalTo("Аккаунт с таким логином не найден"));
    click(By.cssSelector("div.modal__body div.close"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void newCustomerRegistration(String email, String password) throws InterruptedException {
    click(By.cssSelector("div.fw-cols-2 a.analytics-registration"));
    TimeUnit.SECONDS.sleep(2);
    type(By.id("Email"), email);
    type(By.id("Phone"), "89024951054");
    type(By.id("FullName"), "Test Test");
    click(By.cssSelector("div.ofd-form__input-group i.material-icons"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/p[2]/a"));
  }

  public void notConfirmEmailRegistration(String email, String password) throws InterruptedException {
    click(By.cssSelector("div.fw-cols-2 a.analytics-registration"));
    type(By.id("Email"), email);
    type(By.id("Phone"), "89024951054");
    type(By.id("FullName"), "Test Test");
    click(By.cssSelector("div.ofd-form__input-group i.material-icons"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/p[2]/a"));
  }

  public void finish(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.cssSelector("div.pull-right a.analytics-login"));
    type(By.name("Login"), email);
    type(By.name("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(), equalTo("Регистрация данных пользователя"));
    click(By.xpath("//a[@href='http://test.ofd.ru/logout']"));
  }

  public void registrationUserToYopmail(String user) {
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
  }

  public void confirmationRegistration(String email, String password) throws InterruptedException {
    click(By.cssSelector("div.pull-right a.analytics-login"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("Login"), email);
    type(By.name("Password"), password);
    click(By.cssSelector("button.btn-primary"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(), equalTo("Регистрация данных пользователя"));
    click(By.xpath("//a[@href='http://test.ofd.ru/logout']"));
  }

  public void replaceForgotPassword(String email) throws InterruptedException {
    click(By.cssSelector("div.pull-right a.analytics-login"));
    click(By.linkText("Забыли пароль?"));
    TimeUnit.SECONDS.sleep(1);
    type(By.cssSelector("div.input-group input.placeholder-center"), email);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//button[@type='submit']"));
    click(By.cssSelector("div.close"));
  }

   public void confirmForgotPassword(String email, String password2) throws InterruptedException {
     TimeUnit.SECONDS.sleep(1);
     click(By.cssSelector("div.pull-right a.analytics-login"));
     TimeUnit.SECONDS.sleep(4);
     type(By.name("Login"), email);
     type(By.name("Password"), password2);
     click(By.cssSelector("button.btn-primary"));
     assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(), equalTo("Регистрация данных пользователя"));
     click(By.xpath("//a[@href='http://test.ofd.ru/logout']"));
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
    click(By.xpath("/html/body/div/div/div/div[6]/div[2]/div/div[2]/form/div[2]/i"));
    type(By.id("Password"), password1);
    click(By.xpath("/html/body/div/div/div/div[6]/div[2]/div/div[2]/form/div[3]/i"));
    type(By.id("ConfirmPassword"), password2);
    TimeUnit.SECONDS.sleep(2);
    isElementPresent(By.xpath("//button[@disabled='']"));
    click(By.cssSelector("div.close"));
    TimeUnit.SECONDS.sleep(1);
    wd.switchTo().window((String) tabs2.get(0));
    wd.get("http://test.ofd.ru");
    TimeUnit.SECONDS.sleep(2);
  }

  public void checkForFields(String email, String password) throws InterruptedException {
    type(By.xpath("//div[@class='modal__area']//input[@name='Login']"), email);
    type(By.xpath("//div[@class='modal__area']//input[@name='Password']"), password);
    click(By.xpath("//div[@class='modal__area']//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/label")).getText()
            , equalTo("ИНН компании"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[1]/div/div/label")).getText()
            , equalTo("Название организации"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[2]/div/div/label")).getText()
            , equalTo("ФИО руководителя и должность"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[2]/div/div/label")).getText()
            , equalTo("КПП"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[3]/div/div/label")).getText()
            , equalTo("ОГРН"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div/label")).getText()
            , equalTo("Электронный документооборот"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[1]/div/div/label")).getText()
            , equalTo("Индекс"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[2]/div/div/label")).getText()
            , equalTo("Регион"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[3]/div/div/label")).getText()
            , equalTo("Населённый пункт"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[1]/div/div/label")).getText()
            , equalTo("Улица"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/div/div/label")).getText()
            , equalTo("Дом"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[3]/div/div/label")).getText()
            , equalTo("Корпус/строение"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[4]/div/div/label")).getText()
            , equalTo("Офис/квартира"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div")).getText()
            , equalTo("Да"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[2]/div")).getText()
            , equalTo("Нет"));
    assertThat(wd.findElement(By.xpath("//button[@type='submit']")).getText()
            , equalTo("Продолжить"));
  }

  public void checkCompanyRegistration(String inn) throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), inn);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//input[@name='Kpp']")).getAttribute("value"), equalTo("246401001"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/h3")).getText()
            , equalTo("Как подключить кассу к OFD.RU?"));
  }

  public void checkFieldNdsEmpty(String inn) throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), inn);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    isElementVisible(By.xpath("//button[@disabled='']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/a"));
  }

  public void checkFieldWorkflowEmpty(String inn) throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    isElementVisible(By.xpath("//button[@disabled='']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/a"));
  }

  public void checkRegistrationPostoplatnik(String inn) throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), inn);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Пользователь с таким ИНН уже зарегистрирован"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/a"));
  }

  public void checkFieldLegalAddressEmpty(String inn) throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), inn);
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
    clear(By.xpath("//input[@name='Locality']"));
    clear(By.xpath("//input[@name='Street']"));
    clear(By.xpath("//input[@name='House']"));
    click(By.xpath("//input[@name='Block']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[1]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[3]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[1]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/div/span")).getText(),
            equalTo("Обязательно для заполнения"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    isElementVisible(By.xpath("//button[@disabled='']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/a"));
  }

  public void enterValuesInputFieldsLegalEntity(String inn) throws InterruptedException {
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), inn);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[2]/div/div/input"), "668501001");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(5);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/h3")).getText(),
            equalTo("Как подключить кассу к OFD.RU?"));
  }

  public void enterValuesInputFieldsIndividualEntrepreneur(String inn) throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), inn);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    type(By.name("Street"), "Ленина");
    type(By.name("House"), "36");
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"));
    isElementVisible(By.cssSelector("div.fw-col-1 div.disabled"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/h3")).getText(),
            equalTo("Как подключить кассу к OFD.RU?"));
  }

  public void checkInnNotFound() throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), "771597009077");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Юридическое лицо с таким ИНН не найдено"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(),
            equalTo("Регистрация данных пользователя"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/a"));
  }

  public void checkNotCorrectInn() throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), "11133333333");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Неверный ИНН"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(),
            equalTo("Регистрация данных пользователя"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/a"));
  }

  public void checkInnDoesNotExist(String inn) throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), inn);
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Юридическое лицо с таким ИНН не найдено"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(),
            equalTo("Регистрация данных пользователя"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/a"));
  }

  public void clearLegalAddressFields() throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), "6685133850");
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
    isElementPresent(By.xpath("//button[@disabled='']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/a"));
  }

  public void enterValuesCorrespAddress(String inn) throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), inn);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[2]/div/div/input"), "668501001");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[text()='СБИС']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//input[@type='checkbox']"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[4]/div/label"));
    type1(By.name("PostPostalCode"), "6775591");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[1]/div[2]/div/div"));
    click(By.xpath("//*[text()='Республика Калмыкия']"));
    TimeUnit.SECONDS.sleep(1);
    type1(By.name("PostLocality"), "Энск");
    type1(By.name("PostStreet"), "Тулоева");
    type1(By.name("PostHouse"), "71");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(4);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/h3")).getText(),
            equalTo("Как подключить кассу к OFD.RU?"));
  }

  public void notFillCorresoAddressFields(String inn) throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), inn);
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
    assertThat(wd.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color"),
            equalTo("rgba(229, 233, 240, 1)"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/a"));
  }

  public void enterBecomePartner() throws InterruptedException {
    click(By.xpath("//a[@class='btn btn-border-fade pull-right']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//a[@href='/partnerskaya-programma']"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/section[1]/div/div/div[1]/p[2]/a"));
  }

  public void fillingRegistrationFieldsNewPartner(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("//*[@id='Email']"), email);
    type(By.id("Phone"), "89054001020");
    type(By.id("FullName"), "Test Testov");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/p[2]/a"));
    TimeUnit.SECONDS.sleep(2);
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
    click(By.xpath("//a[@class='lk-button btn btn-border-fade pull-right analytics-login']"));
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

  public void confirmationRegistrationOnSite2(String email, String password) throws InterruptedException {
    //ArrayList tabs2 = new ArrayList(wd.getWindowHandles());//Получение списка открытых окон браузера
    //wd.switchTo().window((String) tabs2.get(1));//Переключение на второй таб в браузере
    click(By.xpath("//a[@class='lk-button btn btn-border-fade pull-right analytics-login']"));
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
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/a"));
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
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(2);
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
    click(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/button"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[1]/input"), "Тестовая");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[1]/div[3]/input"), "Тест директор");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[3]/input"), "Устав");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[2]/input"), "Тестов Тест Юзерович");
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[1]/div[4]/label"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[1]/div[4]/input"), "1077847452143");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1);
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
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.xpath("//a[@class='fd-text fd-text_m fd-decoration_none']"));
  }

  public void testRegLegalEntity(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1);
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
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Неверный ИНН"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='fd-padding-right-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkContractNotSigned1(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/h2"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div/input"), "044525411");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[2]/div[1]/input"), "30101810100000000633");
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/h2"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[3]/div[2]/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h1")).getText(),
            equalTo("Прочтите и подпишите договор с OFD.RU"));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/div[1]/span"));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/div[2]/div/a"));
  }

  public void checkContractNotSigned2(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1);
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
    click(By.xpath("//div[@class='header__col']"));
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
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1);
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
    assertThat(wd.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/h3")).getText(),
            equalTo("Не установлен плагин"));
    click(By.xpath("//span[@class='close-button']"));
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("//a[@href='/pk/register-pos']"));
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.xpath("//a[@class='fd-text fd-text_m fd-decoration_none']"));
  }

  public void checkInvalidContractNumber(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1);
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
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Не найдена информация о договоре, подписанного «на бумаге»"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("//a[@href='/pk/register-pos']"));
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.xpath("//a[@class='fd-text fd-text_m fd-decoration_none']"));
  }

  public void checkRegistrationPostpaid(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/h2"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div/input"), "041403633");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[2]/div[1]/input"), "30101810100000000633");
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/h2"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[3]/div[2]/button"));
    TimeUnit.SECONDS.sleep(1);
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
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.xpath("//a[@class='fd-text fd-text_m fd-decoration_none']"));
  }

  public void checkInnAlreadyExists(String inn) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[1]/div[5]/label/div[1]"));
    type(By.xpath("//input[@name='Inn']"), inn);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[3]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/h2"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div/input"), "041403633");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[4]/div[2]/div[1]/input"), "30101810100000000633");
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/h2"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/form/div/div[2]/div[2]/div[5]/div[2]"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/h3")).getText(),
            equalTo("Не удалось зарегистрировать партнера"));
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Пользователь с таким ИНН уже зарегистрирован"));
    click(By.xpath("//button[@type='button']"));
    TimeUnit.SECONDS.sleep(1);
    scrollToItem(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.xpath("//div[@class='header__col-item margin-right-10']"));
    click(By.xpath("//a[@class='fd-text fd-text_m fd-decoration_none']"));
  }

  public void createMailbox(String user) throws InterruptedException {
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
    TimeUnit.SECONDS.sleep(2);
  }

  public void addAdditionalUser(String email) throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/a[4]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/p/button"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/input"), email);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/input"), "89995551122");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/div/input"), "Тест Тестович Тестов");
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
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/a[4]"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div")).getText(),
            equalTo(email));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='navbar-item fd-padding-right-10 fd-padding-top-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void addAdditionalUser2(String email) throws InterruptedException {
    click(By.xpath("//a[@href='/lk/users']"));
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
    click(By.xpath("//div[@class='navbar-item fd-padding-right-10 fd-padding-top-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
  }

  public void checkRemoveAccess() throws InterruptedException {
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/a[4]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div[5]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[1]/i"));
    TimeUnit.SECONDS.sleep(1);
    new WebDriverWait(wd, 1).
            until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div[5]/div/div[3]/div/i")));
    new WebDriverWait(wd, 1).
            until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div[5]/div/div[4]/div/i")));
    new WebDriverWait(wd, 1).
            until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div[5]/div/div[5]/div/i")));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/a[4]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div[5]/div/div[1]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[1]/i"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[@class='navbar-item fd-padding-right-10 fd-padding-top-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);

  }

  public void checkAccessUserAccount() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[2]")).getText(),
            equalTo("Мои кассы"));
    assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[@href='/lk/downloads']")).getText(),
            equalTo("Выгрузки"));
    assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[@href='/lk/documents']")).getText(),
            equalTo("Документы"));
    assertThat(wd.findElement(By.xpath("//div[@class='fd-breadcrumbs-item fd-breadcrumbs-item__last']/span")).getText(),
            equalTo("Все кассы"));
    click(By.xpath("//a[@href='/lk/downloads']"));
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-section__content text-align-center']/div[1]")).getText(),
            equalTo("Список выгрузок пуст"));
    click(By.xpath("//a[@href='/lk/documents']"));
    isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]"));
    isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]"));
    isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]"));
    click(By.xpath("//div[@class='navbar-item fd-padding-right-10 fd-padding-top-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkNoAccessToFolders() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div/h3")).getText(), equalTo("Как подключить кассу к OFD.RU?"));
    assertThat(wd.findElement(By.xpath("//a[@href='/lk/']")).getText(), equalTo("Мои кассы"));
    assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[@href='/lk/downloads']")).getText(),
            equalTo("Выгрузки"));
    assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[@href='/lk/documents']")).getText(),
            equalTo("Документы"));
    click(By.xpath("//div[@class='navbar-item fd-padding-right-10 fd-padding-top-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkAccessToFolders() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[2]")).getText(),
            equalTo("Мои кассы"));
    assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[@href='/lk/downloads']")).getText(),
            equalTo("Выгрузки"));
    assertThat(wd.findElement(By.xpath("//div[@class='pull-left']/a[@href='/lk/documents']")).getText(),
            equalTo("Документы"));
    assertThat(wd.findElement(By.xpath("//div[@class='fd-breadcrumbs-item fd-breadcrumbs-item__last']/span")).getText(),
            equalTo("Все кассы"));
    click(By.xpath("//a[@href='/lk/downloads']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]")).getText(),
            equalTo("Список выгрузок пуст"));
    click(By.xpath("//a[@href='/lk/documents']"));
    TimeUnit.SECONDS.sleep(1);
    isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]"));
    isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]"));
    isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]"));
    click(By.xpath("//div[@class='navbar-item fd-padding-right-10 fd-padding-top-10 header-toggle fd-pointer']"));
    click(By.linkText("Выйти"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkFillingRegistrationData(int arbitrarily1, String arbitrarily2) throws InterruptedException {
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
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/a"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/a"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h2")).getText(),
            equalTo("Подключите кассы к OFD.RU"));
  }

  public void checkSeveralCashRegisters(int arbitrarily1, String arbitrarily2, int arbitrarily3, String arbitrarily4) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[1]/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily1));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/div[2]/div/input"), arbitrarily2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[3]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily3));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[3]/div/div/div[2]/div[2]/div/input"), arbitrarily4);
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
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/table/tbody/tr[2]/td[2]/strong/span[1]")).getText(),
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
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/a"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/a"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h2")).getText(),
            equalTo("Подключите кассы к OFD.RU"));
  }

  public void checkPreactivationCashRegister(String arbitrarily) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[1]/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/div/input"), "00012043");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/div[2]/div/input"), arbitrarily);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[1]/a[1]/span"));
    isElementVisible(By.xpath("//a[@target='_blank']"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[1]/a[2]/i"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/button[1]"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/button[2]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/button[2]"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/p")).getText(),
            equalTo("Счёт оплачен по специальной программе."));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/h2")).getText(),
            equalTo("Выберите способ регистрации касс в ФНС"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/a/span"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/a/span")).getText(),
            equalTo("Следующий шаг"));
  }

  public void checkRegularAndPreactivationCash(String arbitrarily1, String arbitrarily2, int arbitrarily3, String arbitrarily4) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[1]/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/div/input"), arbitrarily1);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/div[2]/div/input"), arbitrarily2);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[3]/div/div/div[1]/div[2]/div/input"), String.valueOf(arbitrarily3));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[3]/div/div/div[2]/div[2]/div/input"), arbitrarily4);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("В списке есть предоплаченные и не предоплаченные кассы. Пожалуйста, удалите из списка не предоплаченные кассы."));
    click(By.xpath("//button[@type='button']"));
    isElementVisible(By.xpath("//button[@disabled='']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[3]/div/div/div[1]/div[2]/span")).getText(),
            equalTo("Касса не предоплачена"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[3]/div/div/div[2]/div[1]"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(5);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/h1/span")).getText(),
            equalTo("на обработку фискальных данных"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[1]/a[1]/span"));
    isElementVisible(By.xpath("//a[@target='_blank']"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[1]/a[2]/i"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/button[1]"));
    isElementVisible(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/button[2]"));
  }

  public void checkIncorrectFiscalNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[1]/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/div/input"), "34566788");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/div[2]/div/input"), "535555555555555");
    TimeUnit.SECONDS.sleep(1);
    isElementVisible(By.xpath("//button[@disabled='']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/div[2]/span")).getText(),
            equalTo("Поле должно состоять из 16 символов"));
  }

  public void checkIncorrectCashRegisterNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[1]/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/div/input"), "3456");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/div[2]/div/input"), "1234567890123456");
    TimeUnit.SECONDS.sleep(1);
    isElementVisible(By.xpath("//button[@disabled='']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/span")).getText(),
            equalTo("Поле должно содержать от 5 до 20 символов"));
  }

  public void checkIncorrectFiscalAndCashNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[1]/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/div/input"), "3456");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/div[2]/div/input"), "123456789012345");
    TimeUnit.SECONDS.sleep(1);
    isElementVisible(By.xpath("//button[@disabled='']"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/span")).getText(),
            equalTo("Поле должно содержать от 5 до 20 символов"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/div[2]/span")).getText(),
            equalTo("Поле должно состоять из 16 символов"));
  }

  public void checkCashNumberAlreadyExists() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[1]/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/div/input"), "663585");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/div[2]/div/input"), "7607169430000000");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/button"));
    click(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[2]/div/div/div[1]/div[2]/span")).getText(),
            equalTo("Эта касса уже зарегистрированна"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[3]/div/div/div[1]/div[2]/div/input"), "234245345");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[1]/div[3]/div/div/div[2]/div[2]/div/input"), "7407162430000000");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/button"));
    isElementVisible(By.xpath("//button[@disabled='']"));
  }

  public void checkRegistrationWithFNS(int arbitrarily1, String arbitrarily2) throws InterruptedException {
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
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[1]/div/div[1]/input"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[1]/div/div[1]/label")).getText(),
            equalTo("Наименование модели кассы"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[2]/div/div[1]/label")).getText(),
            equalTo("Наименование производителя кассы"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[2]/div/div[1]/input"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[3]/div/label")).getText(),
            equalTo("Наименование модели фискального накопителя"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[2]/div/input")).getAttribute("value"),
            equalTo(String.valueOf(arbitrarily1)));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[3]/div/input")).getAttribute("value"),
            equalTo(arbitrarily2));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/h3"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[1]/div/div[1]/input"), "Tes56-1П");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[2]/div/div[1]/input"), "Testdfg666gf");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[2]/div[1]/div[3]/div/input"), "Test54f");
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[3]/h3"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[3]/div/div[1]/div/div/div/input"), "Москва Тестовая ул 45");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/form/div[3]/div/div[2]/div/div/input"), "444");
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
    click(By.cssSelector("button.btn-primary"));
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
    click(By.xpath("//span[@class='org fd-text_va-middle fd-padding-right-5']/span[1]"));
    click(By.xpath("//span[@class='fd-text fd-text_m fd-pointer']"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div/a/span"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div/a/span"));
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[@class='org fd-text_va-middle fd-padding-right-5']/span[1]"));
    click(By.xpath("//a[@class='fd-text fd-text_m']"));
  }

  public void authUnderModifMail(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[1]/span/span[1]"));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[2]/div[4]/a"));
    TimeUnit.SECONDS.sleep(3);
    //wd.navigate().refresh();
    click(By.cssSelector("div.pull-right a.analytics-login"));
    TimeUnit.SECONDS.sleep(2);
    type(By.name("Login"), email);
    type(By.name("Password"), password);
    click(By.cssSelector("button.btn-primary"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/h3")).getText(),
            equalTo("Как подключить кассу к OFD.RU?"));
  }

  public void changingPassword(String email, String password1) throws InterruptedException {
    type(By.name("Login"), email);
    type(By.name("Password"), password1);
    click(By.cssSelector("button.btn-primary"));
  }

  public void checkEmailAlreadyExists(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[1]/span/span[1]"));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[2]/div[3]/span"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/p/a"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/p/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[1]/div/div/input"), password);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/input"), email);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[3]/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Данный e-mail уже используется"));
    click(By.xpath("//button[@type='button']"));
  }

  public void checkEmailIncoretPassword(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[1]/span/span[1]"));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[2]/div[3]/span"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/p/a"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/p/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[1]/div/div/input"), password);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/input"), email);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[3]/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Неверный пароль"));
    click(By.xpath("//button[@type='button']"));
  }

  public void checkEmailIncoretEmail(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[1]/span/span[1]"));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[2]/div[3]/span"));
    TimeUnit.SECONDS.sleep(2);
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/p/a"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/p/a"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[1]/div/div/input"), password);
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/input"), email);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/div[3]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Что-то пошло не так"));
    click(By.xpath("//button[@type='button']"));
  }

  public void authAccountManager(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/login");
    type1(By.id("Login"), email);
    type1(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/h1/span")).getText(),
            equalTo("Список всех касс"));
    click(By.xpath("//a[@class='ofd-link ofd-link_none']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void authIncorrectEmail(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/login");
    type1(By.id("Login"), email);
    type1(By.id("Password"), password);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div/form/div[3]/div/button"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/notifications/div/div/span")).getText(),
            equalTo("У вас нет прав доступа"));
  }

  public void authIncorrectPassword(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/login");
    type1(By.id("Login"), email);
    type1(By.id("Password"), password);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div/form/div[3]/div/button"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/notifications/div/div/span")).getText(),
            equalTo("У вас нет прав доступа"));
  }

  public void authIncorrectUser(String email, String password) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/login");
    type1(By.id("Login"), email);
    type1(By.id("Password"), password);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div/form/div[3]/div/button"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/notifications/div/div/span")).getText(),
            equalTo("У вас нет прав доступа"));
  }

  public void fieldFilterByINN() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(3);
    type1(By.xpath("//input[@id='Inn']"), "7742000057");
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[1]")).getText(),
            equalTo("7742000057\nОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \"ЦТО МОССТРОЙ\""));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[5]")).getText(),
            equalTo("9999078900004679"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[4]")).getText(),
            equalTo("0240800002000758"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[1]/custom-input/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[1]/custom-input/div/div"));
  }

  public void fieldFilterByINNPartner() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(3);
    type1(By.xpath("//input[@id='PartnerInn']"), "5403341203");
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    isElementPresent(By.xpath("//div[@title='ООО \"НОРДРЕГИОНПРОДУКТ\"']"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[4]")).getText(),
            equalTo("3453455"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[5]")).getText(),
            equalTo("3453456765678987"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[1]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[1]/div/div"));
  }

  public void fieldFilterByFN() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(3);
    type1(By.xpath("//input[@id='FnNumber']"), "0000099990789199");
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    isElementVisible(By.xpath("//div[@title='Измеритель']"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[4]")).getText(),
            equalTo("0204240006025953"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[5]")).getText(),
            equalTo("0000099990789199"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[3]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[3]/div/div"));
  }

  public void fieldFilterIncorrectFN() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(3);
    type1(By.xpath("//input[@id='FnNumber']"), "0030099990789199");
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertFalse(isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]")));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[3]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[3]/div/div"));
  }

  public void fieldFilterCashNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(3);
    type1(By.xpath("//input[@id='KktSerialNumber']"), "0493006104");
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[4]")).getText(),
            equalTo("0493006104"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[5]")).getText(),
            equalTo("8710000100158682"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[4]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[4]/div/div"));
  }

  public void fieldFilterIncorrectCashNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(3);
    type1(By.xpath("//input[@id='KktSerialNumber']"), "0493556104");
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertFalse(isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]")));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[4]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[4]/div/div"));
  }

  public void fieldFilterRegnumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(3);
    type1(By.xpath("//input[@id='KktRegNumber']"), "6125313683395011");
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[3]")).getText(),
            equalTo("6125313683395011"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[5]")).getText(),
            equalTo("2999173844164911"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[5]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[5]/div/div"));
  }

  public void fieldFilterInvoiceNumber() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    TimeUnit.SECONDS.sleep(3);
    type1(By.xpath("//input[@id='BillNumber']"), "4501196714-644");
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[4]")).getText(),
            equalTo("434406"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]/div[5]")).getText(),
            equalTo("1666302002298241"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[6]/div/div/i"));
    TimeUnit.SECONDS.sleep(2);
    invisibleElement(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/custom-input[6]/div/div"));
  }

  public void checkCheckSidebar() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]"));
    TimeUnit.SECONDS.sleep(3);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/h4[1]")).getText(),
            equalTo("Действия"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/h4[2]")).getText(),
            equalTo("Последний документ"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/h4[3]")).getText(),
            equalTo("Последняя ошибка"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/h4[4]")).getText(),
            equalTo("Просмотреть документ"));
    assertThat(wd.findElement(By.cssSelector("p.ofd-link")).getText(),
            equalTo("Аудит по кассе"));
    click(By.cssSelector("p.ofd-link"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/audit/div/div/div[1]/div[1]")).getText(),
            equalTo("Событие"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/audit/div/div/div[1]/div[2]")).getText(),
            equalTo("Дата события"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/audit/div/div/div[1]/div[3]")).getText(),
            equalTo("Пользователь"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/audit/div/div/div[1]/div[4]")).getText(),
            equalTo("Ip-Address"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/audit/div/div/div[1]/div[5]")).getText(),
            equalTo("Сообщение"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/audit/div/div/div[1]/div[6]")).getText(),
            equalTo("Результат"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[1]/div"));
  }

  public void checkSectionActions() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    type1(By.id("FnNumber"), "5012332451060091");
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/p[1]/span")).getText(),
            equalTo("Проверить регномер"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/p[2]/span")).getText(),
            equalTo("Оплата счета"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/p[3]/span")).getText(),
            equalTo("Перенести оплату на договор"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/p[4]/span")).getText(),
            equalTo("Включить причем чеков"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/p[5]/span")).getText(),
            equalTo("Прекратить обслуживание кассы"));
    click(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/p[1]"));
    type1(By.id("modalKktRegNumber"), "42324234");
    assertThat(wd.findElement(By.xpath("//button[@class='ofd-button ofd-button_xl']")).getCssValue("background-color"),
            equalTo("rgba(0, 190, 106, 1)"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[1]/div/i"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button")).getText(),
            equalTo("Применить фильтр"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/p[2]"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/set-bill-paid/div/div[4]/button")).getText(),
            equalTo("Оплатить"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/set-bill-paid/div/div[4]/button"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/notifications/div/div/span")).getText(),
            equalTo("У вас нет прав доступа"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[1]/div/i"));
  }

  public void checkSectionDocIncorrectDoc() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    type1(By.id("KktSerialNumber"), "0493006104");
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.id("documentNumber"), "533977777777777");
    click(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/div[4]/div[2]/button"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[1]/div[1]")).getText(),
            equalTo("Документ tab"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[1]/div[2]")).getText(),
            equalTo("JSON tab"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[1]/div[3]")).getText(),
            equalTo("TLV tab"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[2]/div/p")).getText(),
            equalTo("Нет данных для отображения"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[1]/div[2]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-text ofd-text_center ofd-text_orange ofd-margin-top-20 ofd-margin-bottom-10']")).getText(),
            equalTo("The DocNumber field is required."));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[1]/div[3]"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("//div[@class='ofd-text ofd-text_center ofd-text_orange ofd-margin-top-20 ofd-margin-bottom-10']")).getText(),
            equalTo("The DocNumber field is required."));
    click(By.xpath("//div[@class='ofd-modal__header-close ofd-pointer ofd-text_right ofd-text_fade ofd-text_h2']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkSectionDocWhereDocIsNull() throws InterruptedException {
    TimeUnit.SECONDS.sleep(3);
    wd.get("http://test.ofd.ru/mk");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    type1(By.id("KktSerialNumber"), "0493006104");
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/pos-filter/div/form/div[2]/button"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/div[1]/div[2]"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.id("documentNumber"), "425");
    click(By.xpath("/html/body/app/div/ng-component/sidebar/div/div[2]/div[1]/pos-info/div/div/div[4]/div[2]/button"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[1]/div[1]")).getText(),
            equalTo("Документ tab"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[1]/div[2]")).getText(),
            equalTo("JSON tab"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[1]/div[3]")).getText(),
            equalTo("TLV tab"));
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[2]/div/p")).getText(),
            equalTo("Нет данных для отображения"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[1]/div[2]"));
    invisibleElement(By.xpath("//textarea[@class='pos__document-area']"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/document-info/div/div[1]/div[3]"));
    invisibleElement(By.xpath("//textarea[@class='pos__document-area']"));
    click(By.xpath("//div[@class='ofd-modal__header-close ofd-pointer ofd-text_right ofd-text_fade ofd-text_h2']"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void checkClientsTab() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/clients");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/app/div/header/div/div/div[1]/a[3]"));
    TimeUnit.SECONDS.sleep(2);
    type1(By.id("filter"), "2NAH8VMO4A\n");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[2]/div[1]")).getText(),
            equalTo("ООО 2NAH8VMO4A"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[1]/form/custom-input/div/div/i"));
    isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[2]"));
    isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[3]"));
    isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[4]"));
    isElementPresent(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[5]"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/default-select"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/default-select/div/div[3]/default-option[2]/div"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[2]/div[6]/div")).getText(),
            equalTo("Рам."));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/default-select"));
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[2]/default-select/div/div[3]/default-option[3]/div"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[2]/div[6]/div")).getText(),
            equalTo("Тип."));
  }

  public void checkAddNewUserIndividMerch(String email, String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/clients?PageCount=100");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/button"));
    type1(By.id("OrgInn"), inn);
    TimeUnit.SECONDS.sleep(1);
    type1(By.id("SignatoryName"), "Testiv Test");
    type1(By.id("SignatoryPosition"), "Тестовый юзер");
    type1(By.id("OrgName"), "Front138");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[2]/default-select"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[2]/default-select/div/div[3]/default-option[2]"));
    type1(By.id("OrgPostalCode"), "127299");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/address-selector/div/form/div[1]/div[2]/default-select"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/address-selector/div/form/div[1]/div[2]/default-select/div/div[3]/default-option[1]"));
    type1(By.id("OrgLocality"), "Москва");
    type1(By.id("OrgStreet"), "Ленина");
    type1(By.id("OrgHouse"), "34");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[3]/div[1]/div/label"));
    scrollToItem(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[6]/span"));
    type1(By.id("Name"), "Testik Test");
    type1(By.id("Phone"), "89034567766");
    type1(By.id("LoginEmail"), email);
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[6]/button"));
    TimeUnit.SECONDS.sleep(6);
    type1(By.id("filter"), "Front138\n");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[2]/div[3]")).getText(),
            equalTo(inn));
  }

  public void checkAddNewUserlegalEntity(String email, String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/clients?PageCount=100");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/button"));
    type1(By.id("OrgInn"), inn);
    TimeUnit.SECONDS.sleep(1);
    type1(By.id("SignatoryName"), "Testеее Testеее");
    type1(By.id("SignatoryPosition"), "Тестовая организация");
    type1(By.id("OrgName"), "Front143");
    type1(By.id("OrgKpp"), "560601001");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[2]/default-select"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[2]/default-select/div/div[3]/default-option[2]"));
    type1(By.id("OrgPostalCode"), "127300");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/address-selector/div/form/div[1]/div[2]/default-select"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/address-selector/div/form/div[1]/div[2]/default-select/div/div[3]/default-option[1]"));
    type1(By.id("OrgLocality"), "Москва");
    type1(By.id("OrgStreet"), "Блаблабла");
    type1(By.id("OrgHouse"), "34");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[3]/div[1]/div/label"));
    scrollToItem(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[6]/span"));
    type1(By.id("Name"), "Testik Test");
    type1(By.id("Phone"), "89034567766");
    type1(By.id("LoginEmail"), email);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(4);
    type1(By.id("filter"), "Front143\n");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/app/div/ng-component/div/div/div[4]/div[1]/div[2]/div[3]")).getText(),
            equalTo(inn));
  }

  public void checkAddNewUserIncorrectINN(String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/clients?PageCount=100");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/button"));
    type1(By.id("OrgInn"), inn);
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.id("OrgInn")).getAttribute("value"),
            equalTo("123456789012"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[1]/div"));
  }

  public void checkAddNewUserCorrectINN(String email, String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/clients?PageCount=100");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/button"));
    type1(By.id("OrgInn"), inn);
    TimeUnit.SECONDS.sleep(1);
    type1(By.id("SignatoryName"), "Testеее Testеее");
    type1(By.id("SignatoryPosition"), "Тестовая организация");
    type1(By.id("OrgName"), "Front143");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[2]/default-select"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[2]/default-select/div/div[3]/default-option[2]"));
    type1(By.id("OrgPostalCode"), "127300");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/address-selector/div/form/div[1]/div[2]/default-select"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/address-selector/div/form/div[1]/div[2]/default-select/div/div[3]/default-option[1]"));
    type1(By.id("OrgLocality"), "Москва");
    type1(By.id("OrgStreet"), "Блаблабла");
    type1(By.id("OrgHouse"), "34");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[3]/div[1]/div/label"));
    scrollToItem(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[6]/span"));
    type1(By.id("Name"), "Testik Test");
    type1(By.id("Phone"), "89034567766");
    type1(By.id("LoginEmail"), email);
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color"),
            equalTo("rgba(0, 190, 106, 1)"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[1]/div"));
  }

  public void checkAddNewUserIncorrectZipcode(String email, String inn) throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    wd.get("http://test.ofd.ru/mk/clients?PageCount=100");
    wd.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/app/div/ng-component/div/div/div[3]/button"));
    type1(By.id("OrgInn"), inn);
    TimeUnit.SECONDS.sleep(1);
    type1(By.id("SignatoryName"), "Testеее Testеее");
    type1(By.id("SignatoryPosition"), "Тестовая организация");
    type1(By.id("OrgName"), "Front143");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[2]/default-select"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[2]/default-select/div/div[3]/default-option[2]"));
    type1(By.id("OrgPostalCode"), "12300");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/address-selector/div/form/div[1]/div[2]/default-select"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/address-selector/div/form/div[1]/div[2]/default-select/div/div[3]/default-option[1]"));
    type1(By.id("OrgLocality"), "Москва");
    type1(By.id("OrgHouse"), "34");
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[3]/div[1]/div/label"));
    scrollToItem(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[2]/div/client-form/div/form/div[6]/span"));
    type1(By.id("Name"), "Testik Test");
    type1(By.id("Phone"), "89034567766");
    type1(By.id("LoginEmail"), email);
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color"),
            equalTo("rgba(229, 233, 240, 1)"));
    click(By.xpath("/html/body/app/div/ng-component/modal/div/div[1]/div[1]/div"));
  }


}








































