package com.vmware.vim25;

import com.vmware.vim25.InaccessibleDatastore;
import com.vmware.vim25.InaccessibleDatastoreFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InaccessibleDatastoreFault", targetNamespace = "urn:vim25")
public class InaccessibleDatastoreFaultMsg extends Exception {
  private InaccessibleDatastore faultInfo;
  
  public InaccessibleDatastoreFaultMsg(String paramString, InaccessibleDatastore paramInaccessibleDatastore) {
    super(paramString);
    this.faultInfo = paramInaccessibleDatastore;
  }
  
  public InaccessibleDatastoreFaultMsg(String paramString, InaccessibleDatastore paramInaccessibleDatastore, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInaccessibleDatastore;
  }
  
  public InaccessibleDatastore getFaultInfo() {
    return this.faultInfo;
  }
}
