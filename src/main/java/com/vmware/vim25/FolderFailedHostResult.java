package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FolderFailedHostResult;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderFailedHostResult", propOrder = {"hostName", "host", "context", "fault"})
public class FolderFailedHostResult extends DynamicData {
  protected String hostName;
  
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected LocalizableMessage context;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public LocalizableMessage getContext() {
    return this.context;
  }
  
  public void setContext(LocalizableMessage paramLocalizableMessage) {
    this.context = paramLocalizableMessage;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
