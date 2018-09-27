package ru.stqa.pft.testOfg.tests;

import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.*;

public class DbConnetionTest {

  @Test(enabled = false)
  public void testDbConnection(){
    Connection conn = null;

    try {
      conn = DriverManager.getConnection("jdbc:sqlserver://тестовая база","юзер","пароль");
      Statement st = conn.createStatement();
      ResultSet resultSet = st.executeQuery("select Id from [Manul_UserAccounts].[dbo].[UserAccount] where LoginEmail = 'Тестовое мыло'");
      while (resultSet.next()){
        System.out.println(resultSet.getRow()+ ". "
                + resultSet.getString("Id"));
      }
      resultSet.close();
      st.close();
      conn.close();

    } catch (SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }

  }

  @Test(enabled = false)
  public void testDbConnection2(){
    Connection conn = null;

    try {
      conn = DriverManager.getConnection("jdbc:sqlserver://тестовая база","юзер","пароль");
      Statement st = conn.createStatement();
      ResultSet resultSet = st.executeQuery("select Code from [Manul_UserAccounts].[dbo].[UserConfirmCode] where UserAccountId in (select Id from [Manul_UserAccounts].[dbo].[UserAccount] where LoginEmail = 'тестовое мыло') and Reason = 'Email'");
      while (resultSet.next()){
        System.out.println(resultSet.getRow()+ ". "
                + resultSet.getString("Code"));
      }
      resultSet.close();
      st.close();
      conn.close();

    } catch (SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }

  }

  //Метод отвечает за добавление юзера из БД после прохождеиня теста
  @Test(enabled = true)
  public void addUserInDB1() throws SQLException {
    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:sqlserver://тестовая база","юзер","пароль");
    String insrtSQL = "update Manul_UserAccounts.dbo.UserAccount set Deleted = 0 where LoginEmail = 'userofd12345@yopmail.com'";
    PreparedStatement resultSet = conn.prepareStatement(insrtSQL);
    resultSet.executeUpdate();
    resultSet.close();
    conn.close();
  }

  //Добавляет юзера в систему
  @Test(enabled = true)
  public void sendGETRequest1() throws SQLException, IOException, InterruptedException {
    HttpResponse httpResponse1 =
            Request.Get("http://test.dof.ru/api/Authorization/Register?Email=ofdru2@yopmail.com&ExplicitPassword=123&Phone=89024567667&FirstName=Testovv?&LastName=Test?&UserType=Partner").
            execute().returnResponse();

    //После выполнения данного ГЕТзапроса, нужно перейти в базу и ручками выполнить СКЛ запрос на получение ID юзера и запрос на получение КОНФИРМ КОДА
  }

  //Подтверждение регистрации. Данный запрос выполнять только после получения КОНФИРМ КОДА и ID юзера, которые были полчуены ручками в БД
  @Test(enabled = true)
  public void sendGETRequest2() throws SQLException, IOException, InterruptedException {
    HttpResponse httpResponse1 =
            Request.Get("http://test.dof.ru/api/Authorization/ConfirmRegistration?AccountId=90B67B86-74E7-4ACA-9C33-564CC5C14A7B&ConfirmCode=997571").
                    execute().returnResponse();
  }

}
