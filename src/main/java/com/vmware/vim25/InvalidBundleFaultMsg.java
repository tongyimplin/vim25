package com.vmware.vim25;

import com.vmware.vim25.InvalidBundle;
import com.vmware.vim25.InvalidBundleFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidBundleFault", targetNamespace = "urn:vim25")
public class InvalidBundleFaultMsg extends Exception {
  private InvalidBundle faultInfo;
  
  public InvalidBundleFaultMsg(String paramString, InvalidBundle paramInvalidBundle) {
    super(paramString);
    this.faultInfo = paramInvalidBundle;
  }
  
  public InvalidBundleFaultMsg(String paramString, InvalidBundle paramInvalidBundle, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidBundle;
  }
  
  public InvalidBundle getFaultInfo() {
    return this.faultInfo;
  }
}
