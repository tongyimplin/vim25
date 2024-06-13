package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMemberPnicSpec", propOrder = {"pnicDevice", "uplinkPortKey", "uplinkPortgroupKey", "connectionCookie"})
public class DistributedVirtualSwitchHostMemberPnicSpec extends DynamicData {
  @XmlElement(required = true)
  protected String pnicDevice;
  
  protected String uplinkPortKey;
  
  protected String uplinkPortgroupKey;
  
  protected Integer connectionCookie;
  
  public String getPnicDevice() {
    return this.pnicDevice;
  }
  
  public void setPnicDevice(String paramString) {
    this.pnicDevice = paramString;
  }
  
  public String getUplinkPortKey() {
    return this.uplinkPortKey;
  }
  
  public void setUplinkPortKey(String paramString) {
    this.uplinkPortKey = paramString;
  }
  
  public String getUplinkPortgroupKey() {
    return this.uplinkPortgroupKey;
  }
  
  public void setUplinkPortgroupKey(String paramString) {
    this.uplinkPortgroupKey = paramString;
  }
  
  public Integer getConnectionCookie() {
    return this.connectionCookie;
  }
  
  public void setConnectionCookie(Integer paramInteger) {
    this.connectionCookie = paramInteger;
  }
}
