package com.vmware.vim25;

import com.vmware.vim25.InvalidDatastorePath;
import com.vmware.vim25.InvalidDatastorePathFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidDatastorePathFault", targetNamespace = "urn:vim25")
public class InvalidDatastorePathFaultMsg extends Exception {
  private InvalidDatastorePath faultInfo;
  
  public InvalidDatastorePathFaultMsg(String paramString, InvalidDatastorePath paramInvalidDatastorePath) {
    super(paramString);
    this.faultInfo = paramInvalidDatastorePath;
  }
  
  public InvalidDatastorePathFaultMsg(String paramString, InvalidDatastorePath paramInvalidDatastorePath, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidDatastorePath;
  }
  
  public InvalidDatastorePath getFaultInfo() {
    return this.faultInfo;
  }
}
