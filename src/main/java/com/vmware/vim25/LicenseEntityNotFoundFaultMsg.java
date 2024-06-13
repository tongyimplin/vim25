package com.vmware.vim25;

import com.vmware.vim25.LicenseEntityNotFound;
import com.vmware.vim25.LicenseEntityNotFoundFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "LicenseEntityNotFoundFault", targetNamespace = "urn:vim25")
public class LicenseEntityNotFoundFaultMsg extends Exception {
  private LicenseEntityNotFound faultInfo;
  
  public LicenseEntityNotFoundFaultMsg(String paramString, LicenseEntityNotFound paramLicenseEntityNotFound) {
    super(paramString);
    this.faultInfo = paramLicenseEntityNotFound;
  }
  
  public LicenseEntityNotFoundFaultMsg(String paramString, LicenseEntityNotFound paramLicenseEntityNotFound, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramLicenseEntityNotFound;
  }
  
  public LicenseEntityNotFound getFaultInfo() {
    return this.faultInfo;
  }
}
