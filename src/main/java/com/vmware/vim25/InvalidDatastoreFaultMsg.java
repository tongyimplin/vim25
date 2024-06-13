package com.vmware.vim25;

import com.vmware.vim25.InvalidDatastore;
import com.vmware.vim25.InvalidDatastoreFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidDatastoreFault", targetNamespace = "urn:vim25")
public class InvalidDatastoreFaultMsg extends Exception {
  private InvalidDatastore faultInfo;
  
  public InvalidDatastoreFaultMsg(String paramString, InvalidDatastore paramInvalidDatastore) {
    super(paramString);
    this.faultInfo = paramInvalidDatastore;
  }
  
  public InvalidDatastoreFaultMsg(String paramString, InvalidDatastore paramInvalidDatastore, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidDatastore;
  }
  
  public InvalidDatastore getFaultInfo() {
    return this.faultInfo;
  }
}
