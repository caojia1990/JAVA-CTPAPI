/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcCurrDRIdentityField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcCurrDRIdentityField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCurrDRIdentityField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcCurrDRIdentityField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDRIdentityID(int value) {
    thosttradeapiJNI.CThostFtdcCurrDRIdentityField_DRIdentityID_set(swigCPtr, this, value);
  }

  public int getDRIdentityID() {
    return thosttradeapiJNI.CThostFtdcCurrDRIdentityField_DRIdentityID_get(swigCPtr, this);
  }

  public CThostFtdcCurrDRIdentityField() {
    this(thosttradeapiJNI.new_CThostFtdcCurrDRIdentityField(), true);
  }

}