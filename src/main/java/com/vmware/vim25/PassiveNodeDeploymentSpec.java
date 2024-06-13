package com.vmware.vim25;

import com.vmware.vim25.CustomizationIPSettings;
import com.vmware.vim25.NodeDeploymentSpec;
import com.vmware.vim25.PassiveNodeDeploymentSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassiveNodeDeploymentSpec", propOrder = {"failoverIpSettings"})
public class PassiveNodeDeploymentSpec extends NodeDeploymentSpec {
  protected CustomizationIPSettings failoverIpSettings;
  
  public CustomizationIPSettings getFailoverIpSettings() {
    return this.failoverIpSettings;
  }
  
  public void setFailoverIpSettings(CustomizationIPSettings paramCustomizationIPSettings) {
    this.failoverIpSettings = paramCustomizationIPSettings;
  }
}
