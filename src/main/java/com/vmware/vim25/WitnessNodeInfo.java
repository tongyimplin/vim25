package com.vmware.vim25;

import com.vmware.vim25.CustomizationIPSettings;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.WitnessNodeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WitnessNodeInfo", propOrder = {"ipSettings", "biosUuid"})
public class WitnessNodeInfo extends DynamicData {
  @XmlElement(required = true)
  protected CustomizationIPSettings ipSettings;
  
  protected String biosUuid;
  
  public CustomizationIPSettings getIpSettings() {
    return this.ipSettings;
  }
  
  public void setIpSettings(CustomizationIPSettings paramCustomizationIPSettings) {
    this.ipSettings = paramCustomizationIPSettings;
  }
  
  public String getBiosUuid() {
    return this.biosUuid;
  }
  
  public void setBiosUuid(String paramString) {
    this.biosUuid = paramString;
  }
}
