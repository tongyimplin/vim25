package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualNicOpaqueNetworkSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualNicOpaqueNetworkSpec", propOrder = {"opaqueNetworkId", "opaqueNetworkType"})
public class HostVirtualNicOpaqueNetworkSpec extends DynamicData {
  @XmlElement(required = true)
  protected String opaqueNetworkId;
  
  @XmlElement(required = true)
  protected String opaqueNetworkType;
  
  public String getOpaqueNetworkId() {
    return this.opaqueNetworkId;
  }
  
  public void setOpaqueNetworkId(String paramString) {
    this.opaqueNetworkId = paramString;
  }
  
  public String getOpaqueNetworkType() {
    return this.opaqueNetworkType;
  }
  
  public void setOpaqueNetworkType(String paramString) {
    this.opaqueNetworkType = paramString;
  }
}
