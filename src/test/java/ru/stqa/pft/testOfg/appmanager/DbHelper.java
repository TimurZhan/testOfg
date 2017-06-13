package ru.stqa.pft.testOfg.appmanager;


import java.sql.*;

public class DbHelper {

  public DbHelper() throws SQLException {

    Connection conn = null;

    conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com","sa","yeisrkm21");
    Statement st = conn.createStatement();
    ResultSet resultSet = st.executeQuery("select * from [Manul_UserAccounts].[dbo].[UserAccount] where LoginEmail = 'userofd12345@yopmail.com'");
    while (resultSet.next()){
      System.out.println(resultSet.getRow()+ ". "
                + resultSet.getString("LoginEmail")
                + "\t" + resultSet.getString("FullName"));
    }
    resultSet.close();
    st.close();
    conn.close();

  }

  //Метод отвечает за удаление юзера из БД после прохождеиня теста
  public void deleteUserFromDB(String email) throws SQLException {

    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com","sa","yeisrkm21");

    String qwery = "update Manul_UserAccounts.dbo.UserAccount set Deleted = 1 where LoginEmail = ?";
    PreparedStatement resultSet = conn.prepareStatement(qwery);
    resultSet.setString(1, email);
    resultSet.executeUpdate();
    resultSet.close();
    conn.close();
  }

  //Метод отвечает за добавление юзера из БД после прохождеиня теста
  public void addUserInDB(String email) throws SQLException {

    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com","sa","yeisrkm21");
    String insrtSQL =  "update Manul_UserAccounts.dbo.UserAccount set Deleted = 0 where LoginEmail = ?";
    PreparedStatement resultSet = conn.prepareStatement(insrtSQL);
    resultSet.setString(1, email);
    resultSet.executeUpdate();
    resultSet.close();
    conn.close();
  }


  //Метод отвечает за удаление ИНН из БД после прохождеиня теста
  public void deleteINN(String inn) throws SQLException {

    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com","sa","yeisrkm21");
    String insrtSQL =  "delete from [Manul_CustomerModel].[dbo].[B2bAgreement] where Inn = ? ";
    PreparedStatement resultSet = conn.prepareStatement(insrtSQL);
    resultSet.setString(1, inn);
    resultSet.executeUpdate();
    resultSet.close();
    conn.close();
  }




}
