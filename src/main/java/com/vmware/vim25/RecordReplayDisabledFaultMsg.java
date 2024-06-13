package com.vmware.vim25;

import com.vmware.vim25.RecordReplayDisabled;
import com.vmware.vim25.RecordReplayDisabledFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "RecordReplayDisabledFault", targetNamespace = "urn:vim25")
public class RecordReplayDisabledFaultMsg extends Exception {
  private RecordReplayDisabled faultInfo;
  
  public RecordReplayDisabledFaultMsg(String paramString, RecordReplayDisabled paramRecordReplayDisabled) {
    super(paramString);
    this.faultInfo = paramRecordReplayDisabled;
  }
  
  public RecordReplayDisabledFaultMsg(String paramString, RecordReplayDisabled paramRecordReplayDisabled, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramRecordReplayDisabled;
  }
  
  public RecordReplayDisabled getFaultInfo() {
    return this.faultInfo;
  }
}
