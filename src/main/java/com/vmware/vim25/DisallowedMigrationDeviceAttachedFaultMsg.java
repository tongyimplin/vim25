package com.vmware.vim25;

import com.vmware.vim25.DisallowedMigrationDeviceAttached;
import com.vmware.vim25.DisallowedMigrationDeviceAttachedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "DisallowedMigrationDeviceAttachedFault", targetNamespace = "urn:vim25")
public class DisallowedMigrationDeviceAttachedFaultMsg extends Exception {
  private DisallowedMigrationDeviceAttached faultInfo;
  
  public DisallowedMigrationDeviceAttachedFaultMsg(String paramString, DisallowedMigrationDeviceAttached paramDisallowedMigrationDeviceAttached) {
    super(paramString);
    this.faultInfo = paramDisallowedMigrationDeviceAttached;
  }
  
  public DisallowedMigrationDeviceAttachedFaultMsg(String paramString, DisallowedMigrationDeviceAttached paramDisallowedMigrationDeviceAttached, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramDisallowedMigrationDeviceAttached;
  }
  
  public DisallowedMigrationDeviceAttached getFaultInfo() {
    return this.faultInfo;
  }
}
