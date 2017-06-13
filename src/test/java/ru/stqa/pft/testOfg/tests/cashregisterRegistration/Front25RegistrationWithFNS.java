package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-25:Проверка формы ФНС
public class Front25RegistrationWithFNS extends TestBase {

  @Test
  public void testRegistrationWithFNS() throws InterruptedException {
    final int min1 = 10000; // Минимальное число для диапазона
    final int max1 = 999999; // Максимальное число для диапазона
    final int arbitrarily1 = rnd(min1, max1);

    final int min = 10000000;
    final int max = 99999999;
    final int rnd = rnd(min, max);
    final String arbitrarily2 = rnd + "30000000";

    app.getNavigationHelper().checkRegistrationWithFNS(arbitrarily1, arbitrarily2);
  }


  //Метод получения псевдослучайного целого числа от min до max (включая max) для arbitrarily1
  private static int rnd(int min, int max) {
    max -= min;
    return (int) (Math.random() * ++max) + min;
  }

}
