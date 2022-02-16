package com.chao.bankservicesort.sortservice.dto;


public class SetterLoginDto {

  private String phoneNumber;
  private String passwd;

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public String getPasswd() {
    return passwd;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  @Override
  public String toString() {
    return "SetterLoginDto{" +
            "phoneNumber='" + phoneNumber + '\'' +
            ", passwd='" + passwd + '\'' +
            '}';
  }
}
