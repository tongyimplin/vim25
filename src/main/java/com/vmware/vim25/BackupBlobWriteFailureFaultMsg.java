package com.vmware.vim25;

import com.vmware.vim25.BackupBlobWriteFailure;
import com.vmware.vim25.BackupBlobWriteFailureFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "BackupBlobWriteFailureFault", targetNamespace = "urn:vim25")
public class BackupBlobWriteFailureFaultMsg extends Exception {
  private BackupBlobWriteFailure faultInfo;
  
  public BackupBlobWriteFailureFaultMsg(String paramString, BackupBlobWriteFailure paramBackupBlobWriteFailure) {
    super(paramString);
    this.faultInfo = paramBackupBlobWriteFailure;
  }
  
  public BackupBlobWriteFailureFaultMsg(String paramString, BackupBlobWriteFailure paramBackupBlobWriteFailure, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramBackupBlobWriteFailure;
  }
  
  public BackupBlobWriteFailure getFaultInfo() {
    return this.faultInfo;
  }
}
