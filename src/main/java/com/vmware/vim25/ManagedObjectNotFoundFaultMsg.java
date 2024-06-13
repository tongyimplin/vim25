package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectNotFound;
import com.vmware.vim25.ManagedObjectNotFoundFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "ManagedObjectNotFoundFault", targetNamespace = "urn:vim25")
public class ManagedObjectNotFoundFaultMsg extends Exception {
  private ManagedObjectNotFound faultInfo;
  
  public ManagedObjectNotFoundFaultMsg(String paramString, ManagedObjectNotFound paramManagedObjectNotFound) {
    super(paramString);
    this.faultInfo = paramManagedObjectNotFound;
  }
  
  public ManagedObjectNotFoundFaultMsg(String paramString, ManagedObjectNotFound paramManagedObjectNotFound, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramManagedObjectNotFound;
  }
  
  public ManagedObjectNotFound getFaultInfo() {
    return this.faultInfo;
  }
}
