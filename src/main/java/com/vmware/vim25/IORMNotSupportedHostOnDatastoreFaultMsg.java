package com.vmware.vim25;

import com.vmware.vim25.IORMNotSupportedHostOnDatastore;
import com.vmware.vim25.IORMNotSupportedHostOnDatastoreFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "IORMNotSupportedHostOnDatastoreFault", targetNamespace = "urn:vim25")
public class IORMNotSupportedHostOnDatastoreFaultMsg extends Exception {
  private IORMNotSupportedHostOnDatastore faultInfo;
  
  public IORMNotSupportedHostOnDatastoreFaultMsg(String paramString, IORMNotSupportedHostOnDatastore paramIORMNotSupportedHostOnDatastore) {
    super(paramString);
    this.faultInfo = paramIORMNotSupportedHostOnDatastore;
  }
  
  public IORMNotSupportedHostOnDatastoreFaultMsg(String paramString, IORMNotSupportedHostOnDatastore paramIORMNotSupportedHostOnDatastore, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramIORMNotSupportedHostOnDatastore;
  }
  
  public IORMNotSupportedHostOnDatastore getFaultInfo() {
    return this.faultInfo;
  }
}
