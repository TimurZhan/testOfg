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
      ResultSet resultSet = st.executeQuery("select * from [Manul_UserAccounts].[dbo].[UserAccount] where LoginEmail = 'zhanchikov@ofd.ru'");
      while (resultSet.next()){
        System.out.println(resultSet.getRow()+ ". "
                + resultSet.getString("LoginEmail")
                + "\t" + resultSet.getString("FullName"));
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