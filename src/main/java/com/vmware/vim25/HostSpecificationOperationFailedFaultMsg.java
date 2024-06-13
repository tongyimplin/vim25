package com.vmware.vim25;

import com.vmware.vim25.HostSpecificationOperationFailed;
import com.vmware.vim25.HostSpecificationOperationFailedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "HostSpecificationOperationFailedFault", targetNamespace = "urn:vim25")
public class HostSpecificationOperationFailedFaultMsg extends Exception {
  private HostSpecificationOperationFailed faultInfo;
  
  public HostSpecificationOperationFailedFaultMsg(String paramString, HostSpecificationOperationFailed paramHostSpecificationOperationFailed) {
    super(paramString);
    this.faultInfo = paramHostSpecificationOperationFailed;
  }
  
  public HostSpecificationOperationFailedFaultMsg(String paramString, HostSpecificationOperationFailed paramHostSpecificationOperationFailed, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramHostSpecificationOperationFailed;
  }
  
  public HostSpecificationOperationFailed getFaultInfo() {
    return this.faultInfo;
  }
}
