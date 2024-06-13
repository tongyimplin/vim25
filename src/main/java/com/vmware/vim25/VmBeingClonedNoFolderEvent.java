package com.vmware.vim25;

import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.VmBeingClonedNoFolderEvent;
import com.vmware.vim25.VmCloneEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmBeingClonedNoFolderEvent", propOrder = {"destName", "destHost"})
public class VmBeingClonedNoFolderEvent extends VmCloneEvent {
  @XmlElement(required = true)
  protected String destName;
  
  @XmlElement(required = true)
  protected HostEventArgument destHost;
  
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
}
