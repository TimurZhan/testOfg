package ru.stqa.pft.testOfg.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.stqa.pft.testOfg.appmanager.ApplicationManager;
import ru.yandex.qatools.allure.annotations.Attachment;

//Данный класс отвечает за реализацию функционала создания скриншотов ПРИ ПАДЕНИИ ТЕСТОВ. Которые в дальнейшем будут помещены в Allure-отчет
public class MyTestListener implements ITestListener {

  @Override
  public void onTestStart(ITestResult result) {

  }

  @Override
  public void onTestSuccess(ITestResult result) {

  }

  @Override
  public void onTestFailure(ITestResult result) {
    ApplicationManager app = (ApplicationManager) result.getTestContext().getAttribute("app");
    saveScreenshot(app.takeScreenshot());
  }

  //Тут цепляется скриншот к отчету
  @Attachment(value = "Page screenshot", type = "image/png")
  private byte[] saveScreenshot(byte[] screenShot){
    return screenShot;
  }

  @Override
  public void onTestSkipped(ITestResult result) {

  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

  }

  @Override
  public void onStart(ITestContext context) {

  }

  @Override
  public void onFinish(ITestContext context) {

  }
}
