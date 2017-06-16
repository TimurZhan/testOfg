package ru.stqa.pft.testOfg.appmanager;


import java.sql.*;

public class DbHelper {

  //Метод отвечает за удаление юзера из БД после прохождеиня теста
  public void deleteUserFromDB(String email) throws SQLException {
    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com", "sa", "yeisrkm21");
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
    conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com", "sa", "yeisrkm21");
    String insrtSQL = "update Manul_UserAccounts.dbo.UserAccount set Deleted = 0 where LoginEmail = ?";
    PreparedStatement resultSet = conn.prepareStatement(insrtSQL);
    resultSet.setString(1, email);
    resultSet.executeUpdate();
    resultSet.close();
    conn.close();
  }

  //Метод отвечает за удаление ИНН из БД после прохождеиня теста
  public void deleteINN(String inn) throws SQLException {
    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com", "sa", "yeisrkm21");
    String insrtSQL = "delete from Manul_CustomerModel.dbo.B2bAgreement where Inn = ?";
    PreparedStatement resultSet = conn.prepareStatement(insrtSQL);
    resultSet.setString(1, inn);
    resultSet.executeUpdate();
    resultSet.close();
    conn.close();
  }

  //Метод отвечает за получение и передачу AccountId юзера из БД
  public String getIdUser(String email) throws SQLException {
    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com","sa","yeisrkm21");
      Statement st = conn.createStatement();
      ResultSet resultSet = st.executeQuery("select Id from Manul_UserAccounts.dbo.UserAccount where LoginEmail = '"+email+"'");
      while (resultSet.next()){
        String id = resultSet.getString("Id");
        return id;
      }
    st.close();
    conn.close();
    return String.valueOf(resultSet);
  }

  //Метод отвечает за получение и передачу ConfirmCode юзера из БД
  public String getCodeUser(String email) throws SQLException {
    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com","sa","yeisrkm21");
    Statement st = conn.createStatement();
    ResultSet resultSet = st.executeQuery("select Code from Manul_UserAccounts.dbo.UserConfirmCode where UserAccountId in (select Id from Manul_UserAccounts.dbo.UserAccount where LoginEmail = '"+email+"') and Reason = 'Email'");
    while (resultSet.next()){
      String code = resultSet.getString("Code");
      return code;
    }
    st.close();
    conn.close();
    return String.valueOf(resultSet);
  }

  //Метод отвечает за получение и передачу Email юзера из БД
  public String getEmailUser(String email) throws SQLException {
    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com","sa","yeisrkm21");
    Statement st = conn.createStatement();
    ResultSet resultSet = st.executeQuery("select LoginEmail from Manul_UserAccounts.dbo.UserAccount where LoginEmail = '"+email+"'");
    while (resultSet.next()){
      String emailUser = resultSet.getString("LoginEmail");
      return emailUser;
    }
    st.close();
    conn.close();
    return String.valueOf(resultSet);
  }

}




























