package ru.stqa.pft.testOfg.model;

//Карточка редактирования Телефона и ФИО, в профиле клиента, помещена в объект
public class PersonalInformationUserData {


    private String fullname;
    private String phone;

    public String getfullname() {
      return fullname;
    }

    public String getPhone() {
      return phone;
    }

  public PersonalInformationUserData withFullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

  public PersonalInformationUserData withPhone(String phone) {
    this.phone = phone;
    return this;
  }
}
