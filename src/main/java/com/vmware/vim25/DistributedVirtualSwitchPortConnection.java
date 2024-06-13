package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchPortConnection;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchPortConnection", propOrder = {"switchUuid", "portgroupKey", "portKey", "connectionCookie"})
public class DistributedVirtualSwitchPortConnection extends DynamicData {
  @XmlElement(required = true)
  protected String switchUuid;
  
  protected String portgroupKey;
  
  protected String portKey;
  
  protected Integer connectionCookie;
  
  public String getSwitchUuid() {
    return this.switchUuid;
  }
  
  public void setSwitchUuid(String paramString) {
    this.switchUuid = paramString;
  }
  
  public String getPortgroupKey() {
    return this.portgroupKey;
  }
  
  public void setPortgroupKey(String paramString) {
    this.portgroupKey = paramString;
  }
  
  public String getPortKey() {
    return this.portKey;
  }
  
  public void setPortKey(String paramString) {
    this.portKey = paramString;
  }
  
  public Integer getConnectionCookie() {
    return this.connectionCookie;
  }
  
  public void setConnectionCookie(Integer paramInteger) {
    this.connectionCookie = paramInteger;
  }
}
