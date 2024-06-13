package com.vmware.vim25;

import com.vmware.vim25.HostIncompatibleForRecordReplay;
import com.vmware.vim25.HostIncompatibleForRecordReplayFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "HostIncompatibleForRecordReplayFault", targetNamespace = "urn:vim25")
public class HostIncompatibleForRecordReplayFaultMsg extends Exception {
  private HostIncompatibleForRecordReplay faultInfo;
  
  public HostIncompatibleForRecordReplayFaultMsg(String paramString, HostIncompatibleForRecordReplay paramHostIncompatibleForRecordReplay) {
    super(paramString);
    this.faultInfo = paramHostIncompatibleForRecordReplay;
  }
  
  public HostIncompatibleForRecordReplayFaultMsg(String paramString, HostIncompatibleForRecordReplay paramHostIncompatibleForRecordReplay, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramHostIncompatibleForRecordReplay;
  }
  
  public HostIncompatibleForRecordReplay getFaultInfo() {
    return this.faultInfo;
  }
}
