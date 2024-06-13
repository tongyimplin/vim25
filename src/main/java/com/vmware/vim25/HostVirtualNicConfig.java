package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualNicConfig;
import com.vmware.vim25.HostVirtualNicSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualNicConfig", propOrder = {"changeOperation", "device", "portgroup", "spec"})
public class HostVirtualNicConfig extends DynamicData {
  protected String changeOperation;
  
  protected String device;
  
  @XmlElement(required = true)
  protected String portgroup;
  
  protected HostVirtualNicSpec spec;
  
  public String getChangeOperation() {
    return this.changeOperation;
  }
  
  public void setChangeOperation(String paramString) {
    this.changeOperation = paramString;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public String getPortgroup() {
    return this.portgroup;
  }
  
  public void setPortgroup(String paramString) {
    this.portgroup = paramString;
  }
  
  public HostVirtualNicSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostVirtualNicSpec paramHostVirtualNicSpec) {
    this.spec = paramHostVirtualNicSpec;
  }
}
