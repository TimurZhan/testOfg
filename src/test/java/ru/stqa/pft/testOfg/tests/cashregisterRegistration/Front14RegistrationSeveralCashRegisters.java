package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-14:Регистрация нескольких касс
public class Front14RegistrationSeveralCashRegisters extends TestBase {

  @Test
  public void testSeveralCashRegisters() throws InterruptedException {
    final int min1 = 10000; // Минимальное число для диапазона
    final int max1 = 999999; // Максимальное число для диапазона
    final int min = 10000000;
    final int max = 99999999;
    final int arbitrarily1 = rnd(min1, max1);
    final int rnd1 = rnd(min, max);
    final String arbitrarily2 = rnd1 + "30000000";

    final int min2 = 10000; // Минимальное число для диапазона
    final int max2 = 999999; // Максимальное число для диапазона
    final int min3 = 10000000;
    final int max3 = 99999999;
    final int arbitrarily3 = rnd(min2, max2);
    final int rnd2 = rnd(min3, max3);
    final String arbitrarily4 = rnd2 + "30000000";

    app.getNavigationHelper().checkSeveralCashRegisters(arbitrarily1, arbitrarily2, arbitrarily3, arbitrarily4);

  }

  //Метод получения псевдослучайного целого числа от min до max (включая max) для arbitrarily...
  private static int rnd(int min, int max) {
    max -= min;
    return (int) (Math.random() * ++max) + min;
  }


}
