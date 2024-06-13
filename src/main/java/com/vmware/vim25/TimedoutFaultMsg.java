package com.vmware.vim25;

import com.vmware.vim25.Timedout;
import com.vmware.vim25.TimedoutFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "TimedoutFault", targetNamespace = "urn:vim25")
public class TimedoutFaultMsg extends Exception {
  private Timedout faultInfo;
  
  public TimedoutFaultMsg(String paramString, Timedout paramTimedout) {
    super(paramString);
    this.faultInfo = paramTimedout;
  }
  
  public TimedoutFaultMsg(String paramString, Timedout paramTimedout, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramTimedout;
  }
  
  public Timedout getFaultInfo() {
    return this.faultInfo;
  }
}
