package com.vmware.vim25;

import com.vmware.vim25.EsxAgentHostManagerUpdateConfigRequestType;
import com.vmware.vim25.HostEsxAgentHostManagerConfigInfo;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsxAgentHostManagerUpdateConfigRequestType", propOrder = {"_this", "configInfo"})
public class EsxAgentHostManagerUpdateConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostEsxAgentHostManagerConfigInfo configInfo;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostEsxAgentHostManagerConfigInfo getConfigInfo() {
    return this.configInfo;
  }
  
  public void setConfigInfo(HostEsxAgentHostManagerConfigInfo paramHostEsxAgentHostManagerConfigInfo) {
    this.configInfo = paramHostEsxAgentHostManagerConfigInfo;
  }
}
