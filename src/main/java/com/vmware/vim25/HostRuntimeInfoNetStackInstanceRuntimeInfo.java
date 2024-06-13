package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostRuntimeInfoNetStackInstanceRuntimeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRuntimeInfoNetStackInstanceRuntimeInfo", propOrder = {"netStackInstanceKey", "state", "vmknicKeys", "maxNumberOfConnections", "currentIpV6Enabled"})
public class HostRuntimeInfoNetStackInstanceRuntimeInfo extends DynamicData {
  @XmlElement(required = true)
  protected String netStackInstanceKey;
  
  protected String state;
  
  protected List<String> vmknicKeys;
  
  protected Integer maxNumberOfConnections;
  
  protected Boolean currentIpV6Enabled;
  
  public String getNetStackInstanceKey() {
    return this.netStackInstanceKey;
  }
  
  public void setNetStackInstanceKey(String paramString) {
    this.netStackInstanceKey = paramString;
  }
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
  public List<String> getVmknicKeys() {
    if (this.vmknicKeys == null)
      this.vmknicKeys = new ArrayList<>(); 
    return this.vmknicKeys;
  }
  
  public Integer getMaxNumberOfConnections() {
    return this.maxNumberOfConnections;
  }
  
  public void setMaxNumberOfConnections(Integer paramInteger) {
    this.maxNumberOfConnections = paramInteger;
  }
  
  public Boolean isCurrentIpV6Enabled() {
    return this.currentIpV6Enabled;
  }
  
  public void setCurrentIpV6Enabled(Boolean paramBoolean) {
    this.currentIpV6Enabled = paramBoolean;
  }
}
