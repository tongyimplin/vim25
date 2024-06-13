package com.vmware.vim25;

import com.vmware.vim25.DatastoreNotWritableOnHost;
import com.vmware.vim25.DatastoreNotWritableOnHostFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "DatastoreNotWritableOnHostFault", targetNamespace = "urn:vim25")
public class DatastoreNotWritableOnHostFaultMsg extends Exception {
  private DatastoreNotWritableOnHost faultInfo;
  
  public DatastoreNotWritableOnHostFaultMsg(String paramString, DatastoreNotWritableOnHost paramDatastoreNotWritableOnHost) {
    super(paramString);
    this.faultInfo = paramDatastoreNotWritableOnHost;
  }
  
  public DatastoreNotWritableOnHostFaultMsg(String paramString, DatastoreNotWritableOnHost paramDatastoreNotWritableOnHost, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramDatastoreNotWritableOnHost;
  }
  
  public DatastoreNotWritableOnHost getFaultInfo() {
    return this.faultInfo;
  }
}
