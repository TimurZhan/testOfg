package ru.stqa.pft.testOfg.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class HelperBase {

  protected WebDriver wd;

  public HelperBase(WebDriver wd) {
    this.wd = wd;
  }

  //Внести текст в какое-либо поле
  protected void type(By locator, String text) {
    click(locator);
    if (text != null) {
      //Извлекаем содержимое поля, если оно заполнено каким-либо значением.
      String existingText = wd.findElement(locator).getAttribute("value");
      //Реализована проверка, если содержимое текста НЕ совпадает с тем значением, что вводится, то заполняем данное поле.
      if (!text.equals(existingText)) {
        //wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
      }
    }
  }

  //Удалить текст из поля ввода
  protected void type1(By locator, String text) {
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  //Ожидание появление элемента на странице с определенным текстом.
  public void waitTheElement(By locator, String text){
    (new WebDriverWait(wd, 4)).until(ExpectedConditions
            .textToBePresentInElement(locator, text));
  }

  //Клик по элементу.
  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  //Очистить поле от введенного значения
  protected void clear(By locator) {
    //wd.findElement(locator).click();
    wd.findElement(locator).clear();
  }

  //Ввести в поле какое-то значение
  protected void sendKeys(By locator) {
    wd.findElement(locator).sendKeys();
  }

  //Метод для проверки на видимость элемента на странице
  public boolean isElementVisible(By locator) {
    Assert.assertTrue(wd.findElement(locator).isDisplayed());
    return true;
  }

  //Метод для проверки наличие элемента на странице
  public boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  //Метод для проверки того, что элемент невидим на странице
  public boolean invisibleElement(By locator) {
    Assert.assertTrue(!wd.findElement(locator).isDisplayed());
    return true;
  }

  //Прокрутить страницу до нужного элемента (если элемент находится ВНЕ зоне видимости экрана)
  public void scrollToItem(By locator) {
    WebElement element = wd.findElement(locator);
    ((JavascriptExecutor)wd).executeScript("arguments[0].scrollIntoView();", element);
  }

  //Конструкция для перехвата исключений.
  public boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  //Метод отвечает за загрузку файла из виндого окна
  public void attach(By locator, String pathToFile) throws InterruptedException, AWTException {
    File file = new File(pathToFile);
    click(locator);
    StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    Robot robot = new Robot();
    robot.delay(2000);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.delay(1000);
    robot.keyPress(KeyEvent.VK_V);
    robot.delay(1000);
    robot.keyRelease(KeyEvent.VK_V);
    robot.delay(1000);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.delay(1000);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.delay(1000);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.delay(1000);
  }

  //Метод отвечает за наведение курсора на элемент
  public void actions(By locator) {
    WebElement element = wd.findElement(locator);
    Actions actions = new Actions(wd);
    actions.moveToElement(element).perform();
  }
}
