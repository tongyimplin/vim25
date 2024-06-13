package com.vmware.vim25;

import com.vmware.vim25.SnapshotFault;
import com.vmware.vim25.SnapshotFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "SnapshotFaultFault", targetNamespace = "urn:vim25")
public class SnapshotFaultFaultMsg extends Exception {
  private SnapshotFault faultInfo;
  
  public SnapshotFaultFaultMsg(String paramString, SnapshotFault paramSnapshotFault) {
    super(paramString);
    this.faultInfo = paramSnapshotFault;
  }
  
  public SnapshotFaultFaultMsg(String paramString, SnapshotFault paramSnapshotFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramSnapshotFault;
  }
  
  public SnapshotFault getFaultInfo() {
    return this.faultInfo;
  }
}
