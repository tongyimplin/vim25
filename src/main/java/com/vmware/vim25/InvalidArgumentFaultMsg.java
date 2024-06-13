package com.vmware.vim25;

import com.vmware.vim25.InvalidArgument;
import com.vmware.vim25.InvalidArgumentFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidArgumentFault", targetNamespace = "urn:vim25")
public class InvalidArgumentFaultMsg extends Exception {
  private InvalidArgument faultInfo;
  
  public InvalidArgumentFaultMsg(String paramString, InvalidArgument paramInvalidArgument) {
    super(paramString);
    this.faultInfo = paramInvalidArgument;
  }
  
  public InvalidArgumentFaultMsg(String paramString, InvalidArgument paramInvalidArgument, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidArgument;
  }
  
  public InvalidArgument getFaultInfo() {
    return this.faultInfo;
  }
}
