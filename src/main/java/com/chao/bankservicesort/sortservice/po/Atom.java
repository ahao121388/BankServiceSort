package com.chao.bankservicesort.sortservice.po;


public class Atom {

  private int id;
  private String name;
  private String functionTip;
  private String className;
  private int category;
  private int F;
  private int state;

  @Override
  public String toString() {
    return "Atom{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", functionTip='" + functionTip + '\'' +
            ", className='" + className + '\'' +
            ", category=" + category +
            ", F=" + F +
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

  public String getFunctionTip() {
    return functionTip;
  }

  public void setFunctionTip(String functionTip) {
    this.functionTip = functionTip;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public int getCategory() {
    return category;
  }

  public void setCategory(int category) {
    this.category = category;
  }

  public int getF() {
    return F;
  }

  public void setF(int f) {
    F = f;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }
}
