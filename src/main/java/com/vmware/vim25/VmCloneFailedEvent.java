package com.vmware.vim25;

import com.vmware.vim25.FolderEventArgument;
import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VmCloneEvent;
import com.vmware.vim25.VmCloneFailedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmCloneFailedEvent", propOrder = {"destFolder", "destName", "destHost", "reason"})
public class VmCloneFailedEvent extends VmCloneEvent {
  @XmlElement(required = true)
  protected FolderEventArgument destFolder;
  
  @XmlElement(required = true)
  protected String destName;
  
  @XmlElement(required = true)
  protected HostEventArgument destHost;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault reason;
  
  public FolderEventArgument getDestFolder() {
    return this.destFolder;
  }
  
  public void setDestFolder(FolderEventArgument paramFolderEventArgument) {
    this.destFolder = paramFolderEventArgument;
  }
  
  public String getDestName() {
    return this.destName;
  }
  
  public void setDestName(String paramString) {
    this.destName = paramString;
  }
  
  public HostEventArgument getDestHost() {
    return this.destHost;
  }
  
  public void setDestHost(HostEventArgument paramHostEventArgument) {
    this.destHost = paramHostEventArgument;
  }
  
  public LocalizedMethodFault getReason() {
    return this.reason;
  }
  
  public void setReason(LocalizedMethodFault paramLocalizedMethodFault) {
    this.reason = paramLocalizedMethodFault;
  }
}
