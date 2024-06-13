package com.vmware.vim25;

import com.vmware.vim25.TaskInProgress;
import com.vmware.vim25.TaskInProgressFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "TaskInProgressFault", targetNamespace = "urn:vim25")
public class TaskInProgressFaultMsg extends Exception {
  private TaskInProgress faultInfo;
  
  public TaskInProgressFaultMsg(String paramString, TaskInProgress paramTaskInProgress) {
    super(paramString);
    this.faultInfo = paramTaskInProgress;
  }
  
  public TaskInProgressFaultMsg(String paramString, TaskInProgress paramTaskInProgress, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramTaskInProgress;
  }
  
  public TaskInProgress getFaultInfo() {
    return this.faultInfo;
  }
}
