package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchKeyedOpaqueBlob", propOrder = {"key", "opaqueData"})
public class DistributedVirtualSwitchKeyedOpaqueBlob extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String opaqueData;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getOpaqueData() {
    return this.opaqueData;
  }
  
  public void setOpaqueData(String paramString) {
    this.opaqueData = paramString;
  }
}
