package com.vmware.vim25;

import com.vmware.vim25.InsufficientResourcesFault;
import com.vmware.vim25.InsufficientResourcesFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InsufficientResourcesFaultFault", targetNamespace = "urn:vim25")
public class InsufficientResourcesFaultFaultMsg extends Exception {
  private InsufficientResourcesFault faultInfo;
  
  public InsufficientResourcesFaultFaultMsg(String paramString, InsufficientResourcesFault paramInsufficientResourcesFault) {
    super(paramString);
    this.faultInfo = paramInsufficientResourcesFault;
  }
  
  public InsufficientResourcesFaultFaultMsg(String paramString, InsufficientResourcesFault paramInsufficientResourcesFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInsufficientResourcesFault;
  }
  
  public InsufficientResourcesFault getFaultInfo() {
    return this.faultInfo;
  }
}
