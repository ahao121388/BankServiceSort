package com.chao.bankservicesort.sortservice.po;

public class Product {

  //  编辑项
  private String name;
  private String introduction;
  private int category;
  private int sumStock;
  private int duration;
  private double annualizedInterestRate;
  private int personalAmountLimit;
  private int dayAmountLimit;
  private int riskRank;
  private int interestSettlementMethod;
  private int sellDuration;
  private int incrementAmount;
  private int initialDepositAmount;

  //  非编辑项
  private String atomSequence;

  //  自动填充项
  private int id; //id，自动递增
  private int state; // （0已撤销，1已保存，2已发布）
  private String issuedTime;
  private String setterId;


  @Override
  public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            ", introduction='" + introduction + '\'' +
            ", category=" + category +
            ", sumStock=" + sumStock +
            ", duration=" + duration +
            ", annualizedInterestRate=" + annualizedInterestRate +
            ", personalAmountLimit=" + personalAmountLimit +
            ", dayAmountLimit=" + dayAmountLimit +
            ", riskRank=" + riskRank +
            ", interestSettlementMethod=" + interestSettlementMethod +
            ", sellDuration=" + sellDuration +
            ", incrementAmount=" + incrementAmount +
            ", initialDepositAmount=" + initialDepositAmount +
            ", atomSequence='" + atomSequence + '\'' +
            ", id=" + id +
            ", issuedTime='" + issuedTime + '\'' +
            ", state=" + state +
            ", setterId='" + setterId + '\'' +
            '}';
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

  public int getSumStock() {
    return sumStock;
  }

  public void setSumStock(int sumStock) {
    this.sumStock = sumStock;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public double getAnnualizedInterestRate() {
    return annualizedInterestRate;
  }

  public void setAnnualizedInterestRate(double annualizedInterestRate) {
    this.annualizedInterestRate = annualizedInterestRate;
  }

  public int getPersonalAmountLimit() {
    return personalAmountLimit;
  }

  public void setPersonalAmountLimit(int personalAmountLimit) {
    this.personalAmountLimit = personalAmountLimit;
  }

  public int getDayAmountLimit() {
    return dayAmountLimit;
  }

  public void setDayAmountLimit(int dayAmountLimit) {
    this.dayAmountLimit = dayAmountLimit;
  }

  public int getRiskRank() {
    return riskRank;
  }

  public void setRiskRank(int riskRank) {
    this.riskRank = riskRank;
  }

  public int getInterestSettlementMethod() {
    return interestSettlementMethod;
  }

  public void setInterestSettlementMethod(int interestSettlementMethod) {
    this.interestSettlementMethod = interestSettlementMethod;
  }

  public int getSellDuration() {
    return sellDuration;
  }

  public void setSellDuration(int sellDuration) {
    this.sellDuration = sellDuration;
  }

  public int getIncrementAmount() {
    return incrementAmount;
  }

  public void setIncrementAmount(int incrementAmount) {
    this.incrementAmount = incrementAmount;
  }

  public int getInitialDepositAmount() {
    return initialDepositAmount;
  }

  public void setInitialDepositAmount(int initialDepositAmount) {
    this.initialDepositAmount = initialDepositAmount;
  }

  public String getAtomSequence() {
    return atomSequence;
  }

  public void setAtomSequence(String atomSequence) {
    this.atomSequence = atomSequence;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getIssuedTime() {
    return issuedTime;
  }

  public void setIssuedTime(String issuedTime) {
    this.issuedTime = issuedTime;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  public String getSetterId() {
    return setterId;
  }

  public void setSetterId(String setterId) {
    this.setterId = setterId;
  }
}
