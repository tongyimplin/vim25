package com.vmware.vim25;

import com.vmware.vim25.TooManyHosts;
import com.vmware.vim25.TooManyHostsFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "TooManyHostsFault", targetNamespace = "urn:vim25")
public class TooManyHostsFaultMsg extends Exception {
  private TooManyHosts faultInfo;
  
  public TooManyHostsFaultMsg(String paramString, TooManyHosts paramTooManyHosts) {
    super(paramString);
    this.faultInfo = paramTooManyHosts;
  }
  
  public TooManyHostsFaultMsg(String paramString, TooManyHosts paramTooManyHosts, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramTooManyHosts;
  }
  
  public TooManyHosts getFaultInfo() {
    return this.faultInfo;
  }
}
