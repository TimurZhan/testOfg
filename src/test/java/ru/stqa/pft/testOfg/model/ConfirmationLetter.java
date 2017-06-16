package ru.stqa.pft.testOfg.model;

//Создан объект для пиьсма, где будет содержаться ссылка на подтверждение регистрации.
public class ConfirmationLetter {

  private String link;

  public String getLink(String id) {
    return link;
  }

  public ConfirmationLetter withLink1(String link) {
    this.link = link;
    return this;
  }

  public ConfirmationLetter withLink2(String link) {
    this.link = link;
    return this;
  }

}
