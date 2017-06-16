package ru.stqa.pft.testOfg.tests;

import org.testng.annotations.Test;
import java.sql.*;

public class DbConnetionTest {

  @Test
  public void testDbConnection(){
    Connection conn = null;

    try {
      conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com","sa","yeisrkm21");
      Statement st = conn.createStatement();
      ResultSet resultSet = st.executeQuery("select Id from [Manul_UserAccounts].[dbo].[UserAccount] where LoginEmail = 'zhanchikov@ofd.ru'");
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

  @Test
  public void testDbConnection2(){
    Connection conn = null;

    try {
      conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com","sa","yeisrkm21");
      Statement st = conn.createStatement();
      ResultSet resultSet = st.executeQuery("select Code from [Manul_UserAccounts].[dbo].[UserConfirmCode] where UserAccountId in (select Id from [Manul_UserAccounts].[dbo].[UserAccount] where LoginEmail = 'zhanchikov@ofd.ru') and Reason = 'Email'");
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

}