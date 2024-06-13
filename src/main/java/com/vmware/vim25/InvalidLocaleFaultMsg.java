package com.vmware.vim25;

import com.vmware.vim25.InvalidLocale;
import com.vmware.vim25.InvalidLocaleFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidLocaleFault", targetNamespace = "urn:vim25")
public class InvalidLocaleFaultMsg extends Exception {
  private InvalidLocale faultInfo;
  
  public InvalidLocaleFaultMsg(String paramString, InvalidLocale paramInvalidLocale) {
    super(paramString);
    this.faultInfo = paramInvalidLocale;
  }
  
  public InvalidLocaleFaultMsg(String paramString, InvalidLocale paramInvalidLocale, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidLocale;
  }
  
  public InvalidLocale getFaultInfo() {
    return this.faultInfo;
  }
}
