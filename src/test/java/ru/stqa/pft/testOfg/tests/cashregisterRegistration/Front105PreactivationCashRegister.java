package ru.stqa.pft.testOfg.tests.cashregisterRegistration;

import org.testng.annotations.Test;
import ru.stqa.pft.testOfg.tests.TestBase;

// Front-105:Регистрация кассы (предактивация)
public class Front105PreactivationCashRegister extends TestBase {

  @Test
  public void testPreactivation() throws InterruptedException {
    final int min1 = 12000;
    final int max1 = 27000;
    final int min2 = 10000000;
    final int max2 = 99999999;
    final int rnd1 = rnd(min1, max1);
    final int rnd2 = rnd(min2, max2);
    final String arbitrarily1 = "000" + rnd1;
    final String arbitrarily2 = rnd2 + "30000000";
    String email = "ofdtestpartner@yopmail.com";
    String password = "12345";

    app.getNavigationHelper().signOut();
    app.getNavigationHelper().loginToSystem(email, password);
    app.getNavigationHelper().checkPreactivationCashRegister(arbitrarily1, arbitrarily2);

  }

  //Метод получения псевдослучайного целого числа от min до max (включая max) для arbitrarily...
  private static int rnd(int min, int max) {
    max -= min;
    return (int) (Math.random() * ++max) + min;
  }

}
