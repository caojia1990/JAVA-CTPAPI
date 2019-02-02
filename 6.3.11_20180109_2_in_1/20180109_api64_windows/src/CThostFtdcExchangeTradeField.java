/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcExchangeTradeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeTradeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcExchangeTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_TradeID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_Direction_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_OrderSysID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_ClientID_get(swigCPtr, this);
  }

  public void setTradingRole(char value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_TradingRole_set(swigCPtr, this, value);
  }

  public char getTradingRole() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_TradingRole_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_Price_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_Volume_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_TradeType_get(swigCPtr, this);
  }

  public void setPriceSource(char value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_PriceSource_set(swigCPtr, this, value);
  }

  public char getPriceSource() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_PriceSource_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_TraderID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_OrderLocalID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_ClearingPartID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_BusinessUnit_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_SequenceNo_get(swigCPtr, this);
  }

  public void setTradeSource(char value) {
    thosttraderapiJNI.CThostFtdcExchangeTradeField_TradeSource_set(swigCPtr, this, value);
  }

  public char getTradeSource() {
    return thosttraderapiJNI.CThostFtdcExchangeTradeField_TradeSource_get(swigCPtr, this);
  }

  public CThostFtdcExchangeTradeField() {
    this(thosttraderapiJNI.new_CThostFtdcExchangeTradeField(), true);
  }

}