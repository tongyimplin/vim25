package com.vmware.vim25;

import com.vmware.vim25.LicenseServerUnavailable;
import com.vmware.vim25.LicenseServerUnavailableFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "LicenseServerUnavailableFault", targetNamespace = "urn:vim25")
public class LicenseServerUnavailableFaultMsg extends Exception {
  private LicenseServerUnavailable faultInfo;
  
  public LicenseServerUnavailableFaultMsg(String paramString, LicenseServerUnavailable paramLicenseServerUnavailable) {
    super(paramString);
    this.faultInfo = paramLicenseServerUnavailable;
  }
  
  public LicenseServerUnavailableFaultMsg(String paramString, LicenseServerUnavailable paramLicenseServerUnavailable, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramLicenseServerUnavailable;
  }
  
  public LicenseServerUnavailable getFaultInfo() {
    return this.faultInfo;
  }
}
