package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostGraphicsConfigDeviceType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostGraphicsConfigDeviceType", propOrder = {"deviceId", "graphicsType"})
public class HostGraphicsConfigDeviceType extends DynamicData {
  @XmlElement(required = true)
  protected String deviceId;
  
  @XmlElement(required = true)
  protected String graphicsType;
  
  public String getDeviceId() {
    return this.deviceId;
  }
  
  public void setDeviceId(String paramString) {
    this.deviceId = paramString;
  }
  
  public String getGraphicsType() {
    return this.graphicsType;
  }
  
  public void setGraphicsType(String paramString) {
    this.graphicsType = paramString;
  }
}
