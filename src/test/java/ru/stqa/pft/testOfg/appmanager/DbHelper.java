package ru.stqa.pft.testOfg.appmanager;


import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.sql.*;

public class DbHelper {

  //Метод отвечает за удаление юзера из БД после прохождеиня теста
  public void deleteUserFromDB(String email) throws SQLException {
    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:sqlserver://wifimenu.cj57wuvexwcc.eu-central-1.rds.amazonaws.com", "sa", "yeisrkm21");
    String qwery1 = "update Manul_UserAccounts.dbo.UserAccount set Deleted = 1 where LoginEmail = ?";
    String qwery2 = "update Manul_CustomerModel.dbo.OFDAgreement set Deleted = 1 where UserAccountId in (select Id from [Manul_UserAccounts].[dbo].[UserAccount] where LoginEmail = ?)";
    PreparedStatement resultSet1 = conn.prepareStatement(qwery1);
    PreparedStatement resultSet2 = conn.prepareStatement(qwery2);
    resultSet1.setString(1, email);
    resultSet2.setString(1, email);
    resultSet1.executeUpdate();
    resultSet2.executeUpdate();
    resultSet1.close();
    resultSet2.close();
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
    String insrtSQL1 = "delete from Manul_CustomerModel.dbo.B2bAgreement where Inn = ?";
    String insrtSQL2 = "delete from Manul_CustomerModel.dbo.OFDAgreement where OrgInn = ?";
    PreparedStatement resultSet1 = conn.prepareStatement(insrtSQL1);
    PreparedStatement resultSet2 = conn.prepareStatement(insrtSQL2);
    resultSet1.setString(1, inn);
    resultSet2.setString(1, inn);
    resultSet1.executeUpdate();
    resultSet2.executeUpdate();
    resultSet1.close();
    resultSet2.close();
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

  public void sendPOSTRequestForChangePassword(String email, String password2) throws SQLException, IOException, InterruptedException {
    String code = getCodeUser(email);
    Request.Post("http://test.ofd.ru/api/userAccounts/ChangePassword").bodyForm(
            new BasicNameValuePair("Email", email),
            new BasicNameValuePair("ConfirmationCode", code),
            new BasicNameValuePair("NewPassword", password2)
    ).execute().returnResponse();
  }

  public void sendPOSTRequestForChangeEmail(String email1, String email2, String password) throws SQLException, IOException, InterruptedException {
    HttpResponse httpResponse1 = Request.Post("http://test.ofd.ru/api/userAccounts/sendEmailChangeConfirmationCode").bodyForm(
            new BasicNameValuePair("Email", email2),
            new BasicNameValuePair("Password", password)
    ).execute().returnResponse();

    String code = getCodeUser(email2);
    HttpResponse httpResponse2 = Request.Post("http://test.ofd.ru/api/userAccounts/changeEmail").bodyForm(
            new BasicNameValuePair("Email", email2),
            new BasicNameValuePair("ConfirmationCode", code)
    ).execute().returnResponse();
  }


  public void sendPOSTRequestForLinkFormation(String email) throws SQLException, IOException {
    Request.Post("http://test.ofd.ru/api/userAccounts/SendPasswordChangeConfirmationCode").bodyForm(
            new BasicNameValuePair("Email", email)
    ).execute();
  }

  //Метод отвечает за подтверждение регистрации
  public void sendGETRequestForRegConfirm(String email) throws SQLException, IOException {
    String id = getIdUser(email);
    String code = getCodeUser(email);
    Request.Get("http://test.ofd.ru/api/Authorization/ConfirmRegistration?AccountId="+id+"&ConfirmCode="+code).execute();
  }

}




























