package com.vmware.vim25;

import com.vmware.vim25.NotSupported;
import com.vmware.vim25.NotSupportedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "NotSupportedFault", targetNamespace = "urn:vim25")
public class NotSupportedFaultMsg extends Exception {
  private NotSupported faultInfo;
  
  public NotSupportedFaultMsg(String paramString, NotSupported paramNotSupported) {
    super(paramString);
    this.faultInfo = paramNotSupported;
  }
  
  public NotSupportedFaultMsg(String paramString, NotSupported paramNotSupported, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramNotSupported;
  }
  
  public NotSupported getFaultInfo() {
    return this.faultInfo;
  }
}
