package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostAssignableHardwareConfig;
import com.vmware.vim25.HostAssignableHardwareConfigAttributeOverride;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAssignableHardwareConfig", propOrder = {"attributeOverride"})
public class HostAssignableHardwareConfig extends DynamicData {
  protected List<HostAssignableHardwareConfigAttributeOverride> attributeOverride;
  
  public List<HostAssignableHardwareConfigAttributeOverride> getAttributeOverride() {
    if (this.attributeOverride == null)
      this.attributeOverride = new ArrayList<>(); 
    return this.attributeOverride;
  }
}
