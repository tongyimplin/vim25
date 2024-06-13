package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostMemberTransportZoneInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMemberTransportZoneInfo", propOrder = {"uuid", "type"})
public class DistributedVirtualSwitchHostMemberTransportZoneInfo extends DynamicData {
  @XmlElement(required = true)
  protected String uuid;
  
  @XmlElement(required = true)
  protected String type;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
}
