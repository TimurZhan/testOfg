package ru.stqa.pft.testOfg.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

//Карточка редактирования почтового адреса, в профиле клиента, помещена в объект
@XStreamAlias("mailingAddress")
public class MailingAddressData {
  private String index;
  private String region;
  private String locality;
  private String street;
  private String house;
  private String block;
  private String flat;

  public String getIndex() {
    return index;
  }

  public String getRegion() {
    return region;
  }

  public String getLocality() {
    return locality;
  }

  public String getStreet() {
    return street;
  }

  public String getHouse() {
    return house;
  }

  public String getBlock() {
    return block;
  }

  public String getFlat() {
    return flat;
  }

  public MailingAddressData withIndex(String index) {
    this.index = index;
    return this;
  }

  public MailingAddressData withRegion(String region) {
    this.region = region;
    return this;
  }

  public MailingAddressData withLocality(String locality) {
    this.locality = locality;
    return this;
  }

  public MailingAddressData withStreet(String street) {
    this.street = street;
    return this;
  }

  public MailingAddressData withHouse(String house) {
    this.house = house;
    return this;
  }

  public MailingAddressData withBlock(String block) {
    this.block = block;
    return this;
  }

  public MailingAddressData withFlat(String flat) {
    this.flat = flat;
    return this;
  }

}
