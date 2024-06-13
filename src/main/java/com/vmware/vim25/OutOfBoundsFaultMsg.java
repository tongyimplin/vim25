package com.vmware.vim25;

import com.vmware.vim25.OutOfBounds;
import com.vmware.vim25.OutOfBoundsFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "OutOfBoundsFault", targetNamespace = "urn:vim25")
public class OutOfBoundsFaultMsg extends Exception {
  private OutOfBounds faultInfo;
  
  public OutOfBoundsFaultMsg(String paramString, OutOfBounds paramOutOfBounds) {
    super(paramString);
    this.faultInfo = paramOutOfBounds;
  }
  
  public OutOfBoundsFaultMsg(String paramString, OutOfBounds paramOutOfBounds, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramOutOfBounds;
  }
  
  public OutOfBounds getFaultInfo() {
    return this.faultInfo;
  }
}
