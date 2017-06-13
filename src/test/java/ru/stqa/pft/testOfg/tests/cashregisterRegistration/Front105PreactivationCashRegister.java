package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-105:Регистрация кассы (предактивация)
public class Front105PreactivationCashRegister extends TestBase {

  @Test
  public void testPreactivation() throws InterruptedException {
    final int min = 10000000;
    final int max = 99999999;
    final int rnd1 = rnd(min, max);
    final String arbitrarily = rnd1 + "30000000";

    app.getNavigationHelper().checkPreactivationCashRegister(arbitrarily);

  }

  //Метод получения псевдослучайного целого числа от min до max (включая max) для arbitrarily...
  private static int rnd(int min, int max) {
    max -= min;
    return (int) (Math.random() * ++max) + min;
  }

}
