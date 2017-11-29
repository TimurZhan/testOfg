package ru.stqa.pft.testOfg.tests.pageInterfaceTests.checkingPersonalCabinet;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-66:Проверка формы добавления кассы
public class Front66CheckingAddingCashRegister extends TestBase {

  @Test(enabled = false)
  public void testCheckingAddingCashRegister(){
    app.getNavigationHelper().clickAddedCashMachine();
    app.getNavigationHelper().checkingCashRegister();
  }

}
