package com.vmware.vim25;

import com.vmware.vim25.IscsiFault;
import com.vmware.vim25.IscsiFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "IscsiFaultFault", targetNamespace = "urn:vim25")
public class IscsiFaultFaultMsg extends Exception {
  private IscsiFault faultInfo;
  
  public IscsiFaultFaultMsg(String paramString, IscsiFault paramIscsiFault) {
    super(paramString);
    this.faultInfo = paramIscsiFault;
  }
  
  public IscsiFaultFaultMsg(String paramString, IscsiFault paramIscsiFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramIscsiFault;
  }
  
  public IscsiFault getFaultInfo() {
    return this.faultInfo;
  }
}
