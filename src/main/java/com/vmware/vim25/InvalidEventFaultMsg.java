package com.vmware.vim25;

import com.vmware.vim25.InvalidEvent;
import com.vmware.vim25.InvalidEventFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidEventFault", targetNamespace = "urn:vim25")
public class InvalidEventFaultMsg extends Exception {
  private InvalidEvent faultInfo;
  
  public InvalidEventFaultMsg(String paramString, InvalidEvent paramInvalidEvent) {
    super(paramString);
    this.faultInfo = paramInvalidEvent;
  }
  
  public InvalidEventFaultMsg(String paramString, InvalidEvent paramInvalidEvent, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidEvent;
  }
  
  public InvalidEvent getFaultInfo() {
    return this.faultInfo;
  }
}
