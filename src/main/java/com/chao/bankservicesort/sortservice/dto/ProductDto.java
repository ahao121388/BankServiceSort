package com.chao.bankservicesort.sortservice.dto;

public class ProductDto {

  private int id;
  private String name;
  private String introduction;
  private int category;
  private int duration;
  private String setterName;
  private int state;

  @Override
  public String toString() {
    return "ProductDto{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", introduction='" + introduction + '\'' +
            ", category=" + category +
            ", duration=" + duration +
            ", setterName='" + setterName + '\'' +
            ", state=" + state +
            '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }

  public int getCategory() {
    return category;
  }

  public void setCategory(int category) {
    this.category = category;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public String getSetterName() {
    return setterName;
  }

  public void setSetterName(String setterName) {
    this.setterName = setterName;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }
}
