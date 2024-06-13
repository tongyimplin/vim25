package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineMessage;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmMessageWarningEvent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmMessageWarningEvent", propOrder = {"message", "messageInfo"})
public class VmMessageWarningEvent extends VmEvent {
  @XmlElement(required = true)
  protected String message;
  
  protected List<VirtualMachineMessage> messageInfo;
  
  public String getMessage() {
    return this.message;
  }
  
  public void setMessage(String paramString) {
    this.message = paramString;
  }
  
  public List<VirtualMachineMessage> getMessageInfo() {
    if (this.messageInfo == null)
      this.messageInfo = new ArrayList<>(); 
    return this.messageInfo;
  }
}
