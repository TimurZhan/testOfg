package ru.stqa.pft.testOfg.model;


import com.thoughtworks.xstream.annotations.XStreamAlias;

//Карточка редактирования юр. адреса, в профиле клиента, помещена в объект
@XStreamAlias("legalAddressData")
public class LegalAddressData {

  private String index;
  private String locality;
  private String Street;
  private String House;
  private String Block;
  private String Flat;

  public String getIndex() {
    return index;
  }

  public String getLocality() {
    return locality;
  }

  public String getStreet() {
    return Street;
  }

  public String getHouse() {
    return House;
  }

  public String getBlock() {
    return Block;
  }

  public String getFlat() {
    return Flat;
  }


  public LegalAddressData withIndex(String index) {
    this.index = index;
    return this;
  }

  public LegalAddressData withLocality(String locality) {
    this.locality = locality;
    return this;
  }

  public LegalAddressData withStreet(String street) {
    Street = street;
    return this;
  }

  public LegalAddressData withHouse(String house) {
    House = house;
    return this;
  }

  public LegalAddressData withBlock(String block) {
    Block = block;
    return this;
  }

  public LegalAddressData withFlat(String flat) {
    Flat = flat;
    return this;
  }

}
