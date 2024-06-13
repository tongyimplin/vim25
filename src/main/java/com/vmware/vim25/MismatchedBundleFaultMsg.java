package com.vmware.vim25;

import com.vmware.vim25.MismatchedBundle;
import com.vmware.vim25.MismatchedBundleFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "MismatchedBundleFault", targetNamespace = "urn:vim25")
public class MismatchedBundleFaultMsg extends Exception {
  private MismatchedBundle faultInfo;
  
  public MismatchedBundleFaultMsg(String paramString, MismatchedBundle paramMismatchedBundle) {
    super(paramString);
    this.faultInfo = paramMismatchedBundle;
  }
  
  public MismatchedBundleFaultMsg(String paramString, MismatchedBundle paramMismatchedBundle, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramMismatchedBundle;
  }
  
  public MismatchedBundle getFaultInfo() {
    return this.faultInfo;
  }
}
