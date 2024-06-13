package com.vmware.vim25;

import com.vmware.vim25.CustomizationIPSettings;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FailoverNodeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailoverNodeInfo", propOrder = {"clusterIpSettings", "failoverIp", "biosUuid"})
public class FailoverNodeInfo extends DynamicData {
  @XmlElement(required = true)
  protected CustomizationIPSettings clusterIpSettings;
  
  protected CustomizationIPSettings failoverIp;
  
  protected String biosUuid;
  
  public CustomizationIPSettings getClusterIpSettings() {
    return this.clusterIpSettings;
  }
  
  public void setClusterIpSettings(CustomizationIPSettings paramCustomizationIPSettings) {
    this.clusterIpSettings = paramCustomizationIPSettings;
  }
  
  public CustomizationIPSettings getFailoverIp() {
    return this.failoverIp;
  }
  
  public void setFailoverIp(CustomizationIPSettings paramCustomizationIPSettings) {
    this.failoverIp = paramCustomizationIPSettings;
  }
  
  public String getBiosUuid() {
    return this.biosUuid;
  }
  
  public void setBiosUuid(String paramString) {
    this.biosUuid = paramString;
  }
}
