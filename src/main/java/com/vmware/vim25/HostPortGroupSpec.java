package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetworkPolicy;
import com.vmware.vim25.HostPortGroupSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPortGroupSpec", propOrder = {"name", "vlanId", "vswitchName", "policy"})
public class HostPortGroupSpec extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  protected int vlanId;
  
  @XmlElement(required = true)
  protected String vswitchName;
  
  @XmlElement(required = true)
  protected HostNetworkPolicy policy;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public int getVlanId() {
    return this.vlanId;
  }
  
  public void setVlanId(int paramInt) {
    this.vlanId = paramInt;
  }
  
  public String getVswitchName() {
    return this.vswitchName;
  }
  
  public void setVswitchName(String paramString) {
    this.vswitchName = paramString;
  }
  
  public HostNetworkPolicy getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(HostNetworkPolicy paramHostNetworkPolicy) {
    this.policy = paramHostNetworkPolicy;
  }
}
