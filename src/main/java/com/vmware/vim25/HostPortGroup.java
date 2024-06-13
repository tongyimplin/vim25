package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetworkPolicy;
import com.vmware.vim25.HostPortGroup;
import com.vmware.vim25.HostPortGroupPort;
import com.vmware.vim25.HostPortGroupSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPortGroup", propOrder = {"key", "port", "vswitch", "computedPolicy", "spec"})
public class HostPortGroup extends DynamicData {
  protected String key;
  
  protected List<HostPortGroupPort> port;
  
  protected String vswitch;
  
  @XmlElement(required = true)
  protected HostNetworkPolicy computedPolicy;
  
  @XmlElement(required = true)
  protected HostPortGroupSpec spec;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public List<HostPortGroupPort> getPort() {
    if (this.port == null)
      this.port = new ArrayList<>(); 
    return this.port;
  }
  
  public String getVswitch() {
    return this.vswitch;
  }
  
  public void setVswitch(String paramString) {
    this.vswitch = paramString;
  }
  
  public HostNetworkPolicy getComputedPolicy() {
    return this.computedPolicy;
  }
  
  public void setComputedPolicy(HostNetworkPolicy paramHostNetworkPolicy) {
    this.computedPolicy = paramHostNetworkPolicy;
  }
  
  public HostPortGroupSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostPortGroupSpec paramHostPortGroupSpec) {
    this.spec = paramHostPortGroupSpec;
  }
}
