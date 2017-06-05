package ru.stqa.pft.testOfg.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void goToEditMailingAddress() {
      click(By.xpath("//a[@data-reactid='.0.1.1.1.0.1.$0.0.0.1.2.0']"));
  }

  public void goToEditFullName() {
    click(By.xpath("//a[@data-reactid='.0.1.1.1.0.1.$0.1.0.0.0.2.0']"));
  }

  public void goToEditPhone() {
    click(By.xpath("//a[@data-reactid='.0.1.1.1.0.1.$0.1.0.1.0.2.0']"));
  }

  public void goToEditLegalAddress() {
      click(By.xpath("//a[@data-reactid='.0.1.1.1.0.1.$0.0.0.0.2.0']"));
  }

  public void goToProfileEdit() {
    click(By.xpath("//span[@data-reactid='.0.1.0.1.1.2.2.1.0.0']"));
    click(By.xpath("//span[@data-reactid='.0.1.0.1.1.2.2.3.2.0']"));
    assertThat(wd.findElement(By.xpath("//p[@data-reactid='.0.1.1.1.0.1.$0.2.0.1.0']"))
            .getText(), equalTo("Является ли организация плательщиком НДС?"));
    //Assert.assertTrue(wd.findElement(By.xpath("//p[@data-reactid='.0.1.1.1.0.1.$0.2.0.1.0']")).getText().equals("Является ли организация плательщиком НДС?"));
  }

  public void submit1() {
    click(By.xpath("//div[@class='fd-text_right']//button[.='Сохранить']"));
  }

  public void submitFullName() {
    click(By.xpath("//button[@data-reactid='.0.1.1.1.0.1.$0.1.0.0.0.1.0']"));
  }

  public void submitPhone() {
    click(By.xpath("//button[@data-reactid='.0.1.1.1.0.1.$0.1.0.1.0.1.0']"));
  }

  public void submitFront79() {
    waitTheElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/p[1]"),"170005, Бежецк, школьная, 85, корп/стр: 1, офис/кв: 1");
    waitTheElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/p[1]"),"170005, Бежецк, школьная, 85, корп/стр: 1, офис/кв: 1");
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/p[1]")).getText(),
            equalTo("170005, Бежецк, школьная, 85, корп/стр: 1, офис/кв: 1"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/p[1]")).getText(),
            equalTo("170005, Бежецк, школьная, 85, корп/стр: 1, офис/кв: 1"));
    click(By.xpath("//div[@class='navbar']//span[.='zhanchikov@ofd.ru']"));
    click(By.xpath("//a[@class='fd-text fd-text_m']"));
  }

  public void submitFront77() {
    waitTheElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/p[1]"),"420095, Казань, ул Восход, 5, корп/стр: 3, офис/кв: 7");
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/p[1]")).getText(),
            equalTo("420095, Казань, ул Восход, 5, корп/стр: 3, офис/кв: 7"));
    click(By.xpath("//div[@class='navbar']//span[.='zhanchikov@ofd.ru']"));
    click(By.xpath("//a[@class='fd-text fd-text_m']"));
  }

  public void submitFront78() {
    waitTheElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/p[1]"),"140095, Тула, ул Восход, 67, корп/стр: 1, офис/кв: 94");
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/p[1]")).getText(),
            equalTo("140095, Тула, ул Восход, 67, корп/стр: 1, офис/кв: 94"));
    click(By.xpath("//div[@class='navbar']//span[.='zhanchikov@ofd.ru']"));
    click(By.xpath("//a[@class='fd-text fd-text_m']"));
  }

  public void submitFront82() {
    Assert.assertTrue(isElementPresent(By.xpath("//h2[@data-reactid='.0.1.1.1.0.1.$0.1.0.0.0.1']"))
            && wd.findElement(By.xpath("//h2[@data-reactid='.0.1.1.1.0.1.$0.1.0.0.0.1']")).getText().equals("Иванов Иван Иванович"));
    click(By.xpath("//div[@class='navbar']//span[.='zhanchikov@ofd.ru']"));
    click(By.xpath("//a[@class='fd-text fd-text_m']"));
  }

  public void submitFront83() {
    Assert.assertTrue(isElementPresent(By.xpath("//h2[@data-reactid='.0.1.1.1.0.1.$0.1.0.1.0.1']"))
            && wd.findElement(By.xpath("//h2[@data-reactid='.0.1.1.1.0.1.$0.1.0.1.0.1']")).getText().equals("89021112244"));
    click(By.xpath("//div[@class='navbar']//span[.='zhanchikov@ofd.ru']"));
    click(By.xpath("//a[@class='fd-text fd-text_m']"));
  }

  public void signOut() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[1]/span/span[1]"));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[2]/div[4]/a"));
    TimeUnit.SECONDS.sleep(2);
    //wd.navigate().refresh();
  }

  public void clickButtonConnect() {
    click(By.xpath("/html/body/div/div/header/div[3]/div/div[2]/nav/a[2]"));
  }

  public void selectWorkflow() {
    click(By.xpath("//div[@data-reactid='.0.1.1.1.0.1.$0.2.0.0.0.0']"));
    click(By.xpath("//*[.='Такском-Файлер']"));
    Assert.assertTrue(isElementPresent(By.xpath("//div[@data-reactid='.0.1.1.1.0.1.$0.2.0.0.0.0.2.0.1:0']")));
  }

  public void clickVAT(){
    click(By.xpath("//div[@data-reactid='.0.1.1.1.0.1.$0.2.0.1.1.1.0']"));
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='fw-label fw-label_success fw-label_size-static ']")));
    click(By.xpath("//div[@data-reactid='.0.1.1.1.0.1.$0.2.0.1.1.0.0']"));
    Assert.assertTrue(isElementPresent(By.xpath("//div[@class='fw-label fw-label_success fw-label_size-static ']")));
  }

  public void clickAddedCashMachine(){
    click(By.cssSelector("div.navbar-item a.btn-primary"));
  }

  public void clickMainLabel(){
    click(By.cssSelector("a.logo"));
  }

  public void checkingFormDocuments(){
    click(By.xpath("//a[@href='/lk/documents']"));
    Assert.assertTrue(isElementPresent(By.cssSelector("div.fw-col-11 span.vertical-align-middle"))
            && isElementPresent(By.cssSelector("div.fw-col-11 span.color-fade")));
  }

  public void addCashRegister(){
    click(By.cssSelector("div.pull-right a.analytics-registration"));
  }

  public void clickCashMachinePage(){
    click(By.xpath("//div[1]/a[2]"));
    click(By.xpath("//div[2]/div/div[1]/div/a/span"));
  }

  public void checkingCashMachinePage(){
    assertThat(wd.findElement(By.cssSelector("div.fw-card-body h2.font-size-24")).getText(), equalTo("Договор с OFD.RU"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[3]/div[2]/div/h3")).getText(), equalTo("Касса"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div[1]")).getText(), equalTo("Заводской номер кассы"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[3]/div[1]")).getText(), equalTo("Регистрационный номер кассы (РНМ)"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[5]/div[1]")).getText(), equalTo("Заводской номер фискального накопителя"));

  }

  public void checkingCashRegister(){
    Assert.assertTrue(isElementPresent(By.xpath("//input[@maxlength='20']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@maxlength='16']")));
    Assert.assertTrue(isElementPresent(By.cssSelector("div.margin-bottom-25 i.vertical-align-middle")));
    Assert.assertTrue(isElementPresent(By.cssSelector("div.ofd-uploader__tpl a.ofd-button_sky")));
    Assert.assertTrue(isElementPresent(By.cssSelector("div.ofd-uploader__upload button.fw-btn-info-light")));
    Assert.assertTrue(isElementPresent(By.cssSelector("div.fw-col_40 button.fw-btn-primary")));
  }

  public void checkingItemsOnRegistrationPage(){
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Inn']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Employee']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Name']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Kpp']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Ogrn']")));
    Assert.assertTrue(isElementPresent(By.className("input-group")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='PostalCode']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Region']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Locality']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Street']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='House']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Block']")));
    Assert.assertTrue(isElementPresent(By.xpath("//input[@name='Flat']")));
  }

  public void tabNavigation(){
    click(By.xpath("//a[@data-reactid='.0.1.0.1.1.1.0']"));
    Assert.assertTrue(isElementPresent(By.xpath("//h2[@data-reactid='.0.1.1.0.1.$0.0.1']")));
    click(By.xpath("//a[@data-reactid='.0.1.0.1.1.1.1']"));
    Assert.assertTrue(isElementPresent(By.xpath("//img[@data-reactid='.0.1.1.1.0.0']")));
  }

  public void goToEditAndAssertUpload(){
    click(By.xpath("//a[@data-reactid='.0.1.0.1.1.1.0']"));
    Assert.assertTrue(isElementPresent(By.xpath("//h2[@data-reactid='.0.1.1.0.1.$0.0.1']")));
    click(By.xpath("//input[@value='KktReport']"));
    click(By.xpath("//input[@value='CloseShiftReport']"));
    click(By.xpath("//input[@value='ReceiptReport']"));
    click(By.xpath("//input[@value='FiscalDocumentReport']"));
    Assert.assertTrue(isElementPresent(By.xpath("//h2[@data-reactid='.0.1.1.0.1.$0.1.0']")));
    click(By.xpath("//div[@data-reactid='.0.1.1.0.1.$0.1.1.0.0']"));
    click(By.xpath("//div[@data-reactid='.0.1.1.0.1.$0.1.1.1.0']"));
    click(By.xpath("//div[@data-reactid='.0.1.1.0.1.$0.1.1.2.0']"));
    Assert.assertTrue(isElementPresent(By.xpath("//h2[@data-reactid='.0.1.1.0.1.$0.2.0']")));
    click(By.xpath("//input[@value='1']"));
    click(By.xpath("//input[@value='2']"));
    Assert.assertTrue(isElementPresent(By.xpath("//div[@data-reactid='.0.1.1.0.1.$1.0']")));
  }

  public void checkingTabsMainPage(){
    Assert.assertTrue(isElementPresent(By.linkText("Проверить чек")));
    Assert.assertTrue(isElementPresent(By.linkText("Партнёрам")));
    Assert.assertTrue(isElementPresent(By.linkText("О компании")));
    Assert.assertTrue(isElementPresent(By.linkText("Новости")));
    Assert.assertTrue(isElementPresent(By.linkText("Информация")));
    Assert.assertTrue(isElementPresent(By.linkText("Разработчикам")));
    Assert.assertTrue(isElementPresent(By.linkText("Войти")));
    Assert.assertTrue(isElementPresent(By.cssSelector("a.btn-primary")));
    Assert.assertTrue(isElementPresent(By.cssSelector("a.btn-border-primary")));
    Assert.assertTrue(isElementPresent(By.className("material-icons")));
    Assert.assertTrue(isElementPresent(By.className("pull-right")));
  }

  public void clickTabsMainPage(){
    click(By.linkText("Проверить чек"));
    Assert.assertTrue(isElementPresent(By.className("till")));
    click(By.linkText("Партнёрам"));
    Assert.assertTrue(isElementPresent(By.className("table-col")));
    click(By.linkText("О компании"));
    Assert.assertTrue(isElementPresent(By.id("about")));
    click(By.linkText("Новости"));
    Assert.assertTrue(isElementPresent(By.id("news-page")));
    click(By.linkText("Информация"));
    Assert.assertTrue(isElementPresent(By.id("news-page")));
    click(By.linkText("Разработчикам"));
    Assert.assertTrue(isElementPresent(By.className("developers__content")));
  }

  public void checkDevelopersPage(){
    click(By.linkText("Разработчикам"));
    click(By.xpath("//a[@href='#v2-info']"));
    click(By.xpath("//a[@href='#v2-check-list']"));
    scrollToItem(By.cssSelector("div.developers__content span.developers__label"));
  }

  public void checkInformationPage(){
    click(By.linkText("Информация"));
    Assert.assertTrue(isElementPresent(By.id("news-page")));
  }

  public void checkInformationCompany(){
    click(By.linkText("О компании"));
    Assert.assertTrue(isElementPresent(By.id("about")));
    //Позже дополнить проверкой юр.информации о компании
  }

  public void checkPartnersPage(){
    click(By.linkText("Партнёрам"));
    Assert.assertTrue(isElementPresent(By.cssSelector("p.text_m")));
    assertThat(wd.findElement(By.cssSelector("div.container a.btn")).getText(), equalTo("СТАТЬ ПАРТНЕРОМ"));
    click(By.cssSelector("div.container a.btn"));

  }

  public void checkAttribute(){
    Assert.assertTrue(isElementPresent(By.xpath("//button[@disabled='']")));
  }

  public void checkNewsPage(){
    click(By.linkText("Новости"));
    Assert.assertTrue(isElementPresent(By.id("news-page")));
  }

  public void checkEmailWhenRegistering(){
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
  }

  public void checkEmailRegistrationForm(){
    Assert.assertTrue(isElementPresent(By.id("Email")));
    Assert.assertTrue(isElementPresent(By.id("Phone")));
    Assert.assertTrue(isElementPresent(By.id("FullName")));
    Assert.assertTrue(isElementPresent(By.id("Password")));
    Assert.assertTrue(isElementPresent(By.xpath("//button[@type='submit']")));
    Assert.assertTrue(isElementPresent(By.xpath("//a[@class='user-reg__in']")));
    type(By.id("Email"), "zhanchikov@ofd.ru");
    type(By.id("Phone"), "34234234");
    type(By.id("FullName"), "Test");
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), "12345");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.className("ofd-form__input-group-error")).getText(), equalTo("Аккаунт с таким E-Mail уже существует"));
  }

  public void checkEmailEmptyField(){
    type(By.id("Email"), "");
    type(By.id("Phone"), "34234234");
    type(By.id("FullName"), "Test");
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), "12345");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[1]/div")).getText(), equalTo("Поле обязательно для заполнения"));
  }

  public void checkPhoneEmptyField(){
    type(By.id("Email"), "test1@mail.ru");
    type(By.id("Phone"), "");
    type(By.id("FullName"), "Test");
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), "12345");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[2]/div")).getText(), equalTo("Поле обязательно для заполнения"));
  }

  public void checkChangePasswordEmailEmptyField(){
    click(By.linkText("Войти"));
    click(By.linkText("Забыли пароль?"));
    type(By.className("placeholder-center"), "f#fbfbdb@mail.ru");
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    assertThat(wd.findElement(By.className("input-error")).getText(), equalTo("Некорректный E-Mail"));
    type(By.className("placeholder-center"), "ffbfbdb@mail.ru");
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    assertThat(wd.findElement(By.className("input-error")).getText(), equalTo("Аккунт с таким логином не найден"));
    type(By.className("placeholder-center"), "");
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    assertThat(wd.findElement(By.className("input-error")).getText(), equalTo("Поле обязательно для заполнения"));
  }

  public void loginAccount(){
    click(By.linkText("Войти"));
  }

  public void loginToSystem(){
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "zhanchikov@ofd.ru");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "12345");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
  }

  public void checkUserNotRegister(){
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "zhanchikov@ofd.ru");
  }

  public void checkHomePage(){
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "test@mail.ru");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "12345");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]"))
            .getText(), equalTo("Ошибка авторизации"));
  }

  public void checkAuthorizationIncorrectEmail(){
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "testmail.ru");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "12345");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]"))
            .getText(), equalTo("Ошибка авторизации"));
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "test@mailru");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "12345");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]"))
            .getText(), equalTo("Ошибка авторизации"));
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "testТест@mail.ru");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "12345");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]"))
            .getText(), equalTo("Ошибка авторизации"));
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "t&es#t@mail.ru");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "12345");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]"))
            .getText(), equalTo("Ошибка авторизации"));
  }

  public void checkAuthorizationIncorrectPassword(){
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "zhanchikov@ofd.ru");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "123456");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]"))
            .getText(), equalTo("Ошибка авторизации"));
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "zhanchikov@ofd.ru");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "1234");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]"))
            .getText(), equalTo("Ошибка авторизации"));
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "12346");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]"))
            .getText(), equalTo("Ошибка авторизации"));
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "12%s345");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]"))
            .getText(), equalTo("Ошибка авторизации"));
  }

  public void checkAuthorizationEmptyInput(){
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[2]"))
            .getText(), equalTo("Поле обязательно для заполнения"));
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "zhanchikov@ofd.ru");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), "");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/span[2]"))
            .getText(), equalTo("Поле обязательно для заполнения"));
  }

  public void checkMessagePasswordChange(){
    click(By.linkText("Войти"));
    click(By.linkText("Забыли пароль?"));
    type(By.className("placeholder-center"), "test1@binka.me");
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/p")).getText(),
            equalTo("Мы отправили на почту письмо с инструкцией о смене пароля"));
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[1]/div"));
  }

  public void checkMessagePasswordChangeIncorrectEmail(){
    click(By.linkText("Войти"));
    click(By.linkText("Забыли пароль?"));
    type(By.className("placeholder-center"), "ergeger@mail.ru");
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/div/span[1]")).getText(),
            equalTo("Аккунт с таким логином не найден"));
    type(By.className("placeholder-center"), "test@@binka.me");
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/div/span[2]")).getText(),
            equalTo("Некорректный E-Mail"));
    type(By.className("placeholder-center"), "testbinka.me");
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/div/span[2]")).getText(),
            equalTo("Некорректный E-Mail"));
    type(By.className("placeholder-center"), "test@binkame");
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/div/span[2]")).getText(),
            equalTo("Некорректный E-Mail"));
    type(By.className("placeholder-center"), "");
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/div/span[2]")).getText(),
            equalTo("Поле обязательно для заполнения"));
    type(By.className("placeholder-center"), "tеst1@binka.me");//Буква "е" написана кириллицей
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/div/span[2]")).getText(),
            equalTo("Некорректный E-Mail"));
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[1]/div"));
  }

  public void newCustomerRegistration(String email, String password){
  type(By.id("Email"), email);
  type(By.id("Phone"), "89024951054");
  type(By.id("FullName"), "Test Test");
  click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
  type(By.id("Password"), password);
  click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[2]/button"));
  click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/p[2]/a"));
}

  public void finish(String confirmationLink, String password) {
    wd.get(confirmationLink);
    waitTheElement(By.xpath("//*[@id='app']/div/div[1]/div[3]/div[2]/div/div[2]/div/h4"), "Вход в личный кабинет ОФД");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/input"), "user1@localhost.localdomain");
    type(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[2]/input"), password);
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/button"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div/span")).getText(), equalTo("Все кассы"));
  }

  public void registrationUserToMailinator(String user){
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
  }

  public void newCustomerRegistration2(String email, String password) throws InterruptedException {
    wd.get("http://test.ofd.ru/");
    click(By.xpath("/html/body/div/div/header/div[3]/div/div[2]/nav/a[2]"));
    TimeUnit.SECONDS.sleep(2);
    type(By.id("Email"), email);
    type(By.id("Phone"), "89024951054");
    type(By.id("FullName"), "Test Test");
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), password);
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[2]/button"));
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/p[2]/a"));
    TimeUnit.SECONDS.sleep(35);
  }

  public void confirmationRegistration(String user, String email, String password) throws InterruptedException {
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
    click(By.id("lrefr"));
    wd.switchTo().frame(wd.findElement(By.id("ifmail")));
    waitTheElement(By.xpath("/html/body/div/div[3]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/h1"), "Подтвердите регистрацию");
    //scrollToItem(By.xpath("//a[@rel='nofollow']"));
    click(By.xpath("//p[@style='font-size:14px;line-height:22px;']//a"));
    wd.switchTo().defaultContent();
    TimeUnit.SECONDS.sleep(8);
    wd.get("http://test.ofd.ru/login");
    type(By.name("Login"), email);
    type(By.name("Password"), password);
    click(By.cssSelector("button.btn-primary"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(), equalTo("Регистрация данных пользователя"));
  }

  public void notConfirmEmailRegistration(String user, String email, String password) throws InterruptedException {
    //TimeUnit.SECONDS.sleep(30);
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
    click(By.id("lrefr"));
    wd.switchTo().frame(wd.findElement(By.id("ifmail")));
    assertThat(wd.findElement(By.xpath("//td[@align='center']//h1")).getText(),
            equalTo("Подтвердите регистрацию"));
    wd.switchTo().defaultContent();
    wd.get("http://test.ofd.ru/login");
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[1]/div"));
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("/html/body/div/div/header/div[3]/div/div[2]/nav/a[2]"));
    type(By.id("Email"), email);
    type(By.id("Phone"), "89024951054");
    type(By.id("FullName"), "Test Test");
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), password);
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[2]/button"));
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/p[2]/a"));
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
    TimeUnit.SECONDS.sleep(35);
    click(By.id("lrefr"));
    wd.switchTo().frame(wd.findElement(By.id("ifmail")));
    assertThat(wd.findElement(By.xpath("//td[@align='center']//h1")).getText(),
            equalTo("Подтвердите регистрацию"));
  }

  public void replaceForgotPassword(String user, String email, String password) throws InterruptedException{
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
    click(By.id("lrefr"));
    wd.switchTo().frame(wd.findElement(By.id("ifmail")));
    waitTheElement(By.xpath("/html/body/div/div[3]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/h1"), "Подтвердите регистрацию");
    click(By.xpath("//p[@style='font-size:14px;line-height:22px;']//a"));
    wd.switchTo().defaultContent();
    TimeUnit.SECONDS.sleep(8);
    wd.get("http://test.ofd.ru/login");
    type(By.name("Login"), email);
    type(By.name("Password"), password);
    click(By.cssSelector("button.btn-primary"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(), equalTo("Регистрация данных пользователя"));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/a/span"));
    click(By.xpath("/html/body/div/div/header/div[3]/div/div[2]/nav/a[1]"));
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/a"));
    TimeUnit.SECONDS.sleep(1);
    type(By.cssSelector("div.input-group input.placeholder-center"), email);
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[1]/div"));
    TimeUnit.SECONDS.sleep(30);
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
    //click(By.id("lrefr"));
    wd.switchTo().frame(wd.findElement(By.id("ifmail")));
    click(By.xpath("//p[@style='font-size:14px;line-height:22px;']//a"));
    wd.switchTo().defaultContent();
    TimeUnit.SECONDS.sleep(2);
    //wd.get("http://test.ofd.ru/change-password");
    ArrayList tabs2 = new ArrayList (wd.getWindowHandles());//Получение списка открытых окон браузера
    wd.switchTo().window((String) tabs2.get(2));//Переключение на второй таб в браузере
    click(By.xpath("/html/body/div/div/div[1]/div[5]/div[2]/div/div[2]/form/div[2]/i"));
    type(By.id("Password"), password);
    click(By.xpath("/html/body/div/div/div[1]/div[5]/div[2]/div/div[2]/form/div[3]/i"));
    type(By.id("ConfirmPassword"), password);
    TimeUnit.SECONDS.sleep(2);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(6);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(), equalTo("Регистрация данных пользователя"));
  }

  public void checkPasswordsNotMatch(String user, String email, String password) throws InterruptedException{
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
    click(By.id("lrefr"));
    wd.switchTo().frame(wd.findElement(By.id("ifmail")));
    waitTheElement(By.xpath("/html/body/div/div[3]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/h1"), "Подтвердите регистрацию");
    click(By.xpath("//p[@style='font-size:14px;line-height:22px;']//a"));
    wd.switchTo().defaultContent();
    TimeUnit.SECONDS.sleep(8);
    wd.get("http://test.ofd.ru/login");
    type(By.name("Login"), email);
    type(By.name("Password"), password);
    click(By.cssSelector("button.btn-primary"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(), equalTo("Регистрация данных пользователя"));
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/a/span"));
    click(By.xpath("/html/body/div/div/header/div[3]/div/div[2]/nav/a[1]"));
    click(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/a"));
    TimeUnit.SECONDS.sleep(1);
    type(By.cssSelector("div.input-group input.placeholder-center"), email);
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[2]/form/button"));
    click(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div/div[1]/div"));
    TimeUnit.SECONDS.sleep(30);
    wd.get("http://www.yopmail.com/en/");
    type1(By.id("login"), user);
    click(By.cssSelector("input.sbut"));
    wd.switchTo().frame(wd.findElement(By.id("ifmail")));
    click(By.xpath("//p[@style='font-size:14px;line-height:22px;']//a"));
    wd.switchTo().defaultContent();
    TimeUnit.SECONDS.sleep(2);
    ArrayList tabs2 = new ArrayList (wd.getWindowHandles());//Получение списка открытых окон браузера
    wd.switchTo().window((String) tabs2.get(2));//Переключение на второй таб в браузере
    click(By.xpath("/html/body/div/div/div[1]/div[5]/div[2]/div/div[2]/form/div[2]/i"));
    type(By.id("Password"), password);
    click(By.xpath("/html/body/div/div/div[1]/div[5]/div[2]/div/div[2]/form/div[3]/i"));
    type(By.id("ConfirmPassword"), "12346");
    TimeUnit.SECONDS.sleep(2);
    isElementPresent(By.xpath("//button[@disabled='']"));
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
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/label")).getText()
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
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button")).getText()
            , equalTo("Продолжить"));
    isElementPresent(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[4]/input"));
  }

  public void enterValuesInputFieldsLegalEntity() throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), "6685133850");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[2]/div/div/input"), "668501001");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(8);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div/span")).getText()
            , equalTo("Все кассы"));
  }

  public void enterValuesInputFieldsIndividualEntrepreneur() throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), "231105692926");
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[1]/div/div/input"), "Ленина");
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/div/div/input"), "36");
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1); //Ожидание, нужное для закрытия выпадающего списка выбора документооборота
    isElementPresent(By.cssSelector("div.fw-col-1 div.disabled"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    scrollToItem(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button"));
    TimeUnit.SECONDS.sleep(8);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div/span")).getText(),
            equalTo("Все кассы"));
  }

  public void checkInnNotFound() throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), "771597009077");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Юридическое лицо с таким ИНН не найдено"));
    click(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(),
            equalTo("Регистрация данных пользователя"));
  }

  public void checkNotCorrectInn() throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), "11133333333");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Неверный ИНН"));
    click(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(),
            equalTo("Регистрация данных пользователя"));
  }

  public void checkInnDoesNotExist() throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), "7805707229");
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1]")).getText(),
            equalTo("Юридическое лицо с таким ИНН не найдено"));
    click(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/button"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/h2")).getText(),
            equalTo("Регистрация данных пользователя"));
  }

  public void clearLegalAddressFields() throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), "6685133850");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1);
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[1]/div/div/input"));
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/input"));
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[3]/div/div/input"));
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[1]/div/div/input"));
    clear(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/div/div/input"));
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[3]/div/div/input"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[1]/div/span")).getText()
            , equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[2]/div/span")).getText()
            , equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div[3]/div/span")).getText()
            , equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[1]/div/span")).getText()
            , equalTo("Обязательно для заполнения"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/div/span")).getText()
            , equalTo("Обязательно для заполнения"));
    isElementPresent(By.xpath("//button[@disabled='']"));
  }

  public void enterValuesCorrespAddress() throws InterruptedException {
    type(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/input"), "6685133850");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[2]/div/div/input"), "668501001");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div[3]/div/div"));
    click(By.xpath("/html/body/div[4]/div/div/div/div[3]/span"));
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[4]/input"));
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[1]/div[1]/div/div/input"), "6206769");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[1]/div[2]/div/div/div[1]/input"), "Ивановская область");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[1]/div[3]/div/div/input"), "Тула");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[2]/div[1]/div/div/input"), "Ленина");
    type1(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[3]/div[5]/div[2]/div[2]/div/div/input"), "54");
    click(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div"));
    //scrollToItem(By.xpath(""));
  }

  public void notFillCorresoAddressFields(){

  }

  public void enterBecomePartner() throws InterruptedException {
    click(By.xpath("/html/body/div/div/header/div[3]/div/div[1]/nav/a[2]"));
    click(By.xpath("/html/body/div/div/div[1]/div[1]/section[1]/div/div/div[1]/p[2]/a"));
    TimeUnit.SECONDS.sleep(1);
  }

  public void fillingRegistrationFieldsNewPartner(String email, String password) throws InterruptedException {
    type(By.id("Email"), email);
    type(By.id("Phone"), "89054001020");
    type(By.id("FullName"), "Test Testov");
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/p[2]/a"));
    TimeUnit.SECONDS.sleep(30);
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

  public void confirmationRegistrationOnSite(String email, String password) throws InterruptedException {
    ArrayList tabs2 = new ArrayList (wd.getWindowHandles());//Получение списка открытых окон браузера
    wd.switchTo().window((String) tabs2.get(1));//Переключение на второй таб в браузере
    type(By.xpath("//input[@name='Login']"), email);
    type(By.xpath("//input[@name='Password']"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/h1")).getText()
            , equalTo("Анкета партнера"));

  }

  public void fillingRegistrationFieldsPartnerAlreadyExists(String email, String password){
    type(By.id("Email"), email);
    type(By.id("Phone"), "89054001020");
    type(By.id("FullName"), "Test Testov");
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[1]/div")).getText()
            , equalTo("Аккаунт с таким E-Mail уже существует"));
  }

  public void fillingRegistrationFieldsEmptyPhoneField(String email, String password){
    type(By.id("Email"), email);
    type(By.id("FullName"), "Test Testov");
    click(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/i"));
    type(By.id("Password"), password);
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[2]/div")).getText()
            , equalTo("Поле обязательно для заполнения"));
  }

  public void fillingRegistrationFieldsEmptyPasswordField(String email){
    type(By.id("Email"), email);
    type(By.id("Phone"), "89054001020");
    type(By.id("FullName"), "Test Testov");
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[4]/div")).getText()
            , equalTo("Поле обязательно для заполнения"));
  }

  public void fillingRegistrationFieldsEmptyAllFields(){
    click(By.xpath("//button[@type='submit']"));
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div/div[1]/div")).getText()
            , equalTo("Поле обязательно для заполнения"));
  }

  public void entranceToPartnerOffice(String email, String password) throws InterruptedException {
    type(By.xpath("//input[@name='Login']"), email);
    type(By.xpath("//input[@name='Password']"), password);
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(2);
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]/div/ul/li/a")).getText()
            , equalTo("Клиенты и Кассы"));
    assertThat(wd.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]/span/a/p")).getText()
            , equalTo("КАБИНЕТ ПАРТНЁРА"));
  }

  public void enterIncorrectEmail() throws InterruptedException {
    type(By.xpath("//input[@name='Login']"), "ofdtestpartne@yopmail.com");
    type(By.xpath("//input[@name='Password']"), "12345");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]")).getText()
            , equalTo("Неверный Email или пароль"));
    type(By.xpath("//input[@name='Login']"), "ofdtestpartneryopmail.com");
    type(By.xpath("//input[@name='Password']"), "12345");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]")).getText()
            , equalTo("Неверный Email или пароль"));
    type(By.xpath("//input[@name='Login']"), "ofdtestpartner@yopmailcom");
    type(By.xpath("//input[@name='Password']"), "12345");
    click(By.xpath("//button[@type='submit']"));
    TimeUnit.SECONDS.sleep(1);
    assertThat(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div/div[2]/div/form/div[1]/span[1]")).getText()
            , equalTo("Неверный Email или пароль"));
  }

}








































