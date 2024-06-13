package com.vmware.vim25;

import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.MigrationFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "MigrationFaultFault", targetNamespace = "urn:vim25")
public class MigrationFaultFaultMsg extends Exception {
  private MigrationFault faultInfo;
  
  public MigrationFaultFaultMsg(String paramString, MigrationFault paramMigrationFault) {
    super(paramString);
    this.faultInfo = paramMigrationFault;
  }
  
  public MigrationFaultFaultMsg(String paramString, MigrationFault paramMigrationFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramMigrationFault;
  }
  
  public MigrationFault getFaultInfo() {
    return this.faultInfo;
  }
}
