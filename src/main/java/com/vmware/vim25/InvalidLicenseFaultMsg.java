package com.vmware.vim25;

import com.vmware.vim25.InvalidLicense;
import com.vmware.vim25.InvalidLicenseFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidLicenseFault", targetNamespace = "urn:vim25")
public class InvalidLicenseFaultMsg extends Exception {
  private InvalidLicense faultInfo;
  
  public InvalidLicenseFaultMsg(String paramString, InvalidLicense paramInvalidLicense) {
    super(paramString);
    this.faultInfo = paramInvalidLicense;
  }
  
  public InvalidLicenseFaultMsg(String paramString, InvalidLicense paramInvalidLicense, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidLicense;
  }
  
  public InvalidLicense getFaultInfo() {
    return this.faultInfo;
  }
}
