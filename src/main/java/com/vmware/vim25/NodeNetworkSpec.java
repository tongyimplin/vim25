package com.vmware.vim25;

import com.vmware.vim25.CustomizationIPSettings;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NodeNetworkSpec;
import com.vmware.vim25.PassiveNodeNetworkSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeNetworkSpec", propOrder = {"ipSettings"})
@XmlSeeAlso({PassiveNodeNetworkSpec.class})
public class NodeNetworkSpec extends DynamicData {
  @XmlElement(required = true)
  protected CustomizationIPSettings ipSettings;
  
  public CustomizationIPSettings getIpSettings() {
    return this.ipSettings;
  }
  
  public void setIpSettings(CustomizationIPSettings paramCustomizationIPSettings) {
    this.ipSettings = paramCustomizationIPSettings;
  }
}
