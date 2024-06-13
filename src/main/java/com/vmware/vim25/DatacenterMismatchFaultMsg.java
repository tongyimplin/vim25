package com.vmware.vim25;

import com.vmware.vim25.DatacenterMismatch;
import com.vmware.vim25.DatacenterMismatchFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "DatacenterMismatchFault", targetNamespace = "urn:vim25")
public class DatacenterMismatchFaultMsg extends Exception {
  private DatacenterMismatch faultInfo;
  
  public DatacenterMismatchFaultMsg(String paramString, DatacenterMismatch paramDatacenterMismatch) {
    super(paramString);
    this.faultInfo = paramDatacenterMismatch;
  }
  
  public DatacenterMismatchFaultMsg(String paramString, DatacenterMismatch paramDatacenterMismatch, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramDatacenterMismatch;
  }
  
  public DatacenterMismatch getFaultInfo() {
    return this.faultInfo;
  }
}
