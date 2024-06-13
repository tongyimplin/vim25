package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualNic;
import com.vmware.vim25.HostVirtualNicSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualNic", propOrder = {"device", "key", "portgroup", "spec", "port"})
public class HostVirtualNic extends DynamicData {
  @XmlElement(required = true)
  protected String device;
  
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String portgroup;
  
  @XmlElement(required = true)
  protected HostVirtualNicSpec spec;
  
  protected String port;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
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
  
  public String getPort() {
    return this.port;
  }
  
  public void setPort(String paramString) {
    this.port = paramString;
  }
}
