package ru.stqa.pft.testOfg.model;

//Создан объект для пиьсма, где будет содержаться ссылка на подтверждение регистрации.
public class ConfirmationLetter {

  private String link;

  public String getLink() {
    return link;
  }

  public ConfirmationLetter withLink(String link) {
    this.link = link;
    return this;
  }

}
