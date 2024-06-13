package com.vmware.vim25;

import com.vmware.vim25.ClusterNetworkConfigSpec;
import com.vmware.vim25.CustomizationIPSettings;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterNetworkConfigSpec", propOrder = {"networkPortGroup", "ipSettings"})
public class ClusterNetworkConfigSpec extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference networkPortGroup;
  
  @XmlElement(required = true)
  protected CustomizationIPSettings ipSettings;
  
  public ManagedObjectReference getNetworkPortGroup() {
    return this.networkPortGroup;
  }
  
  public void setNetworkPortGroup(ManagedObjectReference paramManagedObjectReference) {
    this.networkPortGroup = paramManagedObjectReference;
  }
  
  public CustomizationIPSettings getIpSettings() {
    return this.ipSettings;
  }
  
  public void setIpSettings(CustomizationIPSettings paramCustomizationIPSettings) {
    this.ipSettings = paramCustomizationIPSettings;
  }
}
