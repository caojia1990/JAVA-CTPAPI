/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcErrExecOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcErrExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcErrExecOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcErrExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_UserID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_ActionType_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_PosiDirection_get(swigCPtr, this);
  }

  public void setReservePositionFlag(char value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
  }

  public char getReservePositionFlag() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_ReservePositionFlag_get(swigCPtr, this);
  }

  public void setCloseFlag(char value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_CloseFlag_set(swigCPtr, this, value);
  }

  public char getCloseFlag() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_CloseFlag_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_ClientID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_MacAddress_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thostmduserapiJNI.CThostFtdcErrExecOrderField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thostmduserapiJNI.CThostFtdcErrExecOrderField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcErrExecOrderField() {
    this(thostmduserapiJNI.new_CThostFtdcErrExecOrderField(), true);
  }

}