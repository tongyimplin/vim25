package com.vmware.vim25;

import com.vmware.vim25.CustomizationIPSettings;
import com.vmware.vim25.NodeNetworkSpec;
import com.vmware.vim25.PassiveNodeNetworkSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassiveNodeNetworkSpec", propOrder = {"failoverIpSettings"})
public class PassiveNodeNetworkSpec extends NodeNetworkSpec {
  protected CustomizationIPSettings failoverIpSettings;
  
  public CustomizationIPSettings getFailoverIpSettings() {
    return this.failoverIpSettings;
  }
  
  public void setFailoverIpSettings(CustomizationIPSettings paramCustomizationIPSettings) {
    this.failoverIpSettings = paramCustomizationIPSettings;
  }
}
