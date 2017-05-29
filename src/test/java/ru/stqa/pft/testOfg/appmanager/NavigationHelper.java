package ru.stqa.pft.testOfg.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.hamcrest.CoreMatchers.*;
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

  public void signOut() {
    click(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[1]/span/span[1]"));
    click(By.xpath("//a[@class='fd-text fd-text_m']"));
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

}
