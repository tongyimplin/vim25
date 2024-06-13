package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostGraphicsConfig;
import com.vmware.vim25.HostGraphicsConfigDeviceType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostGraphicsConfig", propOrder = {"hostDefaultGraphicsType", "sharedPassthruAssignmentPolicy", "deviceType"})
public class HostGraphicsConfig extends DynamicData {
  @XmlElement(required = true)
  protected String hostDefaultGraphicsType;
  
  @XmlElement(required = true)
  protected String sharedPassthruAssignmentPolicy;
  
  protected List<HostGraphicsConfigDeviceType> deviceType;
  
  public String getHostDefaultGraphicsType() {
    return this.hostDefaultGraphicsType;
  }
  
  public void setHostDefaultGraphicsType(String paramString) {
    this.hostDefaultGraphicsType = paramString;
  }
  
  public String getSharedPassthruAssignmentPolicy() {
    return this.sharedPassthruAssignmentPolicy;
  }
  
  public void setSharedPassthruAssignmentPolicy(String paramString) {
    this.sharedPassthruAssignmentPolicy = paramString;
  }
  
  public List<HostGraphicsConfigDeviceType> getDeviceType() {
    if (this.deviceType == null)
      this.deviceType = new ArrayList<>(); 
    return this.deviceType;
  }
}
