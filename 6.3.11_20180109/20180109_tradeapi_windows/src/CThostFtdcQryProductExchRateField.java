/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcQryProductExchRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryProductExchRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryProductExchRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcQryProductExchRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    thosttradeapiJNI.CThostFtdcQryProductExchRateField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return thosttradeapiJNI.CThostFtdcQryProductExchRateField_ProductID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcQryProductExchRateField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcQryProductExchRateField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcQryProductExchRateField() {
    this(thosttradeapiJNI.new_CThostFtdcQryProductExchRateField(), true);
  }

}
