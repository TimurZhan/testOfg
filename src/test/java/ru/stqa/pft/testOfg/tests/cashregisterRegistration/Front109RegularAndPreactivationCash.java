package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

//Front-109:Регистрация кассы (предактивация и обычные кассы)
public class Front109RegularAndPreactivationCash extends TestBase {

  @Test
  public void testRegularAndPreactivation() throws InterruptedException {
    final int min1 = 12000;
    final int max1 = 27000;
    final int rnd1 = rnd(min1, max1);
    final String arbitrarily1 = "000" + rnd1;

    final int min4 = 10000000;// Минимальное число для диапазона
    final int max4 = 99999999;// Максимальное число для диапазона
    final int rnd3 = rnd(min4, max4);
    final String arbitrarily2 = rnd3 + "30000000";

    final int min2 = 10000; // Минимальное число для диапазона
    final int max2 = 999999; // Максимальное число для диапазона
    final int arbitrarily3 = rnd(min2, max2);

    final int min3 = 10000000;
    final int max3 = 99999999;
    final int rnd2 = rnd(min3, max3);
    final String arbitrarily4 = rnd2 + "30000000";

    String email = "ofdtestpartner@yopmail.com";
    String password = "12345";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkRegularAndPreactivationCash(arbitrarily1, arbitrarily2, arbitrarily3, arbitrarily4);
  }

  //Метод получения псевдослучайного целого числа от min до max (включая max) для arbitrarily...
  private static int rnd(int min, int max) {
    max -= min;
    return (int) (Math.random() * ++max) + min;
  }

}
